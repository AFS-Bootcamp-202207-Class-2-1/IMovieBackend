package com.pa.imovie.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class CinemaMovie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cinemaMovie_id", nullable = false)
    private Integer cinemaMovie_id;

    private Integer cinema_id;
    private Integer movie_id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cinemaMovie_id")
    private List<CinemaMovieTime> cinemaMovieTimes;

    public CinemaMovie() {
    }

    public CinemaMovie(Integer cinemaMovie_id, Integer cinema_id, Integer movie_id) {
        this.cinemaMovie_id = cinemaMovie_id;
        this.cinema_id = cinema_id;
        this.movie_id = movie_id;
    }

    public CinemaMovie(Integer cinemaMovie_id, Integer cinema_id, Integer movie_id, List<CinemaMovieTime> cinemaMovieTimes) {
        this.cinemaMovie_id = cinemaMovie_id;
        this.cinema_id = cinema_id;
        this.movie_id = movie_id;
        this.cinemaMovieTimes = cinemaMovieTimes;
    }

    public Integer getCinemaMovie_id() {
        return cinemaMovie_id;
    }

    public void setCinemaMovie_id(Integer cinemaMovie_id) {
        this.cinemaMovie_id = cinemaMovie_id;
    }

    public Integer getCinema_id() {
        return cinema_id;
    }

    public void setCinema_id(Integer cinema_id) {
        this.cinema_id = cinema_id;
    }

    public Integer getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(Integer movie_id) {
        this.movie_id = movie_id;
    }

    public List<CinemaMovieTime> getCinemaMovieTimes() {
        return cinemaMovieTimes;
    }

    public void setCinemaMovieTimes(List<CinemaMovieTime> cinemaMovieTimes) {
        this.cinemaMovieTimes = cinemaMovieTimes;
    }

}
