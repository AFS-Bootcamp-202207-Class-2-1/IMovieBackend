package com.pa.imovie.entity;

import javax.persistence.*;

@Entity
public class DetailImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "detailImage_id", nullable = false)
    private Integer detailImage_id;
    private String detailImage_name;
    private String detailImage_url;

    private Integer movie_id;

    public DetailImage() {
    }

    public DetailImage(Integer detailImage_id, String detailImage_name, String detailImage_url) {
        this.detailImage_id = detailImage_id;
        this.detailImage_name = detailImage_name;
        this.detailImage_url = detailImage_url;
    }

    public DetailImage(Integer detailImage_id, String detailImage_name, String detailImage_url, Integer movie_id) {
        this.detailImage_id = detailImage_id;
        this.detailImage_name = detailImage_name;
        this.detailImage_url = detailImage_url;
        this.movie_id = movie_id;
    }


    public Integer getDetailImage_id() {
        return detailImage_id;
    }

    public void setDetailImage_id(Integer detailImage_id) {
        this.detailImage_id = detailImage_id;
    }

    public String getDetailImage_name() {
        return detailImage_name;
    }

    public void setDetailImage_name(String detailImage_name) {
        this.detailImage_name = detailImage_name;
    }

    public String getDetailImage_url() {
        return detailImage_url;
    }

    public void setDetailImage_url(String detailImage_url) {
        this.detailImage_url = detailImage_url;
    }

    public Integer getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(Integer movie_id) {
        this.movie_id = movie_id;
    }
}
