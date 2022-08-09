package com.pa.imovie.entity;

import javax.persistence.*;

@Entity
public class DetailImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "detailImageId", nullable = false)
    private Integer detailImageId;
    private String detailImageName;
    private String detailImageUrl;

    private Integer movieId;

    public DetailImage() {
    }

    public DetailImage(Integer detailImageId, String detailImageName, String detailImageUrl) {
        this.detailImageId = detailImageId;
        this.detailImageName = detailImageName;
        this.detailImageUrl = detailImageUrl;
    }

    public DetailImage(Integer detailImageId, String detailImageName, String detailImageUrl, Integer movieId) {
        this.detailImageId = detailImageId;
        this.detailImageName = detailImageName;
        this.detailImageUrl = detailImageUrl;
        this.movieId = movieId;
    }

    public Integer getDetailImageId() {
        return detailImageId;
    }

    public void setDetailImageId(Integer detailImageId) {
        this.detailImageId = detailImageId;
    }

    public String getDetailImageName() {
        return detailImageName;
    }

    public void setDetailImageName(String detailImageName) {
        this.detailImageName = detailImageName;
    }

    public String getDetailImageUrl() {
        return detailImageUrl;
    }

    public void setDetailImageUrl(String detailImageUrl) {
        this.detailImageUrl = detailImageUrl;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }
}
