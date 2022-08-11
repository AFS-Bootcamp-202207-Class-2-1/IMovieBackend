package com.pa.imovie.dto;

<<<<<<< HEAD
import com.pa.imovie.entity.Users;

public class CommentInfo {

    private Integer commentId;
    private String commentTime;
    private String commentContent;
    private Users users;
=======
public class CommentInfo {

    Integer movieId;

    String commentContent;

    Integer usersId;
>>>>>>> ffded8c01614f2d0e3cc693b1169e00fe6814365

    public CommentInfo() {
    }

<<<<<<< HEAD
    public CommentInfo(Integer commentId, String commentTime, String commentContent, Users users) {
        this.commentId = commentId;
        this.commentTime = commentTime;
        this.commentContent = commentContent;
        this.users = users;
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
=======
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
>>>>>>> ffded8c01614f2d0e3cc693b1169e00fe6814365
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

<<<<<<< HEAD
    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
=======
    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
>>>>>>> ffded8c01614f2d0e3cc693b1169e00fe6814365
    }
}
