package com.pa.imovie.dto;

public class HomeMovieInfo {
    private int movieId;
    private String movieName;
    private String movieIntroduce;
    private String movieImage;
    private Double movieScore;

    public HomeMovieInfo() {
    }

    public HomeMovieInfo(int movieId, String movieName, String movieIntroduce, String movieImage, Double movieScore) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieIntroduce = movieIntroduce;
        this.movieImage = movieImage;
        this.movieScore = movieScore;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieIntroduce() {
        return movieIntroduce;
    }

    public void setMovieIntroduce(String movieIntroduce) {
        this.movieIntroduce = movieIntroduce;
    }

    public String getMovieImage() {
        return movieImage;
    }

    public void setMovieImage(String movieImage) {
        this.movieImage = movieImage;
    }

    public Double getMovieScore() {
        return movieScore;
    }

    public void setMovieScore(Double movieScore) {
        this.movieScore = movieScore;
    }
}
