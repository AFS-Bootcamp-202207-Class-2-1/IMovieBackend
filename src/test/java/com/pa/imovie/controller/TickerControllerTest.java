package com.pa.imovie.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.pa.imovie.entity.*;
import com.pa.imovie.repository.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class TickerControllerTest {

    @Autowired
    MockMvc client;

    @Autowired
    TicketRepository ticketRepository;
    @Autowired
    SeatRepository seatRepository;

    @Autowired
    UsersRepository usersRepository;

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    CinemaRepository cinemaRepository;

    @Autowired
    CinemaMovieTimeRepository cinemaMovieTimeRepository;

    @Autowired
    CinemaMovieRepository cinemaMovieRepository;

    @BeforeEach
    void clean(){
        cinemaMovieRepository.deleteAll();
        ticketRepository.deleteAll();
    }


    @Test
    void should_update_seatReverse_false_and_return_message_delete_ticket_successfully_when_call_deleteTicket_api_given_an_usersId() throws Exception {

        Users users = new Users(1,"wade","123","male");
        Movie movie = new Movie(1,"独行月球"," "," "," "," "," "," ",90,9.5);
        Cinema cinema = new Cinema(1,"OOCl","软件园","1234");
        Users saveUser = usersRepository.save(users);
        Movie saveMovie = movieRepository.save(movie);
        Cinema saveCinema = cinemaRepository.save(cinema);
        CinemaMovie cinemaMovie = new CinemaMovie(1,saveCinema.getCinemaId(),saveMovie.getMovieId());
        CinemaMovie saveCinemaMovie = cinemaMovieRepository.save(cinemaMovie);
        CinemaMovieTime cinemaMovieTime = new CinemaMovieTime(1," "," ",23d,saveCinemaMovie.getCinemaMovieId());
        CinemaMovieTime saveCinemaMovieTime = cinemaMovieTimeRepository.save(cinemaMovieTime);
        Seat seat2 = new Seat(2,"22",2,2,true,saveCinemaMovieTime.getCinemaMovieTimeId(),saveUser.getUsersId());
        Seat seat3 = new Seat(3,"23",2,3,true,saveCinemaMovieTime.getCinemaMovieTimeId(),saveUser.getUsersId());
        Seat saveSeat2 = seatRepository.save(seat2);
        Seat saveSeat3 = seatRepository.save(seat3);
        String seatStrs = saveSeat2.getSeatId() + " " + saveSeat3.getSeatId();
        Ticket ticket = new Ticket(1,"123","2022-08-10",20, seatStrs,saveUser.getUsersId(),saveCinema.getCinemaId(),saveMovie.getMovieId(),saveCinemaMovieTime.getCinemaMovieTimeId());
        Ticket newticket = ticketRepository.save(ticket);
        client.perform(MockMvcRequestBuilders.delete("/ticket/delete/{ticketId}",newticket.getTicketId()))
                        .andExpect(MockMvcResultMatchers.status().isOk())
                        .andExpect(content().string("delete ticket successfully"));

        List<Seat> findSeat = seatRepository.findAll();
        assertThat(findSeat,hasSize(2));
        assertThat(findSeat.get(0).getSeatName(), equalTo("22"));
        assertThat(findSeat.get(0).getSeatRow(), equalTo(2));
        assertThat(findSeat.get(0).getSeatCol(), equalTo(2));
        assertThat(findSeat.get(0).getSeatReserve(), equalTo(false));
        assertThat(findSeat.get(0).getCinemaMovieTimeId(), equalTo(saveCinemaMovieTime.getCinemaMovieTimeId()));
        assertThat(findSeat.get(1).getSeatName(), equalTo("23"));
        assertThat(findSeat.get(1).getSeatRow(), equalTo(2));
        assertThat(findSeat.get(1).getSeatCol(), equalTo(3));
        assertThat(findSeat.get(1).getSeatReserve(), equalTo(false));
        assertThat(findSeat.get(1).getCinemaMovieTimeId(), equalTo(saveCinemaMovieTime.getCinemaMovieTimeId()));

    }

}
