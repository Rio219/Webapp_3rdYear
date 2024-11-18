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

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getMethod() {
		return method;
	}

	public void setMethod(int method) {
		this.method = method;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	public String getCardOwner() {
		return cardOwner;
	}

	public void setCardOwner(String cardOwner) {
		this.cardOwner = cardOwner;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}


}
