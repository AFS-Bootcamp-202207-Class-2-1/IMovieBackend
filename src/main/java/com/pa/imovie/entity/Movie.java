package com.pa.imovie.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id", nullable = false)
    private Integer movie_id;
    private String movie_name;
    private String movie_image;
    private String movie_performers;
    private String movie_introduce;
    private String movie_releasetime;
    private Integer movie_time;
    private Double movie_score;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "movie_id")
    private List<CinemaMovie> cinemaMovies;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "movie_id")
    private List<Ticket> tickets;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "movie_id")
    private List<BannerImage> bannerImages;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "movie_id")
    private List<DetailImage> detailImages;

    public Movie() {
    }

    public Movie(Integer movie_id, String movie_name, String movie_image, String movie_performers, String movie_introduce, String movie_releasetime, Integer movie_time, Double movie_score) {
        this.movie_id = movie_id;
        this.movie_name = movie_name;
        this.movie_image = movie_image;
        this.movie_performers = movie_performers;
        this.movie_introduce = movie_introduce;
        this.movie_releasetime = movie_releasetime;
        this.movie_time = movie_time;
        this.movie_score = movie_score;
    }

    public Movie(Integer movie_id, String movie_name, String movie_image, String movie_performers, String movie_introduce, String movie_releasetime, Integer movie_time, Double movie_score, List<CinemaMovie> cinemaMovies, List<Ticket> tickets, List<BannerImage> bannerImages, List<DetailImage> detailImages) {
        this.movie_id = movie_id;
        this.movie_name = movie_name;
        this.movie_image = movie_image;
        this.movie_performers = movie_performers;
        this.movie_introduce = movie_introduce;
        this.movie_releasetime = movie_releasetime;
        this.movie_time = movie_time;
        this.movie_score = movie_score;
        this.cinemaMovies = cinemaMovies;
        this.tickets = tickets;
        this.bannerImages = bannerImages;
        this.detailImages = detailImages;
    }

    public Integer getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(Integer movie_id) {
        this.movie_id = movie_id;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getMovie_image() {
        return movie_image;
    }

    public void setMovie_image(String movie_image) {
        this.movie_image = movie_image;
    }

    public String getMovie_performers() {
        return movie_performers;
    }

    public void setMovie_performers(String movie_performers) {
        this.movie_performers = movie_performers;
    }

    public String getMovie_introduce() {
        return movie_introduce;
    }

    public void setMovie_introduce(String movie_introduce) {
        this.movie_introduce = movie_introduce;
    }

    public String getMovie_releasetime() {
        return movie_releasetime;
    }

    public void setMovie_releasetime(String movie_releasetime) {
        this.movie_releasetime = movie_releasetime;
    }

    public Integer getMovie_time() {
        return movie_time;
    }

    public void setMovie_time(Integer movie_time) {
        this.movie_time = movie_time;
    }

    public Double getMovie_score() {
        return movie_score;
    }

    public void setMovie_score(Double movie_score) {
        this.movie_score = movie_score;
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

    public List<BannerImage> getBannerImages() {
        return bannerImages;
    }

    public void setBannerImages(List<BannerImage> bannerImages) {
        this.bannerImages = bannerImages;
    }

    public List<DetailImage> getDetailImages() {
        return detailImages;
    }

    public void setDetailImages(List<DetailImage> detailImages) {
        this.detailImages = detailImages;
    }
}
