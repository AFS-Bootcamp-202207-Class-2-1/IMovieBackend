package com.pa.imovie.controller;


import com.pa.imovie.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/delete/{usersId}")
    public String deleteTicket(@PathVariable Integer usersId){
        return orderService.deleteOrder;
    }


}
