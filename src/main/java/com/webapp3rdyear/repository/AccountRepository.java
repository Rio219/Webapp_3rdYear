package com.webapp3rdyear.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webapp3rdyear.entity.AccountModel;

@Repository
public interface AccountRepository extends JpaRepository<AccountModel, Integer> {
    boolean existsByUserName(String userName);
    AccountModel findByUserName(String userName);
}
