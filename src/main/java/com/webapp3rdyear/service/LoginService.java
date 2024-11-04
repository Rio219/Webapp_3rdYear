package com.webapp3rdyear.service;

import com.webapp3rdyear.entity.AccountModel;
import com.webapp3rdyear.entity.UserModel;
import com.webapp3rdyear.utils.PasswordUtils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.NoResultException;

public class LoginService {
    
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("webapp_3rdyear");
    
    public UserModel checkLogin(String username, String password) {
        EntityManager em = emf.createEntityManager();
        try {
            System.out.println("Checking login for username: " + username);
            
            TypedQuery<AccountModel> query = em.createQuery(
                "SELECT a FROM AccountModel a WHERE a.userName = :username", 
                AccountModel.class);
            query.setParameter("username", username);
            
            AccountModel account = query.getSingleResult();
            System.out.println("Found account: " + (account != null ? account.getUserName() : "null"));
            
            if (account != null && PasswordUtils.checkPassword(password, account.getPassword())) {
                TypedQuery<UserModel> userQuery = em.createQuery(
                    "SELECT u FROM UserModel u WHERE u.userId = :userId",
                    UserModel.class);
                userQuery.setParameter("userId", account.getUserId());
                
                UserModel user = userQuery.getSingleResult();
                System.out.println("Found user: " + (user != null ? user.getFirstName() : "null"));
                
                return user;
            }
        } catch (NoResultException e) {
            System.out.println("No account found for username: " + username);
            return null;
        } catch (Exception e) {
            System.out.println("Error during login: " + e.getMessage());
            e.printStackTrace();
        } finally {
            em.close();
        }
        return null;
    }
}
