package com.anjali.spring.jdbc.springorm.product.dao.impl;

import com.anjali.spring.jdbc.springorm.product.dao.ProductDao;
import com.anjali.spring.jdbc.springorm.product.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProductDaoImpl implements ProductDao {
    @Autowired
    HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public int createProduct(Product product) {
        return 0;
    }
}
