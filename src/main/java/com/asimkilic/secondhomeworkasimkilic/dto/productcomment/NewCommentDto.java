package com.asimkilic.secondhomeworkasimkilic.dto.productcomment;

public class NewCommentDto {
        private String comment;
        private Long productId;
        private Long userId;

    public NewCommentDto() {
    }

    public NewCommentDto(String comment, Long productId, Long userId) {
        this.comment = comment;
        this.productId = productId;
        this.userId = userId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
