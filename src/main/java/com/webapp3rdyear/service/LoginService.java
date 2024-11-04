package com.webapp3rdyear.service;

import com.webapp3rdyear.entity.AccountModel;
import com.webapp3rdyear.entity.UserModel;
import com.webapp3rdyear.utils.PasswordUtils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
	
public class LoginService {
    
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("webapp_3rdyear");
    
    public UserModel checkLogin(String loginName, String password) {
        EntityManager em = emf.createEntityManager();
        try {
            TypedQuery<AccountModel> query = em.createQuery(
                "SELECT a FROM AccountModel a WHERE a.userName = :userName", 
                AccountModel.class);
            query.setParameter("userName", loginName);
            
            AccountModel account = query.getSingleResult();
            if (account != null && PasswordUtils.checkPassword(password, account.getPassword())) {
                return account.getUser();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return null;
    }
}
