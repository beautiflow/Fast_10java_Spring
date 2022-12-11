package DesignPattern.Chapter02.ch03_abstractFactory.domain.product.dao;

import DesignPattern.Chapter02.ch03_abstractFactory.domain.product.Product;

public interface ProductDao {

    void insertProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(Product product);
}
