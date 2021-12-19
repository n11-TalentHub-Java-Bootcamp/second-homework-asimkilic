package com.asimkilic.secondhomeworkasimkilic.service.entityservice;

import com.asimkilic.secondhomeworkasimkilic.dao.CategoryDao;
import com.asimkilic.secondhomeworkasimkilic.dao.ProductDao;
import com.asimkilic.secondhomeworkasimkilic.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryEntityService {

    @Autowired
    private CategoryDao categoryDao;


    public List<Category> findAll() {
        return categoryDao.findAll();
    }

    public Category findCategoryById(Long id){
        return categoryDao.findCategoryById(id);
    }
}
