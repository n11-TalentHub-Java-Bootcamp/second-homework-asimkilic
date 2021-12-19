package com.asimkilic.secondhomeworkasimkilic.dao;

import com.asimkilic.secondhomeworkasimkilic.entity.ProductComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductCommentDao extends JpaRepository<ProductComment, Long> {

    List<ProductComment> findProductCommentByUserId(Long userId);

    List<ProductComment> findProductCommentByProductId(Long productId);

    @Query(value = "select u.username from public.User u where u.id=:userId", nativeQuery = true)
    List<Object> findUsernameByUserid(@Param("userId") Long userId);

    @Query(value = "select p.name from Product p where p.id=:productId", nativeQuery = true)
    List<Object> findProductNameByProductId(@Param("productId") Long productId);

    @Query(value="INSERT into ProductComment set(COMMENT,COMMENT_DATE,PRODUCT_ID,USER_ID) values(:obj.comment,:obj.commentDate,:obj.product.id,:obj.user.id)",nativeQuery = true)
    void saveProductComment(@Param("obj") ProductComment productcomment);
}
