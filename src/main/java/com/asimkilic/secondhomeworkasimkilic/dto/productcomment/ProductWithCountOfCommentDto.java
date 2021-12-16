package com.asimkilic.secondhomeworkasimkilic.dto.productcomment;

import java.math.BigDecimal;

public class ProductWithCountOfCommentDto {
    private Long id;
    private String name;
    private BigDecimal price;
    private Long countOfComment;

    public ProductWithCountOfCommentDto() {
    }

    public ProductWithCountOfCommentDto(Long id, String name, BigDecimal price, Long countOfComment) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.countOfComment = countOfComment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getCountOfComment() {
        return countOfComment;
    }

    public void setCountOfComment(Long countOfComment) {
        this.countOfComment = countOfComment;
    }
}

