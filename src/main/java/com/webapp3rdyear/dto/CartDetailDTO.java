package com.webapp3rdyear.dto;

public class CartDetailDTO {
    private int cartId;
    private String itemColor;
    private String itemColorCode;
    private double itemOriginalPrice;
    private int itemStock;
    private String productName;
    private int quantity;
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public String getItemColor() {
		return itemColor;
	}
	public void setItemColor(String itemColor) {
		this.itemColor = itemColor;
	}
	public String getItemColorCode() {
		return itemColorCode;
	}
	public void setItemColorCode(String itemColorCode) {
		this.itemColorCode = itemColorCode;
	}
	public double getItemOriginalPrice() {
		return itemOriginalPrice;
	}
	public void setItemOriginalPrice(double itemOriginalPrice) {
		this.itemOriginalPrice = itemOriginalPrice;
	}
	public int getItemStock() {
		return itemStock;
	}
	public void setItemStock(int itemStock) {
		this.itemStock = itemStock;
	}

	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
    
}
