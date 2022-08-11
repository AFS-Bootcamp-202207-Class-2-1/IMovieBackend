package com.pa.imovie.dto;

import java.util.List;

public class CategoryMoviePageInfo {

    private Integer totalSize;
    private List<CategoryMovieInfo> categoryMovieInfoList;

    public CategoryMoviePageInfo() {
    }

    public CategoryMoviePageInfo(Integer totalSize, List<CategoryMovieInfo> categoryMovieInfoList) {
        this.totalSize = totalSize;
        this.categoryMovieInfoList = categoryMovieInfoList;
    }

    public Integer getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }

    public List<CategoryMovieInfo> getCategoryMovieInfoList() {
        return categoryMovieInfoList;
    }

    public void setCategoryMovieInfoList(List<CategoryMovieInfo> categoryMovieInfoList) {
        this.categoryMovieInfoList = categoryMovieInfoList;
    }
}
