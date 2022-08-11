package com.pa.imovie.entity;

import javax.persistence.*;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticketId", nullable = false)
    private Integer ticketId;
    private String ticketUuid;
    private String ticketBuytime;
    private Integer ticketPrice;
    private String ticketSeatInfo;

    private Integer usersId;
    private Integer cinemaId;
    private Integer movieId;
    private Integer cinemaMovieTimeId;

    public Ticket() {
    }

    public Ticket(Integer ticketId, String ticketUuid, String ticketBuytime, Integer ticketPrice, String ticketSeatInfo) {
        this.ticketId = ticketId;
        this.ticketUuid = ticketUuid;
        this.ticketBuytime = ticketBuytime;
        this.ticketPrice = ticketPrice;
        this.ticketSeatInfo = ticketSeatInfo;
    }

    public Ticket(Integer ticketId, String ticketUuid, String ticketBuytime, Integer ticketPrice, String ticketSeatInfo, Integer usersId, Integer cinemaId, Integer movieId, Integer cinemaMovieTimeId) {
        this.ticketId = ticketId;
        this.ticketUuid = ticketUuid;
        this.ticketBuytime = ticketBuytime;
        this.ticketPrice = ticketPrice;
        this.ticketSeatInfo = ticketSeatInfo;
        this.usersId = usersId;
        this.cinemaId = cinemaId;
        this.movieId = movieId;
        this.cinemaMovieTimeId = cinemaMovieTimeId;
    }

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public String getTicketUuid() {
        return ticketUuid;
    }

    public void setTicketUuid(String ticketUuid) {
        this.ticketUuid = ticketUuid;
    }

    public String getTicketBuytime() {
        return ticketBuytime;
    }

    public void setTicketBuytime(String ticketBuytime) {
        this.ticketBuytime = ticketBuytime;
    }

    public Integer getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Integer ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getTicketSeatInfo() {
        return ticketSeatInfo;
    }

    public void setTicketSeatInfo(String ticketSeatInfo) {
        this.ticketSeatInfo = ticketSeatInfo;
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
}
