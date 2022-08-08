package com.pa.imovie.service;

import com.pa.imovie.entity.Movie;
import com.pa.imovie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public Movie getMovieById(Integer movie_id) {
        return movieRepository.findById(movie_id).get();
    }

}
