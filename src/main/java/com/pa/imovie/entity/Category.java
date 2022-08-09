package com.pa.imovie.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoryId", nullable = false)
    private Integer categoryId;
    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "categoryId")
    private List<MovieCategory> movieCategories;

    public Category() {
    }

    public Category(Integer categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public Category(Integer categoryId, String categoryName, List<MovieCategory> movieCategories) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.movieCategories = movieCategories;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<MovieCategory> getMovieCategories() {
        return movieCategories;
    }

    public void setMovieCategories(List<MovieCategory> movieCategories) {
        this.movieCategories = movieCategories;
    }
}
