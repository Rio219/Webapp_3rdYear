package com.webapp3rdyear.service;

import com.webapp3rdyear.entity.UserModel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class UserService {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("webapp_3rdyear");

	public void updateUser(UserModel user) {
	    EntityManager em = emf.createEntityManager();
	    try {
	        em.getTransaction().begin();
	        em.merge(user);
	        em.getTransaction().commit();
	    } catch (Exception e) {
	        if (em.getTransaction().isActive()) {
	            em.getTransaction().rollback();
	        }
	        e.printStackTrace();
	    } finally {
	        em.close();
	    }
	} 
}
