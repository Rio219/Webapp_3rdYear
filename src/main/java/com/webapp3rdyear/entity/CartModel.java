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

    // Constructors, getters, and setters
}
