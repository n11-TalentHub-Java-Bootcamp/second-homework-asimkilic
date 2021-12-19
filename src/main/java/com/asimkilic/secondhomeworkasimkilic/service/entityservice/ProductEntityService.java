package com.asimkilic.secondhomeworkasimkilic.service.entityservice;

import com.asimkilic.secondhomeworkasimkilic.dao.ProductDao;
import com.asimkilic.secondhomeworkasimkilic.dto.product.ProductWithCommentDto;
import com.asimkilic.secondhomeworkasimkilic.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductEntityService {

    @Autowired
    private ProductDao productDao;

    @Autowired
    private ProductCommentEntityService productCommentEntityService;

    public List<Product> findAll() {
        return productDao.findAll();
    }

    public List<ProductWithCommentDto> findCommentListByProductId(Long productId) {
        return productCommentEntityService.findCommentListByProductId(productId);
    }
}
