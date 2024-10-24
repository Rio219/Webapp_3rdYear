package com.webapp3rdyear.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PAYMENT")
public class PaymentModel {

    @Id
    @Column(name = "OrderID")
    private int orderId;

    @Column(name = "Method")
    private int method;

    @Column(name = "Time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date time;

    @Column(name = "BankID", length = 45)
    private String bankId;

    @Column(name = "CardOwner", length = 100)
    private String cardOwner;

    @Column(name = "AccountNumber", length = 20)
    private String accountNumber;

    @Column(name = "Status")
    private Boolean status;

    // Constructors, getters, and setters
}
