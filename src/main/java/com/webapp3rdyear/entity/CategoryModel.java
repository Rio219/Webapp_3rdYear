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


    public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public int getParentCategoryId() {
		return parentCategoryId;
	}

	public void setParentCategoryId(int parentCategoryId) {
		this.parentCategoryId = parentCategoryId;
	}
}
