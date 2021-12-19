package com.asimkilic.secondhomeworkasimkilic.controller;

import com.asimkilic.secondhomeworkasimkilic.dto.product.ProductWithCommentDto;
import com.asimkilic.secondhomeworkasimkilic.service.entityservice.ProductEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

    @Autowired
    private ProductEntityService productEntityService;

    @GetMapping("/{productId}/comment")
    public List<ProductWithCommentDto> findCommentListByProductId(@PathVariable Long productId){
        return productEntityService.findCommentListByProductId(productId);
    }
}
