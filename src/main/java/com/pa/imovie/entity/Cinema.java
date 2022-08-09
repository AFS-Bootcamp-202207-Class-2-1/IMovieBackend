package com.pa.imovie.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cinema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cinemaId", nullable = false)
    private Integer cinemaId;
    private String cinemaName;
    private String cinemaAddress;
    private String cinemaPhone;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cinemaId")
    private List<CinemaMovie> cinemaMovies;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cinemaId")
    private List<Seat> seats;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cinemaId")
    private List<Ticket> tickets;

    public Cinema() {
    }

    public Cinema(Integer cinemaId, String cinemaName, String cinemaAddress, String cinemaPhone) {
        this.cinemaId = cinemaId;
        this.cinemaName = cinemaName;
        this.cinemaAddress = cinemaAddress;
        this.cinemaPhone = cinemaPhone;
    }

    public Cinema(Integer cinemaId, String cinemaName, String cinemaAddress, String cinemaPhone, List<CinemaMovie> cinemaMovies, List<Seat> seats, List<Ticket> tickets) {
        this.cinemaId = cinemaId;
        this.cinemaName = cinemaName;
        this.cinemaAddress = cinemaAddress;
        this.cinemaPhone = cinemaPhone;
        this.cinemaMovies = cinemaMovies;
        this.seats = seats;
        this.tickets = tickets;
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

    public String getCinemaAddress() {
        return cinemaAddress;
    }

    public void setCinemaAddress(String cinemaAddress) {
        this.cinemaAddress = cinemaAddress;
    }

    public String getCinemaPhone() {
        return cinemaPhone;
    }

    public void setCinemaPhone(String cinemaPhone) {
        this.cinemaPhone = cinemaPhone;
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
