package com.pa.imovie.dto;

public class HomeMovieInfo {
    private int movie_id;
    private String movie_name;
    private String movie_introduce;
    private String movie_image;
    private Double movie_score;

    public HomeMovieInfo() {
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getMovie_introduce() {
        return movie_introduce;
    }

    public void setMovie_introduce(String movie_introduce) {
        this.movie_introduce = movie_introduce;
    }

    public String getMovie_image() {
        return movie_image;
    }

    public void setMovie_image(String movie_image) {
        this.movie_image = movie_image;
    }

    public Double getMovie_score() {
        return movie_score;
    }

    public void setMovie_score(Double movie_score) {
        this.movie_score = movie_score;
    }

    public HomeMovieInfo(int movie_id, String movie_name, String movie_introduce, String movie_image, Double movie_score) {
        this.movie_id = movie_id;
        this.movie_name = movie_name;
        this.movie_introduce = movie_introduce;
        this.movie_image = movie_image;
        this.movie_score = movie_score;
    }
}
