package com.pa.imovie.entity;

import javax.persistence.*;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_id", nullable = false)
    private Integer ticket_id;
    private String ticket_uuid;
    private String ticket_buytime;
    private String ticket_watchtiem;

    private Integer user_id;
    private Integer cinema_id;
    private Integer movie_id;
    private Integer seat_id;
    private Integer cinemaMovieTime_id;

    public Ticket() {
    }

    public Ticket(Integer ticket_id, String ticket_uuid, String ticket_buytime, String ticket_watchtiem) {
        this.ticket_id = ticket_id;
        this.ticket_uuid = ticket_uuid;
        this.ticket_buytime = ticket_buytime;
        this.ticket_watchtiem = ticket_watchtiem;
    }

    public Ticket(Integer ticket_id, String ticket_uuid, Integer user_id, Integer cinema_id, Integer movie_id, Integer seat_id, Integer cinemaMovieTime_id, String ticket_buytime, String ticket_watchtiem) {
        this.ticket_id = ticket_id;
        this.ticket_uuid = ticket_uuid;
        this.user_id = user_id;
        this.cinema_id = cinema_id;
        this.movie_id = movie_id;
        this.seat_id = seat_id;
        this.cinemaMovieTime_id = cinemaMovieTime_id;
        this.ticket_buytime = ticket_buytime;
        this.ticket_watchtiem = ticket_watchtiem;
    }

    public Integer getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(Integer ticket_id) {
        this.ticket_id = ticket_id;
    }

    public String getTicket_uuid() {
        return ticket_uuid;
    }

    public void setTicket_uuid(String ticket_uuid) {
        this.ticket_uuid = ticket_uuid;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
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

    public Integer getSeat_id() {
        return seat_id;
    }

    public void setSeat_id(Integer seat_id) {
        this.seat_id = seat_id;
    }

    public Integer getCinemaMovieTime_id() {
        return cinemaMovieTime_id;
    }

    public void setCinemaMovieTime_id(Integer cinemaMovieTime_id) {
        this.cinemaMovieTime_id = cinemaMovieTime_id;
    }

    public String getTicket_buytime() {
        return ticket_buytime;
    }

    public void setTicket_buytime(String ticket_buytime) {
        this.ticket_buytime = ticket_buytime;
    }

    public String getTicket_watchtiem() {
        return ticket_watchtiem;
    }

    public void setTicket_watchtiem(String ticket_watchtiem) {
        this.ticket_watchtiem = ticket_watchtiem;
    }

}
