package com.pa.imovie.dto;

import com.pa.imovie.entity.Users;

public class CommentDetailInfo {

    private Integer commentId;
    private String commentTime;
    private String commentContent;
    private Users users;

    public CommentDetailInfo() {
    }

    public CommentDetailInfo(Integer commentId, String commentTime, String commentContent, Users users) {
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
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
