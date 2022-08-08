package com.pa.imovie.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class CinemaMovieTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cinemaMovieTime_id", nullable = false)
    private Integer cinemaMovieTime_id;
    private String cinemaMovieTime_watchtime;
    private Double cinemaMovieTime_price;

    private Integer cinemaMovie_id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cinemaMovieTime_id")
    private List<Ticket> tickets;

    public CinemaMovieTime() {
    }

    public CinemaMovieTime(Integer cinemaMovieTime_id, String cinemaMovieTime_watchtime, Double cinemaMovieTime_price) {
        this.cinemaMovieTime_id = cinemaMovieTime_id;
        this.cinemaMovieTime_watchtime = cinemaMovieTime_watchtime;
        this.cinemaMovieTime_price = cinemaMovieTime_price;
    }

    public CinemaMovieTime(Integer cinemaMovieTime_id, Integer cinemaMovie_id, String cinemaMovieTime_watchtime, Double cinemaMovie_price) {
        this.cinemaMovieTime_id = cinemaMovieTime_id;
        this.cinemaMovie_id = cinemaMovie_id;
        this.cinemaMovieTime_watchtime = cinemaMovieTime_watchtime;
        this.cinemaMovieTime_price = cinemaMovie_price;
    }

    public CinemaMovieTime(Integer cinemaMovieTime_id, String cinemaMovieTime_watchtime, Double cinemaMovie_price, Integer cinemaMovie_id, List<Ticket> tickets) {
        this.cinemaMovieTime_id = cinemaMovieTime_id;
        this.cinemaMovieTime_watchtime = cinemaMovieTime_watchtime;
        this.cinemaMovieTime_price = cinemaMovie_price;
        this.cinemaMovie_id = cinemaMovie_id;
        this.tickets = tickets;
    }

    public Integer getCinemaMovieTime_id() {
        return cinemaMovieTime_id;
    }

    public void setCinemaMovieTime_id(Integer cinemaMovieTime_id) {
        this.cinemaMovieTime_id = cinemaMovieTime_id;
    }

    public Integer getCinemaMovie_id() {
        return cinemaMovie_id;
    }

    public void setCinemaMovie_id(Integer cinemaMovie_id) {
        this.cinemaMovie_id = cinemaMovie_id;
    }

    public String getCinemaMovieTime_watchtime() {
        return cinemaMovieTime_watchtime;
    }

    public void setCinemaMovieTime_watchtime(String cinemaMovieTime_watchtime) {
        this.cinemaMovieTime_watchtime = cinemaMovieTime_watchtime;
    }

    public Double getCinemaMovieTime_price() {
        return cinemaMovieTime_price;
    }

    public void setCinemaMovieTime_price(Double cinemaMovieTime_price) {
        this.cinemaMovieTime_price = cinemaMovieTime_price;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

}
