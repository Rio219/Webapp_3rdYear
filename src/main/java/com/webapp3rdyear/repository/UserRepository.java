package com.webapp3rdyear.repository;

import com.webapp3rdyear.entity.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Integer> {
    boolean existsByEmailOrPhone(String email, String phone);
}
