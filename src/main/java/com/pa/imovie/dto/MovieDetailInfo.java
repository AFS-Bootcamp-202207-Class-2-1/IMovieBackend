package com.pa.imovie.dto;

import com.pa.imovie.entity.CinemaMovie;
import com.pa.imovie.entity.DetailImage;

import java.util.List;

public class MovieDetailInfo {

    private Integer movieId;
    private String movieName;
    private String movieImage;
    private String movieCatagory;
    private String moviePerformers;
    private String movieIntroduce;
    private String movieReleasetime;
    private String movieVersion;
    private Integer movieTime;
    private Double movieScore;
    private List<CinemaMovie> cinemaMovies;
    private List<DetailImage> detailImages;
    private List<CommentInfo> comments;

    public MovieDetailInfo() {
    }

    public MovieDetailInfo(Integer movieId, String movieName, String movieImage, String movieCatagory, String moviePerformers, String movieIntroduce, String movieReleasetime, String movieVersion, Integer movieTime, Double movieScore, List<CinemaMovie> cinemaMovies, List<DetailImage> detailImages, List<CommentInfo> comments) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieImage = movieImage;
        this.movieCatagory = movieCatagory;
        this.moviePerformers = moviePerformers;
        this.movieIntroduce = movieIntroduce;
        this.movieReleasetime = movieReleasetime;
        this.movieVersion = movieVersion;
        this.movieTime = movieTime;
        this.movieScore = movieScore;
        this.cinemaMovies = cinemaMovies;
        this.detailImages = detailImages;
        this.comments = comments;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieImage() {
        return movieImage;
    }

    public void setMovieImage(String movieImage) {
        this.movieImage = movieImage;
    }

    public String getMovieCatagory() {
        return movieCatagory;
    }

    public void setMovieCatagory(String movieCatagory) {
        this.movieCatagory = movieCatagory;
    }

    public String getMoviePerformers() {
        return moviePerformers;
    }

    public void setMoviePerformers(String moviePerformers) {
        this.moviePerformers = moviePerformers;
    }

    public String getMovieIntroduce() {
        return movieIntroduce;
    }

    public void setMovieIntroduce(String movieIntroduce) {
        this.movieIntroduce = movieIntroduce;
    }

    public String getMovieReleasetime() {
        return movieReleasetime;
    }

    public void setMovieReleasetime(String movieReleasetime) {
        this.movieReleasetime = movieReleasetime;
    }

    public String getMovieVersion() {
        return movieVersion;
    }

    public void setMovieVersion(String movieVersion) {
        this.movieVersion = movieVersion;
    }

    public Integer getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(Integer movieTime) {
        this.movieTime = movieTime;
    }

    public Double getMovieScore() {
        return movieScore;
    }

    public void setMovieScore(Double movieScore) {
        this.movieScore = movieScore;
    }

    public List<CinemaMovie> getCinemaMovies() {
        return cinemaMovies;
    }

    public void setCinemaMovies(List<CinemaMovie> cinemaMovies) {
        this.cinemaMovies = cinemaMovies;
    }

    public List<DetailImage> getDetailImages() {
        return detailImages;
    }

    public void setDetailImages(List<DetailImage> detailImages) {
        this.detailImages = detailImages;
    }

    public List<CommentInfo> getComments() {
        return comments;
    }

    public void setComments(List<CommentInfo> comments) {
        this.comments = comments;
    }
}
