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

    @Query(value = "select u.username from public.User u where u.id=:userId", nativeQuery = true)
    List<Object> findUsernameByUserid(@Param("userId") Long userId);

}
