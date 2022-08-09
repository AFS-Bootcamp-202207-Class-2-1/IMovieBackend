package com.pa.imovie.controller;

import com.pa.imovie.dto.CinemaMovieItem;
import com.pa.imovie.service.CinemaMovieTimeService;
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

    @GetMapping("/{movie_id}")
    public List<CinemaMovieItem> getCinemaMovieTimeList(@PathVariable Integer movie_id) {
        return cinemaMovieTimeService.getCinemaMovieTimeListByMovieId(movie_id);
    }



}
