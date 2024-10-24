package com.webapp3rdyear.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "PRODUCTS")
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProductID")
    private int productId;

    @Column(name = "CategoryID")
    private int categoryId;

    @Column(name = "PName", length = 100)
    private String pName;

    @Column(name = "OriginalPrice", precision = 10, scale = 3)
    private BigDecimal originalPrice;

    @Column(name = "Supplier", length = 50)
    private String supplier;

    @Column(name = "Description", length = 1000)
    private String description;

    // Constructors, getters, and setters
}
