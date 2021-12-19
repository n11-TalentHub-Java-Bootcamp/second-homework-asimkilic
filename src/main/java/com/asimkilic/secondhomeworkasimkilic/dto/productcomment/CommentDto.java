package com.asimkilic.secondhomeworkasimkilic.dto.productcomment;

import com.asimkilic.secondhomeworkasimkilic.entity.User;

import java.util.Date;

public class CommentDto {
    private String comment;
    private Date commentDate;
    private String username;


    public CommentDto() {
    }

    public CommentDto(String comment, Date commentDate,String username) {
        this.comment = comment;
        this.commentDate = commentDate;
        this.username=username;

    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }
}
