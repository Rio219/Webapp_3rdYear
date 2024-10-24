package com.webapp3rdyear.entity;

import java.util.Date;
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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "ORDER")
public class OrderModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OrderID")
    private int orderId;

    @Column(name = "OrderDate")
    @Temporal(TemporalType.DATE)
    private Date orderDate;

    @Column(name = "Address", length = 100)
    private String address;

    @Column(name = "City", length = 45)
    private String city;

    @Column(name = "Status")
    private int status;

    @Column(name = "TransportFee")
    private int transportFee;

    @Column(name = "Discount")
    private int discount;

    @Column(name = "TotalMoney")
    private int totalMoney;

    @Column(name = "Note", length = 100)
    private String note;

    @Column(name = "DeliveryTime")
    @Temporal(TemporalType.DATE)
    private Date deliveryTime;

    @Column(name = "CustomConfirmation")
    private int customConfirmation;

    @Column(name = "CustomerID")
    private int customerId;

    @Column(name = "SellerID")
    private int sellerId;

    @Column(name = "ShipperID")
    private int shipperId;
    
    @OneToMany(mappedBy = "orderId", cascade = CascadeType.ALL)
	private Set<DetailModel> detail = new HashSet<>();

    // Constructors, getters, and setters
}
