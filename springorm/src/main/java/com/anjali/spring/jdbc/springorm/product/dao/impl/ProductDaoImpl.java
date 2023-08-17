package com.anjali.spring.jdbc.springorm.product.dao.impl;

import com.anjali.spring.jdbc.springorm.product.dao.ProductDao;
import com.anjali.spring.jdbc.springorm.product.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Component("productDao")
public class ProductDaoImpl implements ProductDao {
    @Autowired
    HibernateTemplate hibernateTemplate;

    public ProductDaoImpl(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    @Transactional
    public int createProduct(Product product) {
        Integer save = (Integer) this.hibernateTemplate.save(product);
        return save;
    }

    @Override
    @Transactional
    public void updateProduct(Product product) {
        this.hibernateTemplate.update(product);
    }

    @Override
    @Transactional
    public void deleteProduct(Product product) {
        this.hibernateTemplate.delete(product);
    }

    @Override
    @Transactional
    public Product getAProduct(int id) {
        Product p = this.hibernateTemplate.get(Product.class, id);
        return p;
    }

    @Override
    @Transactional
    public List<Product> getAllProducts() {
        List<Product> products = this.hibernateTemplate.loadAll(Product.class);
        return products;
    }
}
