package com.webapp3rdyear.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "SUPPLIER")
public class SupplierModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SupplierID")
    private int supplierId;

    @Column(name = "SupplierName", length = 100)
    private String supplierName;

    @Column(name = "SCallNumber", length = 11)
    private String sCallNumber;

    @Column(name = "SupplierAddress", length = 100)
    private String supplierAddress;

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getsCallNumber() {
		return sCallNumber;
	}

	public void setsCallNumber(String sCallNumber) {
		this.sCallNumber = sCallNumber;
	}

	public String getSupplierAddress() {
		return supplierAddress;
	}

	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}



}
