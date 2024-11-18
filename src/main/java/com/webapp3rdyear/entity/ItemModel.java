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

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColorCode() {
		return colorCode;
	}

	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public BigDecimal getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(BigDecimal originalPrice) {
		this.originalPrice = originalPrice;
	}

	public int getPromotionPrice() {
		return promotionPrice;
	}

	public void setPromotionPrice(int promotionPrice) {
		this.promotionPrice = promotionPrice;
	}

	public Set<CartModel> getCart() {
		return cart;
	}

	public void setCart(Set<CartModel> cart) {
		this.cart = cart;
	}

	public Set<DetailModel> getDetail() {
		return detail;
	}

	public void setDetail(Set<DetailModel> detail) {
		this.detail = detail;
	}


}
