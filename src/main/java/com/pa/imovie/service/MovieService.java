package com.pa.imovie.service;

import com.pa.imovie.dto.CategoryMovieInfo;
import com.pa.imovie.dto.HomeMovieInfo;
import com.pa.imovie.entity.Movie;
import com.pa.imovie.entity.MovieCategory;
import com.pa.imovie.repository.MovieRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public Movie getMovieById(Integer movie_id) {
        return movieRepository.findById(movie_id).get();
    }

    public List<HomeMovieInfo> getHomePageMovie() {
        List<Movie> movieList = movieRepository.findAll();
        List<HomeMovieInfo> homeMovieInfos = new ArrayList<>();
        AtomicInteger movieCount = new AtomicInteger();
        movieList.stream().forEach((movie) -> {
            if (movieCount.get() < 6){
                HomeMovieInfo homeMovieInfo = new HomeMovieInfo();
                BeanUtils.copyProperties(movie, homeMovieInfo);
                homeMovieInfos.add(homeMovieInfo);
                movieCount.getAndIncrement();
            }
            return;
        });
        return homeMovieInfos;
    }

    public List<CategoryMovieInfo> getAllMovie() {
        return null;
//        List<CategoryMovieInfo> categoryMovieInfoList = new ArrayList<>();
//        movieRepository.findAll();
//        for () {
//
//        }
//        return movieRepository.findAll();
    }

    public List<CategoryMovieInfo> getAllMovieLimited(Integer page, Integer pageSize) {
        PageRequest pageRequest = PageRequest.of(page - 1, pageSize);
        List<Movie> movieList =  movieRepository.findAll(pageRequest).toList();
        List<CategoryMovieInfo> categoryMovieInfoList = new ArrayList<>();
        for (Movie movie : movieList) {
            categoryMovieInfoList.add(new CategoryMovieInfo(movie.getMovieId(), movie.getMovieName(), movie.getMovieImage(), movie.getMovieScore()));
        }
        return categoryMovieInfoList;
    }
}
