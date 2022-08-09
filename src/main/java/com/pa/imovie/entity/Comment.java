package com.pa.imovie.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commentId", nullable = false)
    private Integer commentId;
    private String commentTime;
    private String commentContent;

    private Integer usersId;
    private Integer movieId;

    public Comment() {
    }

    public Comment(Integer commentId, String commentTime, String commentContent) {
        this.commentId = commentId;
        this.commentTime = commentTime;
        this.commentContent = commentContent;
    }

    public Comment(Integer commentId, String commentTime, String commentContent, Integer usersId, Integer movieId) {
        this.commentId = commentId;
        this.commentTime = commentTime;
        this.commentContent = commentContent;
        this.usersId = usersId;
        this.movieId = movieId;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(String commentTime) {
        this.commentTime = commentTime;
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

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }
}
