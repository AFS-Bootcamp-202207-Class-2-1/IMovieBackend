package com.pa.imovie.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movieId", nullable = false)
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

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "movieId")
    private List<CinemaMovie> cinemaMovies;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "movieId")
    private List<Ticket> tickets;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "movieId")
    private List<DetailImage> detailImages;

    public Movie() {
    }

    public Movie(Integer movieId, String movieName, String movieImage, String movieCatagory, String moviePerformers, String movieIntroduce, String movieReleasetime, String movieVersion, Integer movieTime, Double movieScore) {
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
    }

    public Movie(Integer movieId, String movieName, String movieImage, String movieCatagory, String moviePerformers, String movieIntroduce, String movieReleasetime, String movieVersion, Integer movieTime, Double movieScore, List<CinemaMovie> cinemaMovies, List<Ticket> tickets, List<DetailImage> detailImages) {
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
        this.tickets = tickets;
        this.detailImages = detailImages;
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

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public List<DetailImage> getDetailImages() {
        return detailImages;
    }

    public void setDetailImages(List<DetailImage> detailImages) {
        this.detailImages = detailImages;
    }
}