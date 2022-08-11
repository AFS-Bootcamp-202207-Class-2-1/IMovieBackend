package com.pa.imovie.controller;

import com.pa.imovie.dto.TicketOrderInfo;
import com.pa.imovie.entity.Ticket;
import com.pa.imovie.service.OrderService;
import com.pa.imovie.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    TicketService ticketService;

    @Autowired
    OrderService orderService;

    @GetMapping("/{usersId}")
    public List<TicketOrderInfo> getTicketByUsersId(@PathVariable Integer usersId){
        return orderService.getTicketByUsersId(usersId);
    }

    @GetMapping("/delete/{ticketId}")
    public String deleteOrder(@PathVariable Integer ticketId){
        return ticketService.deleteTicket(ticketId);
    }

}
