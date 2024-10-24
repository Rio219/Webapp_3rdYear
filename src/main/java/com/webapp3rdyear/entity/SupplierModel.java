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

    // Constructors, getters, and setters
}
