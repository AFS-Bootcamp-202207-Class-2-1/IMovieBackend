package com.pa.imovie.entity;

import javax.persistence.*;

@Entity
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seatId", nullable = false)
    private Integer seatId;
    private String seatName;
    private Integer seatRow;
    private Integer seatCol;
    private Boolean seatReserve;

    private Integer cinemaMovieTimeId;
    private Integer usersId;

    @OneToOne
    @JoinColumn(name = "seatId")
    private Ticket ticket;

    public Seat() {
    }

    public Seat(Integer seatId, String seatName, Integer seatRow, Integer seatCol, Boolean seatReserve) {
        this.seatId = seatId;
        this.seatName = seatName;
        this.seatRow = seatRow;
        this.seatCol = seatCol;
        this.seatReserve = seatReserve;
    }

    public Seat(Integer seatId, String seatName, Integer seatRow, Integer seatCol, Boolean seatReserve, Integer cinemaMovieTimeId, Integer usersId) {
        this.seatId = seatId;
        this.seatName = seatName;
        this.seatRow = seatRow;
        this.seatCol = seatCol;
        this.seatReserve = seatReserve;
        this.cinemaMovieTimeId = cinemaMovieTimeId;
        this.usersId = usersId;
    }

    public Seat(Integer seatId, String seatName, Integer seatRow, Integer seatCol, Boolean seatReserve, Integer cinemaMovieTimeId, Integer usersId, Ticket ticket) {
        this.seatId = seatId;
        this.seatName = seatName;
        this.seatRow = seatRow;
        this.seatCol = seatCol;
        this.seatReserve = seatReserve;
        this.cinemaMovieTimeId = cinemaMovieTimeId;
        this.usersId = usersId;
        this.ticket = ticket;
    }

    public Integer getSeatId() {
        return seatId;
    }

    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
    }

    public String getSeatName() {
        return seatName;
    }

    public void setSeatName(String seatName) {
        this.seatName = seatName;
    }

    public Integer getSeatRow() {
        return seatRow;
    }

    public void setSeatRow(Integer seatRow) {
        this.seatRow = seatRow;
    }

    public Integer getSeatCol() {
        return seatCol;
    }

    public void setSeatCol(Integer seatCol) {
        this.seatCol = seatCol;
    }

    public Boolean getSeatReserve() {
        return seatReserve;
    }

    public void setSeatReserve(Boolean seatReserve) {
        this.seatReserve = seatReserve;
    }

    public Integer getCinemaMovieTimeId() {
        return cinemaMovieTimeId;
    }

    public void setCinemaMovieTimeId(Integer cinemaMovieTimeId) {
        this.cinemaMovieTimeId = cinemaMovieTimeId;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
