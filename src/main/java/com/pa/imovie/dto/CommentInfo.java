package com.pa.imovie.dto;

import com.pa.imovie.entity.Users;

public class CommentInfo {

    private Integer movieId;
    private String commentContent;
    private Integer usersId;

    public CommentInfo() {
    }

    public CommentInfo(Integer movieId, String commentContent, Integer usersId) {
        this.movieId = movieId;
        this.commentContent = commentContent;
        this.usersId = usersId;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }
}