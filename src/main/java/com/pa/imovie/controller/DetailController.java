package com.pa.imovie.controller;

import com.pa.imovie.entity.Movie;
import com.pa.imovie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/detail")
public class DetailController {

    @Autowired
    MovieService movieService;

    @GetMapping("/{movie_id}")
    public Movie getMovieById(@PathVariable Integer movie_id) {
        return movieService.getMovieById(movie_id);
    }

}
