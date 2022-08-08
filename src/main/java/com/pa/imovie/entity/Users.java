package com.pa.imovie.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "users_id", nullable = false)
    private Integer users_id;
    private String users_name;
    private String users_password;
    private String users_gender;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "users_id")
    private List<Seat> seats;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "users_id")
    private List<Ticket> tickets;

    public Users() {
    }

    public Users(Integer users_id, String users_name, String users_password, String users_gender) {
        this.users_id = users_id;
        this.users_name = users_name;
        this.users_password = users_password;
        this.users_gender = users_gender;
    }

    public Users(Integer users_id, String users_name, String users_password, String users_gender, List<Seat> seats, List<Ticket> tickets) {
        this.users_id = users_id;
        this.users_name = users_name;
        this.users_password = users_password;
        this.users_gender = users_gender;
        this.seats = seats;
        this.tickets = tickets;
    }

    public Integer getUsers_id() {
        return users_id;
    }

    public void setUsers_id(Integer users_id) {
        this.users_id = users_id;
    }

    public String getUsers_name() {
        return users_name;
    }

    public void setUsers_name(String users_name) {
        this.users_name = users_name;
    }

    public String getUsers_password() {
        return users_password;
    }

    public void setUsers_password(String users_password) {
        this.users_password = users_password;
    }

    public String getUsers_gender() {
        return users_gender;
    }

    public void setUsers_gender(String users_gender) {
        this.users_gender = users_gender;
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
