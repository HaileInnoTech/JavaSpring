package com.example.demo.controller;

import com.example.demo.entity.ProductEntity;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public ProductEntity productEntity(@RequestBody ProductEntity productEntity) {
        return productService.createProduct(productEntity);
    }

    @GetMapping("/products")
    public List<ProductEntity> getAllProduct() {
        return productService.findAllProduct();
    }
}
