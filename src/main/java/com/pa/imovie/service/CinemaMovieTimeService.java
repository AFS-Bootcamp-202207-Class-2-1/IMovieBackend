package com.pa.imovie.service;

import com.pa.imovie.entity.CinemaMovie;
import com.pa.imovie.entity.CinemaMovieTime;
import com.pa.imovie.repository.CinemaMovieRepository;
import com.pa.imovie.repository.CinemaMovieTimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CinemaMovieTimeService {

    @Autowired
    CinemaMovieRepository cinemaMovieRepository;

    @Autowired
    CinemaMovieTimeRepository cinemaMovieTimeRepository;

    public List<CinemaMovieTime> getCinemaMovieTimeListByMovieId(Integer movie_id) {
        List<CinemaMovie> cinemaMovieList = cinemaMovieRepository.findByMovie_id(movie_id);
        List<CinemaMovieTime> cinemaMovieTimeList = new ArrayList<>();
        for (CinemaMovie cinemaMovie : cinemaMovieList) {
            cinemaMovieTimeList.addAll(cinemaMovieTimeRepository.findByCinemaMovie_id(cinemaMovie.getCinema_id()));
        }
        return cinemaMovieTimeList;
    }

}
