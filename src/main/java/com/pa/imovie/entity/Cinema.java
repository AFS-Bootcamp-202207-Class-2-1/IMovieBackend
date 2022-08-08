package com.pa.imovie.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cinema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cinema_id", nullable = false)
    private Integer cinema_id;
    private String cinema_name;
    private String cinema_address;
    private String cinema_phone;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cinema_id")
    private List<CinemaMovie> cinemaMovies;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cinema_id")
    private List<Seat> seats;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cinema_id")
    private List<Ticket> tickets;

    public Cinema() {
    }

    public Cinema(Integer cinema_id, String cinema_name, String cinema_address, String cinema_phone) {
        this.cinema_id = cinema_id;
        this.cinema_name = cinema_name;
        this.cinema_address = cinema_address;
        this.cinema_phone = cinema_phone;
    }

    public Cinema(Integer cinema_id, String cinema_name, String cinema_address, String cinema_phone, List<CinemaMovie> cinemaMovies, List<Seat> seats, List<Ticket> tickets) {
        this.cinema_id = cinema_id;
        this.cinema_name = cinema_name;
        this.cinema_address = cinema_address;
        this.cinema_phone = cinema_phone;
        this.cinemaMovies = cinemaMovies;
        this.seats = seats;
        this.tickets = tickets;
    }

    public Integer getCinema_id() {
        return cinema_id;
    }

    public void setCinema_id(Integer cinema_id) {
        this.cinema_id = cinema_id;
    }

    public String getCinema_name() {
        return cinema_name;
    }

    public void setCinema_name(String cinema_name) {
        this.cinema_name = cinema_name;
    }

    public String getCinema_address() {
        return cinema_address;
    }

    public void setCinema_address(String cinema_address) {
        this.cinema_address = cinema_address;
    }

    public String getCinema_phone() {
        return cinema_phone;
    }

    public void setCinema_phone(String cinema_phone) {
        this.cinema_phone = cinema_phone;
    }

    public List<CinemaMovie> getCinemaMovies() {
        return cinemaMovies;
    }

    public void setCinemaMovies(List<CinemaMovie> cinemaMovies) {
        this.cinemaMovies = cinemaMovies;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

}
