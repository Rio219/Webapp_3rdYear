package com.webapp3rdyear.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webapp3rdyear.entity.CartModel;

@Repository
public interface CartReponsitory extends JpaRepository<CartModel, Integer>{
	Long CountCart(CartModel cartModel);
}
