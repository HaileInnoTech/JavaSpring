package com.example.demo.repository.impl;

import com.example.demo.entity.ProductEntity;
import com.example.demo.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    @Override
    public ProductEntity createProduct(ProductEntity product) {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setProductId(1L);
        productEntity.setProductName("Hai Le");
        productEntity.setProductPrice(new BigDecimal("21.6"));
        return productEntity;
    }

    @Override
    public List<ProductEntity> findAllProduct() {
        ProductEntity product1 = new ProductEntity();
        product1.setProductId(1L);
        product1.setProductName("Laptop");
        product1.setProductPrice(new BigDecimal("999.99"));

        ProductEntity product2 = new ProductEntity();
        product2.setProductId(2L);
        product2.setProductName("Mouse");
        product2.setProductPrice(new BigDecimal("25.50"));

        ProductEntity product3 = new ProductEntity();
        product3.setProductId(3L);
        product3.setProductName("Keyboard");
        product3.setProductPrice(new BigDecimal("45.00"));

        return Arrays.asList(product1, product2, product3);
    }
}
