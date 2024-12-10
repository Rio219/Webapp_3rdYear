package com.webapp3rdyear.service;

import java.util.List;

import com.webapp3rdyear.entity.UserModel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class UserService {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("webapp_3rdyear");
    

	public List<UserModel> getAllSellers() {
	    EntityManager em = emf.createEntityManager();
        String jpql = "SELECT u FROM Users u WHERE u.type = 2";
        TypedQuery<UserModel> query = em.createQuery(jpql, UserModel.class);
        return query.getResultList();
    }

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

	public List<UserModel> getAllShippers() {
	    EntityManager em = emf.createEntityManager();
	    String jpql = "SELECT u FROM Users u WHERE u.type = 3";
	    TypedQuery<UserModel> query = em.createQuery(jpql, UserModel.class);
	    return query.getResultList();
	}
}
