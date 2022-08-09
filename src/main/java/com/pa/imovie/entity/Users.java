package com.pa.imovie.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usersId", nullable = false)
    private Integer usersId;
    private String usersName;
    private String usersPassword;
    private String usersGender;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "usersId")
    private List<Seat> seats;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "usersId")
    private List<Ticket> tickets;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "usersId")
    private List<Comment> comments;

    public Users() {
    }

    public Users(Integer usersId, String usersName, String usersPassword, String usersGender) {
        this.usersId = usersId;
        this.usersName = usersName;
        this.usersPassword = usersPassword;
        this.usersGender = usersGender;
    }

    public Users(Integer usersId, String usersName, String usersPassword, String usersGender, List<Seat> seats, List<Ticket> tickets) {
        this.usersId = usersId;
        this.usersName = usersName;
        this.usersPassword = usersPassword;
        this.usersGender = usersGender;
        this.seats = seats;
        this.tickets = tickets;
    }

    public Users(Integer usersId, String usersName, String usersPassword, String usersGender, List<Seat> seats, List<Ticket> tickets, List<Comment> comments) {
        this.usersId = usersId;
        this.usersName = usersName;
        this.usersPassword = usersPassword;
        this.usersGender = usersGender;
        this.seats = seats;
        this.tickets = tickets;
        this.comments = comments;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public String getUsersName() {
        return usersName;
    }

    public void setUsersName(String usersName) {
        this.usersName = usersName;
    }

    public String getUsersPassword() {
        return usersPassword;
    }

    public void setUsersPassword(String usersPassword) {
        this.usersPassword = usersPassword;
    }

    public String getUsersGender() {
        return usersGender;
    }

    public void setUsersGender(String usersGender) {
        this.usersGender = usersGender;
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

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
