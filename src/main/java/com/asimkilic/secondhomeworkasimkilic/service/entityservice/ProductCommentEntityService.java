package com.asimkilic.secondhomeworkasimkilic.service.entityservice;

import com.asimkilic.secondhomeworkasimkilic.dao.ProductCommentDao;
import com.asimkilic.secondhomeworkasimkilic.dto.product.ProductWithCommentDto;
import com.asimkilic.secondhomeworkasimkilic.dto.productcomment.CommentDto;
import com.asimkilic.secondhomeworkasimkilic.dto.productcomment.NewCommentDto;
import com.asimkilic.secondhomeworkasimkilic.entity.ProductComment;
import com.asimkilic.secondhomeworkasimkilic.exception.product.ProductNotFoundException;
import com.asimkilic.secondhomeworkasimkilic.exception.productcomment.NoCommentException;
import com.asimkilic.secondhomeworkasimkilic.exception.user.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.asimkilic.secondhomeworkasimkilic.converter.ProductCommentConverter.INSTANCE;

@Service
public class ProductCommentEntityService {

    @Autowired
    private ProductCommentDao productCommentDao;



    public List<CommentDto> findAllCommentByUserId(Long userId) {
        List<ProductComment> productCommentList = productCommentDao.findProductCommentByUserId(userId);

        if (productCommentList.size() < 1) {
            List<Object> usernameByUserid = productCommentDao.findUsernameByUserid(userId);
            if (usernameByUserid.size() != 1)
                throw new UserNotFoundException("Böyle bir kullanıcı yoktur.");
            String username = String.valueOf(usernameByUserid.get(0));
            throw new NoCommentException(username + " kullanıcı henüz yorum yazmamıştır.");
        }
        List<CommentDto> commentDtoList = INSTANCE.convertProductCommentListToCommentDtoList(productCommentList);
        return commentDtoList;
    }

    public List<ProductWithCommentDto> findCommentListByProductId(Long productId) {
        List<ProductComment> productCommentList = productCommentDao.findProductCommentByProductId(productId);
        if (productCommentList.size() < 1) {
            List<Object> productNameByProductId = productCommentDao.findProductNameByProductId(productId);
            if (productNameByProductId.size() != 1)
                throw new ProductNotFoundException("Böyle bir ürün yoktur.");
            String productName = String.valueOf(productNameByProductId.get(0));
            throw new NoCommentException(productName + " ürüne henüz bir yorum yazılmamıştır.");
        }
        List<ProductWithCommentDto> productWithCommentDto = INSTANCE.convertProductCommentListToProductWithCommentDto(productCommentList);
        return productWithCommentDto;
    }

    public void saveComment(NewCommentDto newCommentDto) {
        ProductComment productComment = INSTANCE.convertNewCommentDtoToProductComment(newCommentDto);
        ProductComment save = productCommentDao.save(productComment);
    
    }
}
