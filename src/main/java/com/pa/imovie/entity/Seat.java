package com.pa.imovie.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seat_id", nullable = false)
    private Integer seat_id;
    private String seat_name;
    private Integer seat_row;
    private Integer seat_col;
    private Boolean seat_reserve;

    private Integer cinema_id;
    private Integer user_id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "seat_id")
    private List<Ticket> tickets;

    public Seat() {
    }

    public Seat(Integer seat_id, String seat_name, Integer seat_row, Integer seat_col, Boolean seat_reserve) {
        this.seat_id = seat_id;
        this.seat_name = seat_name;
        this.seat_row = seat_row;
        this.seat_col = seat_col;
        this.seat_reserve = seat_reserve;
    }

    public Seat(Integer seat_id, String seat_name, Integer seat_row, Integer seat_col, Integer cinema_id, Integer user_id, Boolean seat_reserve) {
        this.seat_id = seat_id;
        this.seat_name = seat_name;
        this.seat_row = seat_row;
        this.seat_col = seat_col;
        this.cinema_id = cinema_id;
        this.user_id = user_id;
        this.seat_reserve = seat_reserve;
    }

    public Seat(Integer seat_id, String seat_name, Integer seat_row, Integer seat_col, Boolean seat_reserve, Integer cinema_id, Integer user_id, List<Ticket> tickets) {
        this.seat_id = seat_id;
        this.seat_name = seat_name;
        this.seat_row = seat_row;
        this.seat_col = seat_col;
        this.seat_reserve = seat_reserve;
        this.cinema_id = cinema_id;
        this.user_id = user_id;
        this.tickets = tickets;
    }

    public Integer getSeat_id() {
        return seat_id;
    }

    public void setSeat_id(Integer seat_id) {
        this.seat_id = seat_id;
    }

    public String getSeat_name() {
        return seat_name;
    }

    public void setSeat_name(String seat_name) {
        this.seat_name = seat_name;
    }

    public Integer getSeat_row() {
        return seat_row;
    }

    public void setSeat_row(Integer seat_row) {
        this.seat_row = seat_row;
    }

    public Integer getSeat_col() {
        return seat_col;
    }

    public void setSeat_col(Integer seat_col) {
        this.seat_col = seat_col;
    }

    public Integer getCinema_id() {
        return cinema_id;
    }

    public void setCinema_id(Integer cinema_id) {
        this.cinema_id = cinema_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Boolean getSeat_reserve() {
        return seat_reserve;
    }

    public void setSeat_reserve(Boolean seat_reserve) {
        this.seat_reserve = seat_reserve;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

}
