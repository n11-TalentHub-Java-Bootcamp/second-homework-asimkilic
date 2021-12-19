package com.asimkilic.secondhomeworkasimkilic.controller;

import com.asimkilic.secondhomeworkasimkilic.dto.productcomment.CommentDto;
import com.asimkilic.secondhomeworkasimkilic.dto.productcomment.ProductCommentWithUserDetailsDto;
import com.asimkilic.secondhomeworkasimkilic.service.entityservice.ProductCommentEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentsController {

    @Autowired
    private ProductCommentEntityService productCommentEntityService;

    @GetMapping("/user/{userid}")
    public List<CommentDto> findAllCommentByUserId(@PathVariable Long userid) {

        return productCommentEntityService.findAllCommentByUserId(userid);

    }

}
