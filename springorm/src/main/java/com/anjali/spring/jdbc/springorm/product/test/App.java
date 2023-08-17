package com.anjali.spring.jdbc.springorm.product.test;

import com.anjali.spring.jdbc.springorm.product.dao.ProductDao;
import com.anjali.spring.jdbc.springorm.product.entity.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        ProductDao productDao = (ProductDao) context.getBean("productDao");
//        int result = productDao.createProduct(new Product(1, "sample prod","sample desc",20.0));
//        System.out.println("result: "+result);
//        productDao.updateProduct(new Product(1, "sample prod","sample desc",80.0));
//        productDao.deleteProduct(new Product(1, "sample prod","sample desc",80.0));
        Product p = productDao.getAProduct(1);
        System.out.println("Product with id 1: "+p.getName()+" price is: "+p.getPrice());
        List<Product> allProducts = productDao.getAllProducts();
        for(Product prod: allProducts){
            System.out.println("Name :"+prod.getName()+" desc: "+prod.getDesc());
        }
    }
}
