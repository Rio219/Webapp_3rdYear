package com.webapp3rdyear.entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "ITEM")
public class ItemModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ItemID")
    private int itemId;

    @Column(name = "ProductID")
    private int productId;

    @Column(name = "Color", length = 45)
    private String color;

    @Column(name = "ColorCode", length = 45)
    private String colorCode;

    @Column(name = "Size", length = 100)
    private String size;

    @Column(name = "Stock")
    private int stock;

    @Column(name = "OriginalPrice", precision = 10, scale = 3)
    private BigDecimal originalPrice;

    @Column(name = "PromotionPrice")
    private int promotionPrice;

    @OneToMany(mappedBy = "itemId", cascade = CascadeType.ALL)
	private Set<CartModel> cart = new HashSet<>();

    @OneToMany(mappedBy = "itemId", cascade = CascadeType.ALL)
	private Set<DetailModel> detail = new HashSet<>();
    // Constructors, getters, and setters
}
