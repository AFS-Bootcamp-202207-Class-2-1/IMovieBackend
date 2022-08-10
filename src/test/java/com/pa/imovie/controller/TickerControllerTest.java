package com.pa.imovie.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.pa.imovie.entity.Seat;
import com.pa.imovie.entity.Ticket;
import com.pa.imovie.entity.Users;
import com.pa.imovie.repository.SeatRepository;
import com.pa.imovie.repository.TicketRepository;

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

    @BeforeEach
    void clean(){
        ticketRepository.deleteAll();
    }


//    @Test
//    void should_update_seatReverse_false_and_return_message_delete_ticket_successfully_when_call_deleteTicket_api_given_an_usersId() throws Exception {
//
//
//        Ticket newticket = new Ticket(1,"1","2022-08-10","2022-08-11",1,1,1,1,90);
//        Seat seat = new Seat(1,"21",2,1,true,90,1,newticket);
//        seatRepository.save(seat);
//        Ticket ticket = ticketRepository.save(newticket);;
//
//        client.perform(MockMvcRequestBuilders.get("/ticket/delete/{usersId}",ticket.getUsersId()))
//                        .andExpect(MockMvcResultMatchers.status().isOk())
//                        .andExpect(content().string("delete ticket successfully"));
//
//        List<Seat> findSeat = seatRepository.findAll();
//        assertThat(findSeat,hasSize(1));
//        assertThat(findSeat.get(0).getSeatId(), equalTo("1"));
//        assertThat(findSeat.get(0).getSeatName(), equalTo("21"));
//        assertThat(findSeat.get(0).getSeatRow(), equalTo("2"));
//        assertThat(findSeat.get(0).getSeatCol(), equalTo("1"));
//        assertThat(findSeat.get(0).getSeatReserve(), equalTo("false"));
//        assertThat(findSeat.get(0).getCinemaMovieTimeId(), equalTo("90"));
//        assertThat(findSeat.get(0).getUsersPassword(), equalTo("abc"));
//        assertThat(findSeat.get(0).getUsersPassword(), equalTo("abc"));
//
//    }

}
