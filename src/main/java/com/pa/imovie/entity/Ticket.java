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
    private String ticketWatchtiem;

    private Integer userId;
    private Integer cinemaId;
    private Integer movieId;
    private Integer seatId;
    private Integer cinemaMovieTimeId;

    public Ticket() {
    }

    public Ticket(Integer ticketId, String ticketUuid, String ticketBuytime, String ticketWatchtiem) {
        this.ticketId = ticketId;
        this.ticketUuid = ticketUuid;
        this.ticketBuytime = ticketBuytime;
        this.ticketWatchtiem = ticketWatchtiem;
    }

    public Ticket(Integer ticketId, String ticketUuid, String ticketBuytime, String ticketWatchtiem, Integer userId, Integer cinemaId, Integer movieId, Integer seatId, Integer cinemaMovieTimeId) {
        this.ticketId = ticketId;
        this.ticketUuid = ticketUuid;
        this.ticketBuytime = ticketBuytime;
        this.ticketWatchtiem = ticketWatchtiem;
        this.userId = userId;
        this.cinemaId = cinemaId;
        this.movieId = movieId;
        this.seatId = seatId;
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

    public String getTicketWatchtiem() {
        return ticketWatchtiem;
    }

    public void setTicketWatchtiem(String ticketWatchtiem) {
        this.ticketWatchtiem = ticketWatchtiem;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public Integer getSeatId() {
        return seatId;
    }

    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
    }

    public Integer getCinemaMovieTimeId() {
        return cinemaMovieTimeId;
    }

    public void setCinemaMovieTimeId(Integer cinemaMovieTimeId) {
        this.cinemaMovieTimeId = cinemaMovieTimeId;
    }
}
