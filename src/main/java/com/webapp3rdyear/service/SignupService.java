package com.webapp3rdyear.service;

import com.webapp3rdyear.entity.AccountModel;
import com.webapp3rdyear.entity.UserModel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class SignupService {
    
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("webapp_3rdyear");
    
    public boolean isLoginNameExists(String loginName) {
        EntityManager em = emf.createEntityManager();
        try {
            Query query = em.createQuery("SELECT COUNT(a) FROM AccountModel a WHERE a.userName = :userName");
            query.setParameter("userName", loginName);
            Long count = (Long) query.getSingleResult();
            return count > 0;
        } finally {
            em.close();
        }
    }
    
    public boolean isEmailOrPhoneExists(String email, String phone) {
        EntityManager em = emf.createEntityManager();
        try {
            Query query = em.createQuery(
                "SELECT COUNT(u) FROM UserModel u WHERE u.email = :email OR u.phone = :phone");
            query.setParameter("email", email);
            query.setParameter("phone", phone);
            Long count = (Long) query.getSingleResult();
            return count > 0;
        } finally {
            em.close();
        }
    }
    
    public boolean registerUser(AccountModel account, UserModel user) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            account.setUser(user);
            em.persist(account);
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
