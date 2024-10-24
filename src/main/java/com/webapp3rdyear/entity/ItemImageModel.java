package com.webapp3rdyear.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ITEM_IMAGE")
public class ItemImageModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ItemImageID")
    private int itemImageId;

    @Column(name = "ItemID")
    private int itemId;

    @Column(name = "Image", length = 500)
    private String image;

    // Constructors, getters, and setters
}
