package com.webapp3rdyear.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "CATEGORY")
public class CategoryModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CategoryID")
    private int categoryId;

    @Column(name = "CategoryName", length = 50)
    private String categoryName;

    @Column(name = "ParentCategoryID")
    private int parentCategoryId;

    // Constructors, getters, and setters
}
