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

	public int getItemImageId() {
		return itemImageId;
	}

	public void setItemImageId(int itemImageId) {
		this.itemImageId = itemImageId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

    
    
}
