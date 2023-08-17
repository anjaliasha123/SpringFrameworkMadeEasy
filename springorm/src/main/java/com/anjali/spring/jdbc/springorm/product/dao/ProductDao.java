package com.anjali.spring.jdbc.springorm.product.dao;

import com.anjali.spring.jdbc.springorm.product.entity.Product;

public interface ProductDao {
    int createProduct(Product product);
    void updateProduct(Product product);
}
