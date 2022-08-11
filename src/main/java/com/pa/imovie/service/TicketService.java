package com.pa.imovie.service;

import com.pa.imovie.entity.Seat;
import com.pa.imovie.entity.Ticket;
import com.pa.imovie.repository.SeatRepository;
import com.pa.imovie.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketService {

    @Autowired
    TicketRepository ticketRepository;

    @Autowired
    SeatRepository seatRepository;

    public String deleteTicket(Integer ticketId) {

//      1.通过ticketId找到ticket
        Ticket findTicket = ticketRepository.findById(ticketId).get();
//     2.通过Ticket获取对应的SeatId
        String seatIds = findTicket.getTicketSeatInfo();
        String[] seatIdstrs = seatIds.split(" ");
        List<Integer> seatIdList = new ArrayList<>();
        for (int i = 0; i < seatIdstrs.length; i++) {
            seatIdList.add(Integer.parseInt(seatIdstrs[i]));
        }
//     3.通过seatId把seatReserve为false
        for (int i = 0; i < seatIdList.size(); i++) {
            Seat updateSeat = seatRepository.findById(seatIdList.get(i)).get();
            updateSeat.setSeatReserve(false);
            seatRepository.save(updateSeat);
        }
//     4.删除订单
        if (ticketId != null){
            ticketRepository.deleteById(ticketId);
            return "delete ticket successfully";
        }
        return "Not found ticket";
    }
}
