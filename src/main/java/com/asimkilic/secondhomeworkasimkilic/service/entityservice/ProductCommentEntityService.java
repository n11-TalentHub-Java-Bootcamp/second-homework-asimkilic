package com.asimkilic.secondhomeworkasimkilic.service.entityservice;

import com.asimkilic.secondhomeworkasimkilic.dao.ProductCommentDao;
import com.asimkilic.secondhomeworkasimkilic.dto.productcomment.CommentDto;
import com.asimkilic.secondhomeworkasimkilic.dto.productcomment.ProductCommentWithUserDetailsDto;
import com.asimkilic.secondhomeworkasimkilic.entity.ProductComment;
import com.asimkilic.secondhomeworkasimkilic.exception.productcomment.NoCommentException;
import com.asimkilic.secondhomeworkasimkilic.exception.user.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.asimkilic.secondhomeworkasimkilic.converter.ProductCommentConverter.INSTANCE;

import java.util.List;

@Service
public class ProductCommentEntityService {

    @Autowired
    private ProductCommentDao productCommentDao;

    public List<CommentDto> findAllCommentByUserId(Long userId) {
        List<ProductComment> commentList = productCommentDao.findProductCommentByUserId(userId);

        if (commentList.size() < 1) {
            List<Object> usernameByUserid = productCommentDao.findUsernameByUserid(userId);
            if (usernameByUserid.size() != 1)
                throw new UserNotFoundException("Böyle bir kullanıcı yoktur.");
            String username = String.valueOf(usernameByUserid.get(0));
            throw new NoCommentException(username + " kullanıcı henüz yorum yazmamıştır.");
        }
        List<CommentDto> commentDtoList = INSTANCE.convertProductCommentListToCommentDtoList(commentList);

        return commentDtoList;
    }
}
