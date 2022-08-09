package com.pa.imovie.dto;

public class SeatInfo {

    private Integer seatId;
    private String seatName;
    private Integer seatRow;
    private Integer seatCol;
    private Boolean seatReserve;
    private String usersGender;

    public SeatInfo(Integer seatId, String seatName, Integer seatRow, Integer seatCol, Boolean seatReserve, String usersGender) {
        this.seatId = seatId;
        this.seatName = seatName;
        this.seatRow = seatRow;
        this.seatCol = seatCol;
        this.seatReserve = seatReserve;
        this.usersGender = usersGender;
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

    public String getUsersGender() {
        return usersGender;
    }

    public void setUsersGender(String usersGender) {
        this.usersGender = usersGender;
    }
}
