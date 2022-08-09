package com.pa.imovie.controller;

import com.pa.imovie.dto.CinemaMovieItem;
import com.pa.imovie.dto.SeatInfo;
import com.pa.imovie.service.CinemaMovieTimeService;
import com.pa.imovie.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/session")
public class SessionController {

    @Autowired
    CinemaMovieTimeService cinemaMovieTimeService;

    @Autowired
    SeatService seatService;

    @GetMapping("/{movie_id}")
    public List<CinemaMovieItem> getCinemaMovieTimeList(@PathVariable Integer movie_id) {
        return cinemaMovieTimeService.getCinemaMovieTimeListByMovieId(movie_id);
    }

    @GetMapping("/{cinemaMovieTime_id}")
    public List<SeatInfo> getSeatList(@PathVariable Integer cinemaMovieTime_id) {
        return seatService.getAllSeatByCinemaMovieTimeId(cinemaMovieTime_id);
    }

}
