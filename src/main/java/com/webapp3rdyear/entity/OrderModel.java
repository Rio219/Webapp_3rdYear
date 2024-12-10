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
@Table(name = "ORDERS")
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

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getTransportFee() {
		return transportFee;
	}

	public void setTransportFee(int transportFee) {
		this.transportFee = transportFee;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(int totalMoney) {
		this.totalMoney = totalMoney;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(Date deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public int getCustomConfirmation() {
		return customConfirmation;
	}

	public void setCustomConfirmation(int customConfirmation) {
		this.customConfirmation = customConfirmation;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	public int getShipperId() {
		return shipperId;
	}

	public void setShipperId(int shipperId) {
		this.shipperId = shipperId;
	}

	public Set<DetailModel> getDetail() {
		return detail;
	}

	public void setDetail(Set<DetailModel> detail) {
		this.detail = detail;
	}

    
}
