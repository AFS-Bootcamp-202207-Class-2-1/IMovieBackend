package com.pa.imovie.service;

import com.pa.imovie.dto.*;
import com.pa.imovie.entity.Comment;
import com.pa.imovie.entity.Movie;
import com.pa.imovie.entity.Users;
import com.pa.imovie.repository.MovieRepository;
import com.pa.imovie.repository.UsersRepository;
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

    @Autowired
    UsersRepository usersRepository;

    public MovieDetailInfo getMovieById(Integer movie_id) {
        Movie movie = movieRepository.findById(movie_id).get();
        List<CommentDetailInfo> commentInfoList = new ArrayList<>();
        for (Comment comment : movie.getComments()) {
            Users users = usersRepository.findById(comment.getUsersId()).get();
            commentInfoList.add(new CommentDetailInfo(comment.getCommentId(), comment.getCommentTime(), comment.getCommentContent(), users));
        }
        return new MovieDetailInfo(movie.getMovieId(), movie.getMovieName(), movie.getMovieImage(), movie.getMovieCatagory(), movie.getMoviePerformers(), movie.getMovieIntroduce(), movie.getMovieReleasetime(), movie.getMovieVersion(), movie.getMovieTime(), movie.getMovieScore(), movie.getCinemaMovies(), movie.getDetailImages(), commentInfoList);
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

    public CategoryMoviePageInfo getAllMovieLimited(Integer page, Integer pageSize) {
        List<Movie> allMovieList =  movieRepository.findAll();
        PageRequest pageRequest = PageRequest.of(page - 1, pageSize);
        List<Movie> movieList =  movieRepository.findAll(pageRequest).toList();
        List<CategoryMovieInfo> categoryMovieInfoList = new ArrayList<>();
        for (Movie movie : movieList) {
            categoryMovieInfoList.add(new CategoryMovieInfo(movie.getMovieId(), movie.getMovieName(), movie.getMovieImage(), movie.getMovieScore()));
        }
        return new CategoryMoviePageInfo(allMovieList.size(), categoryMovieInfoList);
    }

    public List<CategoryMovieInfo> findByNameLike(String name, Integer page, Integer pageSize) {
        PageRequest pageRequest = PageRequest.of(page - 1, pageSize);
        List<Movie> movieList = movieRepository.findByMovieNameLike(name, pageRequest);
        List<CategoryMovieInfo> categoryMovieInfoList = new ArrayList<>();
        for (Movie movie : movieList) {
            categoryMovieInfoList.add(new CategoryMovieInfo(movie.getMovieId(), movie.getMovieName(), movie.getMovieImage(), movie.getMovieScore()));
        }
        return categoryMovieInfoList;
    }
}
