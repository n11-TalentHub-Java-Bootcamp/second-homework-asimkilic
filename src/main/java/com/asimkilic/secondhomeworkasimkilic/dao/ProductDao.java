package com.asimkilic.secondhomeworkasimkilic.dao;

import com.asimkilic.secondhomeworkasimkilic.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao extends JpaRepository<Product, Long> {
     List<Product> findAll();

}
