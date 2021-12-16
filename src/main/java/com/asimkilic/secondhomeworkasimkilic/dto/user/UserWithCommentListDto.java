package com.asimkilic.secondhomeworkasimkilic.dto.user;

import java.util.Date;

public class UserWithCommentListDto {
    private Long userId;
    private String userFirstName;
    private String productName;
    private String productComment;
    private Date commentDate;

    public UserWithCommentListDto() {
    }

    public UserWithCommentListDto(Long userId, String userFirstName, String productName, String productComment, Date commentDate) {
        this.userId = userId;
        this.userFirstName = userFirstName;
        this.productName = productName;
        this.productComment = productComment;
        this.commentDate = commentDate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductComment() {
        return productComment;
    }

    public void setProductComment(String productComment) {
        this.productComment = productComment;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }
}
