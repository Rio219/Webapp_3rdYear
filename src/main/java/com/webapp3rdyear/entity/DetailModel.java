package com.webapp3rdyear.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "DETAIL")
public class DetailModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DetailID")
    private long detailId;
    
    @ManyToOne
    @JoinColumn(name = "ItemID", nullable = false)
    private ItemModel itemId;

    @ManyToOne
    @JoinColumn(name = "OrderID", nullable = false)
    private OrderModel orderId;

    @Column(name = "Quantity")
    private int quantity;

    @Column(name = "Link", length = 200)
    private String link;

    @Column(name = "Content", length = 200)
    private String content;

    @Column(name = "EvaluationDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date evaluationDate;

    @Column(name = "Rating")
    private int rating;

	public long getDetailId() {
		return detailId;
	}

	public void setDetailId(long detailId) {
		this.detailId = detailId;
	}

	public ItemModel getItemId() {
		return itemId;
	}

	public void setItemId(ItemModel itemId) {
		this.itemId = itemId;
	}

	public OrderModel getOrderId() {
		return orderId;
	}

	public void setOrderId(OrderModel orderId) {
		this.orderId = orderId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getEvaluationDate() {
		return evaluationDate;
	}

	public void setEvaluationDate(Date evaluationDate) {
		this.evaluationDate = evaluationDate;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

    
}
