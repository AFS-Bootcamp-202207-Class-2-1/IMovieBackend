package com.pa.imovie.dto;

import java.util.List;

public class BuyInfo {

    private Integer usersId;
    private Integer cinemaId;
    private Integer movieId;
    private Integer cinemaMovieTimeId;
    private List<Integer> boughtSeatIdList;

    public BuyInfo() {
    }

    public BuyInfo(Integer usersId, Integer cinemaId, Integer movieId, Integer cinemaMovieTimeId, List<Integer> boughtSeatIdList) {
        this.usersId = usersId;
        this.cinemaId = cinemaId;
        this.movieId = movieId;
        this.cinemaMovieTimeId = cinemaMovieTimeId;
        this.boughtSeatIdList = boughtSeatIdList;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public Integer getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(Integer cinemaId) {
        this.cinemaId = cinemaId;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public Integer getCinemaMovieTimeId() {
        return cinemaMovieTimeId;
    }

    public void setCinemaMovieTimeId(Integer cinemaMovieTimeId) {
        this.cinemaMovieTimeId = cinemaMovieTimeId;
    }

    public List<Integer> getBoughtSeatIdList() {
        return boughtSeatIdList;
    }

    public void setBoughtSeatIdList(List<Integer> boughtSeatIdList) {
        this.boughtSeatIdList = boughtSeatIdList;
    }
}
