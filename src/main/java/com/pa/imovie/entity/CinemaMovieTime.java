package com.pa.imovie.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class CinemaMovieTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cinemaMovieTimeId", nullable = false)
    private Integer cinemaMovieTimeId;
    private String cinemaMovieTimeWatchtime;
    private String cinemaMovieTimeEndtime;
    private Double cinemaMovieTimePrice;

    private Integer cinemaMovieId;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cinemaMovieTimeId")
    private List<Ticket> tickets;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cinemaMovieTimeId")
    private List<Seat> seats;

    public CinemaMovieTime() {
    }

    public CinemaMovieTime(Integer cinemaMovieTimeId, String cinemaMovieTimeWatchtime, String cinemaMovieTimeEndtime, Double cinemaMovieTimePrice) {
        this.cinemaMovieTimeId = cinemaMovieTimeId;
        this.cinemaMovieTimeWatchtime = cinemaMovieTimeWatchtime;
        this.cinemaMovieTimeEndtime = cinemaMovieTimeEndtime;
        this.cinemaMovieTimePrice = cinemaMovieTimePrice;
    }

    public CinemaMovieTime(Integer cinemaMovieTimeId, String cinemaMovieTimeWatchtime, String cinemaMovieTimeEndtime, Double cinemaMovieTimePrice, Integer cinemaMovieId) {
        this.cinemaMovieTimeId = cinemaMovieTimeId;
        this.cinemaMovieTimeWatchtime = cinemaMovieTimeWatchtime;
        this.cinemaMovieTimeEndtime = cinemaMovieTimeEndtime;
        this.cinemaMovieTimePrice = cinemaMovieTimePrice;
        this.cinemaMovieId = cinemaMovieId;
    }

    public CinemaMovieTime(Integer cinemaMovieTimeId, String cinemaMovieTimeWatchtime, String cinemaMovieTimeEndtime, Double cinemaMovieTimePrice, Integer cinemaMovieId, List<Ticket> tickets, List<Seat> seats) {
        this.cinemaMovieTimeId = cinemaMovieTimeId;
        this.cinemaMovieTimeWatchtime = cinemaMovieTimeWatchtime;
        this.cinemaMovieTimeEndtime = cinemaMovieTimeEndtime;
        this.cinemaMovieTimePrice = cinemaMovieTimePrice;
        this.cinemaMovieId = cinemaMovieId;
        this.tickets = tickets;
        this.seats = seats;
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

    public Integer getCinemaMovieId() {
        return cinemaMovieId;
    }

    public void setCinemaMovieId(Integer cinemaMovieId) {
        this.cinemaMovieId = cinemaMovieId;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
}
