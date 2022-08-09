package com.pa.imovie.entity;

import javax.persistence.*;

@Entity
public class MovieCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movieCategoryId", nullable = false)
    private Integer movieCategoryId;
    private Integer categoryId;
    private Integer movieId;

    public MovieCategory() {
    }

    public MovieCategory(Integer movieCategoryId) {
        this.movieCategoryId = movieCategoryId;
    }

    public MovieCategory(Integer movieCategoryId, Integer categoryId, Integer movieId) {
        this.movieCategoryId = movieCategoryId;
        this.categoryId = categoryId;
        this.movieId = movieId;
    }

    public Integer getMovieCategoryId() {
        return movieCategoryId;
    }

    public void setMovieCategoryId(Integer movieCategoryId) {
        this.movieCategoryId = movieCategoryId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }
}
