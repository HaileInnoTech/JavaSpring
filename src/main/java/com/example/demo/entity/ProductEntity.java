package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import java.math.BigDecimal;



@Table(name="java product 001")
@Data
public class ProductEntity {
    private Long   productId;
    private String productName;
    private BigDecimal productPrice;
}
