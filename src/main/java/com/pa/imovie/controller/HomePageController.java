package com.pa.imovie.controller;

import com.pa.imovie.dto.HomeMovieInfo;
import com.pa.imovie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomePageController {
    @Autowired
    MovieService movieService;
    @GetMapping("movieInfo")
    public List<HomeMovieInfo> getHomePageMovie(){
        return movieService.getHomePageMovie();
    }
}
