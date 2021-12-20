package com.asimkilic.secondhomeworkasimkilic.dao;

import com.asimkilic.secondhomeworkasimkilic.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryDao extends JpaRepository<Category, Long> {

    List<Category> findAll();
    Category findCategoryById(Long categoryId);


}
