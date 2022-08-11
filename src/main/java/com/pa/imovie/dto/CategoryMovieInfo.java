package com.pa.imovie.dto;

public class CategoryMovieInfo {

    private Integer movieId;
    private String movieName;
    private String movieImage;
    private Double movieScore;

    public CategoryMovieInfo() {
    }

    public CategoryMovieInfo(Integer movieId, String movieName, String movieImage, Double movieScore) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieImage = movieImage;
        this.movieScore = movieScore;
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

    public Double getMovieScore() {
        return movieScore;
    }

    public void setMovieScore(Double movieScore) {
        this.movieScore = movieScore;
    }
}
