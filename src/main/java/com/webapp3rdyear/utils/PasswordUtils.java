package com.webapp3rdyear.utils;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordUtils {
    
    // Mã hóa mật khẩu
    public static String hashPassword(String plainTextPassword) {
        return BCrypt.hashpw(plainTextPassword, BCrypt.gensalt(12));
    }
    
    // Kiểm tra mật khẩu
    public static boolean checkPassword(String plainTextPassword, String hashedPassword) {
        return BCrypt.checkpw(plainTextPassword, hashedPassword);
    }
}
