package com.pa.imovie.entity;

import javax.persistence.*;

@Entity
public class BannerImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bannerImage_id", nullable = false)
    private Integer bannerImage_id;
    private String bannerImage_name;
    private String bannerImage_url;

    private Integer movie_id;

    public BannerImage() {
    }

    public BannerImage(Integer bannerImage_id, String bannerImage_name, String bannerImage_url) {
        this.bannerImage_id = bannerImage_id;
        this.bannerImage_name = bannerImage_name;
        this.bannerImage_url = bannerImage_url;
    }

    public BannerImage(Integer bannerImage_id, String bannerImage_name, String bannerImage_url, Integer movie_id) {
        this.bannerImage_id = bannerImage_id;
        this.bannerImage_name = bannerImage_name;
        this.bannerImage_url = bannerImage_url;
        this.movie_id = movie_id;
    }

    public Integer getBannerImage_id() {
        return bannerImage_id;
    }

    public void setBannerImage_id(Integer bannerImage_id) {
        this.bannerImage_id = bannerImage_id;
    }

    public String getBannerImage_name() {
        return bannerImage_name;
    }

    public void setBannerImage_name(String bannerImage_name) {
        this.bannerImage_name = bannerImage_name;
    }

    public String getBannerImage_url() {
        return bannerImage_url;
    }

    public void setBannerImage_url(String bannerImage_url) {
        this.bannerImage_url = bannerImage_url;
    }

    public Integer getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(Integer movie_id) {
        this.movie_id = movie_id;
    }
}
