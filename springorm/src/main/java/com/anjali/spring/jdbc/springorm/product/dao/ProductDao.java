package com.anjali.spring.jdbc.springorm.product.dao;

import com.anjali.spring.jdbc.springorm.product.entity.Product;

import java.util.List;

public interface ProductDao {
    int createProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(Product product);
    Product getAProduct(int id);
    List<Product> getAllProducts();
}
