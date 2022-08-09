package com.pa.imovie.dto;

public class CinemaMovieItem {

    private Integer cinemaMovieTimeId;
    private String cinemaMovieTimeWatchtime;
    private String cinemaMovieTimeEndtime;
    private Double cinemaMovieTimePrice;
    private Integer cinemaId;
    private String cinemaName;

    public CinemaMovieItem() {
    }

    public CinemaMovieItem(Integer cinemaMovieTimeId, String cinemaMovieTimeWatchtime, String cinemaMovieTimeEndtime, Double cinemaMovieTimePrice, Integer cinemaId, String cinemaName) {
        this.cinemaMovieTimeId = cinemaMovieTimeId;
        this.cinemaMovieTimeWatchtime = cinemaMovieTimeWatchtime;
        this.cinemaMovieTimeEndtime = cinemaMovieTimeEndtime;
        this.cinemaMovieTimePrice = cinemaMovieTimePrice;
        this.cinemaId = cinemaId;
        this.cinemaName = cinemaName;
    }

    public Integer getCinemaMovieTimeId() {
        return cinemaMovieTimeId;
    }

    public void setCinemaMovieTimeId(Integer cinemaMovieTimeId) {
        this.cinemaMovieTimeId = cinemaMovieTimeId;
    }

    public String getCinemaMovieTimeWatchtime() {
        return cinemaMovieTimeWatchtime;
    }

    public void setCinemaMovieTimeWatchtime(String cinemaMovieTimeWatchtime) {
        this.cinemaMovieTimeWatchtime = cinemaMovieTimeWatchtime;
    }

    public String getCinemaMovieTimeEndtime() {
        return cinemaMovieTimeEndtime;
    }

    public void setCinemaMovieTimeEndtime(String cinemaMovieTimeEndtime) {
        this.cinemaMovieTimeEndtime = cinemaMovieTimeEndtime;
    }

    public Double getCinemaMovieTimePrice() {
        return cinemaMovieTimePrice;
    }

    public void setCinemaMovieTimePrice(Double cinemaMovieTimePrice) {
        this.cinemaMovieTimePrice = cinemaMovieTimePrice;
    }

    public Integer getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(Integer cinemaId) {
        this.cinemaId = cinemaId;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }
}
