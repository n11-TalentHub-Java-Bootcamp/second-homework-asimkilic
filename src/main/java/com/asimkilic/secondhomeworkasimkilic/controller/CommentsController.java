package com.asimkilic.secondhomeworkasimkilic.controller;

import com.asimkilic.secondhomeworkasimkilic.dto.productcomment.CommentDto;
import com.asimkilic.secondhomeworkasimkilic.dto.productcomment.NewCommentDto;
import com.asimkilic.secondhomeworkasimkilic.dto.productcomment.ProductCommentWithUserDetailsDto;
import com.asimkilic.secondhomeworkasimkilic.service.entityservice.ProductCommentEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentsController {

    @Autowired
    private ProductCommentEntityService productCommentEntityService;

    @GetMapping()
    public List<CommentDto> findAllCommentList(){

        return productCommentEntityService.findAllCommentList();
    }
    @GetMapping("/user/{userid}")
    public List<CommentDto> findAllCommentByUserId(@PathVariable Long userid) {

        return productCommentEntityService.findAllCommentByUserId(userid);

    }

    @PostMapping()
    public void saveComment(@RequestBody NewCommentDto newCommentDto) {
        productCommentEntityService.saveComment(newCommentDto);
    }
    @DeleteMapping("/{commentId}")
    public void deleteCommentByCommentId(@PathVariable Long commentId){
        productCommentEntityService.deleteCommentByCommentId(commentId);
    }


}
