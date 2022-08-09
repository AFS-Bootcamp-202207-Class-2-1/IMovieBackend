package com.pa.imovie.controller;

import com.pa.imovie.dto.BuyInfo;
import com.pa.imovie.dto.SeatInfo;
import com.pa.imovie.entity.Seat;
import com.pa.imovie.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seat")
public class SeatController {

    @Autowired
    SeatService seatService;

    @GetMapping("/{cinemaMovieTime_id}")
    public List<SeatInfo> getSeatList(@PathVariable Integer cinemaMovieTime_id) {
        return seatService.getAllSeatByCinemaMovieTimeId(cinemaMovieTime_id);
    }

    @PostMapping()
    public List<Seat> buySeat(@RequestBody BuyInfo buyInfo) {
        return seatService.buySeat(buyInfo);
    }
}
