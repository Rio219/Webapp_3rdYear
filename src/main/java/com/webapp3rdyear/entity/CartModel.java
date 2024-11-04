package com.webapp3rdyear.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "CART")
public class CartModel implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CartID")
    private int cartId;
    
    @ManyToOne
    @JoinColumn(name = "CustomerID", nullable = false)
    private UserModel customerId;
    
    @ManyToOne
    @JoinColumn(name = "ItemID", nullable = false)
    private ItemModel itemId;

    @Column(name = "Quantity")
    private int quantity;

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public UserModel getCustomerId() {
		return customerId;
	}

	public void setCustomerId(UserModel customerId) {
		this.customerId = customerId;
	}

	public ItemModel getItemId() {
		return itemId;
	}

	public void setItemId(ItemModel itemId) {
		this.itemId = itemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

    // Constructors, getters, and setters
}
