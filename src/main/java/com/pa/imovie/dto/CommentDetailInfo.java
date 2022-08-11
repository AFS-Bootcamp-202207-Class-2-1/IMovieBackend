package com.pa.imovie.dto;

import com.pa.imovie.entity.Users;

public class CommentDetailInfo {

    private Integer commentId;
    private String commentTime;
    private String commentContent;
    private String usersName;
    private String usersGender;

    public CommentDetailInfo() {
    }

    public CommentDetailInfo(Integer commentId, String commentTime, String commentContent, String usersName, String usersGender) {
        this.commentId = commentId;
        this.commentTime = commentTime;
        this.commentContent = commentContent;
        this.usersName = usersName;
        this.usersGender = usersGender;
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

    public String getUsersName() {
        return usersName;
    }

    public void setUsersName(String usersName) {
        this.usersName = usersName;
    }

    public String getUsersGender() {
        return usersGender;
    }

    public void setUsersGender(String usersGender) {
        this.usersGender = usersGender;
    }
}
