package com.pa.imovie.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class CinemaMovie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cinemaMovieId", nullable = false)
    private Integer cinemaMovieId;

    private Integer cinemaId;
    private Integer movieId;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cinemaMovieId")
    private List<CinemaMovieTime> cinemaMovieTimes;

    public CinemaMovie() {
    }

    public CinemaMovie(Integer cinemaMovieId) {
        this.cinemaMovieId = cinemaMovieId;
    }

    public CinemaMovie(Integer cinemaMovieId, Integer cinemaId, Integer movieId) {
        this.cinemaMovieId = cinemaMovieId;
        this.cinemaId = cinemaId;
        this.movieId = movieId;
    }

    public CinemaMovie(Integer cinemaMovieId, Integer cinemaId, Integer movieId, List<CinemaMovieTime> cinemaMovieTimes) {
        this.cinemaMovieId = cinemaMovieId;
        this.cinemaId = cinemaId;
        this.movieId = movieId;
        this.cinemaMovieTimes = cinemaMovieTimes;
    }

    public Integer getCinemaMovieId() {
        return cinemaMovieId;
    }

    public void setCinemaMovieId(Integer cinemaMovieId) {
        this.cinemaMovieId = cinemaMovieId;
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

    public List<CinemaMovieTime> getCinemaMovieTimes() {
        return cinemaMovieTimes;
    }

    public void setCinemaMovieTimes(List<CinemaMovieTime> cinemaMovieTimes) {
        this.cinemaMovieTimes = cinemaMovieTimes;
    }
}
