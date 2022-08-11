package com.pa.imovie.dto;

public class TicketOrderInfo {

    private Integer ticketId;
    private String movieImage;
    private String movieName;
    private String ticketBuytime;
    private String ticketUuid;
    private Integer ticketPrice;
    private String cinemaAddress;
    private String cinemaName;
    private String cinemaMovieTimeWatchtime;
    private String seatInfo;

    public TicketOrderInfo() {
    }

    public TicketOrderInfo(Integer ticketId, String movieImage, String movieName, String ticketBuytime, String ticketUuid, Integer ticketPrice, String cinemaAddress, String cinemaName, String cinemaMovieTimeWatchtime, String seatInfo) {
        this.ticketId = ticketId;
        this.movieImage = movieImage;
        this.movieName = movieName;
        this.ticketBuytime = ticketBuytime;
        this.ticketUuid = ticketUuid;
        this.ticketPrice = ticketPrice;
        this.cinemaAddress = cinemaAddress;
        this.cinemaName = cinemaName;
        this.cinemaMovieTimeWatchtime = cinemaMovieTimeWatchtime;
        this.seatInfo = seatInfo;
    }

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public String getMovieImage() {
        return movieImage;
    }

    public void setMovieImage(String movieImage) {
        this.movieImage = movieImage;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getTicketBuytime() {
        return ticketBuytime;
    }

    public void setTicketBuytime(String ticketBuytime) {
        this.ticketBuytime = ticketBuytime;
    }

    public String getTicketUuid() {
        return ticketUuid;
    }

    public void setTicketUuid(String ticketUuid) {
        this.ticketUuid = ticketUuid;
    }

    public Integer getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Integer ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getCinemaAddress() {
        return cinemaAddress;
    }

    public void setCinemaAddress(String cinemaAddress) {
        this.cinemaAddress = cinemaAddress;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getCinemaMovieTimeWatchtime() {
        return cinemaMovieTimeWatchtime;
    }

    public void setCinemaMovieTimeWatchtime(String cinemaMovieTimeWatchtime) {
        this.cinemaMovieTimeWatchtime = cinemaMovieTimeWatchtime;
    }

    public String getSeatInfo() {
        return seatInfo;
    }

    public void setSeatInfo(String seatInfo) {
        this.seatInfo = seatInfo;
    }
}
