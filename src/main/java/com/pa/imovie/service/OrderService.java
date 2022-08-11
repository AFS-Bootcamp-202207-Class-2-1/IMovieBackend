package com.pa.imovie.service;

import com.pa.imovie.dto.BuyInfo;
import com.pa.imovie.dto.TicketOrderInfo;
import com.pa.imovie.entity.*;
import com.pa.imovie.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class OrderService {

    @Autowired
    TicketRepository ticketRepository;

    @Autowired
    UsersRepository usersRepository;

    @Autowired
    CinemaMovieTimeRepository cinemaMovieTimeRepository;

    @Autowired
    CinemaRepository cinemaRepository;

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    SeatRepository seatRepository;

    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public Ticket addTicket(BuyInfo buyInfo) {
        String uuid = UUID.randomUUID().toString();
        uuid = uuid.replace("-", "");
        String seatStr = "";
        for (Integer seatId : buyInfo.getBoughtSeatIdList()) {
            seatStr += seatId + " ";
        }
        Ticket ticket = ticketRepository.save(new Ticket(0, uuid, sdf.format(new Date()), buyInfo.getTicketPrice(), seatStr, buyInfo.getUsersId(), buyInfo.getCinemaId(), buyInfo.getMovieId(), buyInfo.getCinemaMovieTimeId()));
        return ticket;
    }

    public List<TicketOrderInfo> getTicketByUsersId(Integer usersId) {
        Users users =  usersRepository.findById(usersId).get();
        List<Ticket> ticketList = users.getTickets();
        List<TicketOrderInfo> ticketOrderInfoList = new ArrayList<>();
        for (Ticket ticket : ticketList) {
            Cinema cinema = cinemaRepository.findById(ticket.getCinemaId()).get();
            Movie movie = movieRepository.findById(ticket.getMovieId()).get();
            CinemaMovieTime cinemaMovieTime = cinemaMovieTimeRepository.findById(ticket.getCinemaMovieTimeId()).get();
            String[] seatStrs = ticket.getTicketSeatInfo().split(" ");
            String seatret = "";
            for (int i = 0; i < seatStrs.length; i++) {
                Seat seat = seatRepository.findById(Integer.parseInt(seatStrs[i])).get();
                seat.setSeatRow(seat.getSeatRow() + 1);
                seat.setSeatCol(seat.getSeatCol() + 1);
                seatret += seat.getSeatRow() + "排" + seat.getSeatCol() + "座 ";
            }
            ticketOrderInfoList.add(new TicketOrderInfo(movie.getMovieId(), ticket.getTicketId(), movie.getMovieImage(), movie.getMovieName(), ticket.getTicketBuytime(), ticket.getTicketUuid(), ticket.getTicketPrice(), cinema.getCinemaAddress(), cinema.getCinemaName(), cinemaMovieTime.getCinemaMovieTimeWatchtime(), seatret));
        }
        Collections.reverse(ticketOrderInfoList);
        return ticketOrderInfoList;
    }
}
