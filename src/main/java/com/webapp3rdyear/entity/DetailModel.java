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

    // Constructors, getters, and setters
}
