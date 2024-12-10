package com.webapp3rdyear.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webapp3rdyear.entity.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Integer> {

    // Tìm kiếm sản phẩm theo tên
    List<ProductModel> findByNameContaining(String name);
    
    // Tìm kiếm sản phẩm theo giá
    List<ProductModel> findByPriceBetween(Double minPrice, Double maxPrice);
    
    // Tìm kiếm sản phẩm theo một phần của tên
    List<ProductModel> findByNameStartingWith(String prefix);
    
    // Tìm kiếm sản phẩm theo một phần của tên và phân trang
    List<ProductModel> findByNameContaining(String name, Pageable pageable);
}