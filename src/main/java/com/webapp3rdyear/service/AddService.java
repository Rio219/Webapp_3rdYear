package com.webapp3rdyear.service;

import com.webapp3rdyear.entity.CartModel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AddService {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("webapp_3rdyear");
    public boolean addtoCart(int userID, int productID, int quantity) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            CartModel cart = new CartModel();
            cart.setCustomerId(userID);
            cart.setItemId(productID);
            cart.setQuantity(quantity);
            em.persist(cart);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
            return false;
        } finally {
            em.close();
        }
    }
}
