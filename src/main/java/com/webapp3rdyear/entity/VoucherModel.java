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
@Table(name = "VOUCHER")
public class VoucherModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "VoucherID")
	private int voucherId;

	@Column(name = "Description", length = 1000)
	private String description;

	@Column(name = "Discount")
	private int discount;

	@Column(name = "MinimumPrice")
	private int minimumPrice;

	@Column(name = "Quantity")
	private int quantity;

	@Column(name = "Mfg")
	@Temporal(TemporalType.DATE)
	private Date mfgDate;

	@Column(name = "Exp")
	@Temporal(TemporalType.DATE)
	private Date expDate;

	@OneToMany(mappedBy = "voucher", cascade = CascadeType.ALL)
	private Set<VoucherCustomerModel> voucherUsers = new HashSet<>();

	// Constructors, getters, and setters

	public VoucherModel() {
	}

	public int getVoucherId() {
		return voucherId;
	}

	public void setVoucherId(int voucherId) {
		this.voucherId = voucherId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getMinimumPrice() {
		return minimumPrice;
	}

	public void setMinimumPrice(int minimumPrice) {
		this.minimumPrice = minimumPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(Date mfgDate) {
		this.mfgDate = mfgDate;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}
	
    public Set<VoucherCustomerModel> getVoucherUsers() {
        return voucherUsers;
    }

    public void setVoucherUsers(Set<VoucherCustomerModel> voucherUsers) {
        this.voucherUsers = voucherUsers;
    }
}
