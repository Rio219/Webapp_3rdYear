package com.webapp3rdyear.controller.web;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.webapp3rdyear.entity.AccountModel;
import com.webapp3rdyear.entity.UserModel;
import com.webapp3rdyear.service.SignupService;
import com.webapp3rdyear.utils.PasswordUtils;

@WebServlet(urlPatterns = {"/signup"})
public class SignupController extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SignupService signupService = new SignupService();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        req.getRequestDispatcher("/views/signup.jsp").forward(req, resp);
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        
        try {
            // Lấy và kiểm tra thông tin từ form
            String loginName = req.getParameter("loginName");
            String password = req.getParameter("password");
            String retypePassword = req.getParameter("retypePassword");
            String fullName = req.getParameter("fullName");
            String email = req.getParameter("email");
            String gender = req.getParameter("gender");
            String birthday = req.getParameter("birthday");
            String phone = req.getParameter("phone");
            String address = req.getParameter("address");
            
            // Kiểm tra null hoặc rỗng
            if (loginName == null || loginName.trim().isEmpty() ||
                password == null || password.trim().isEmpty() ||
                retypePassword == null || retypePassword.trim().isEmpty() ||
                fullName == null || fullName.trim().isEmpty() ||
                email == null || email.trim().isEmpty() ||
                gender == null || gender.trim().isEmpty() ||
                birthday == null || birthday.trim().isEmpty() ||
                phone == null || phone.trim().isEmpty() ||
                address == null || address.trim().isEmpty()) {
                
                req.setAttribute("error", "Vui lòng điền đầy đủ thông tin");
                req.getRequestDispatcher("/views/signup.jsp").forward(req, resp);
                return;
            }
            
            // Validate password
            if (!password.equals(retypePassword)) {
                req.setAttribute("error", "Mật khẩu nhập lại không khớp");
                req.getRequestDispatcher("/views/signup.jsp").forward(req, resp);
                return;
            }
            
            // Kiểm tra username tồn tại
            if (signupService.isLoginNameExists(loginName)) {
                req.setAttribute("error", "Tên đăng nhập đã tồn tại");
                req.getRequestDispatcher("/views/signup.jsp").forward(req, resp);
                return;
            }
            
            // Kiểm tra email hoặc số điện thoại tồn tại
            if (signupService.isEmailOrPhoneExists(email, phone)) {
                req.setAttribute("error", "Email hoặc số điện thoại đã được sử dụng");
                req.getRequestDispatcher("/views/signup.jsp").forward(req, resp);
                return;
            }
            
            // Tạo AccountModel với mật khẩu đã mã hóa
            AccountModel account = new AccountModel();
            account.setUserName(loginName);
            String hashedPassword = PasswordUtils.hashPassword(password);
            account.setPassword(hashedPassword);
            
            // Tạo UserModel
            UserModel user = new UserModel();
            
            // Xử lý họ và tên
            String[] nameParts = fullName.split(" ", 2);
            if (nameParts.length > 1) {
                user.setFirstName(nameParts[0]);
                user.setLastName(nameParts[1]);
            } else {
                user.setFirstName(fullName);
                user.setLastName("");
            }
            
            // Set các thông tin khác
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date birthdayDate = sdf.parse(birthday);
            
            user.setEmail(email);
            user.setGender("male".equals(gender));
            user.setDateOfBirth(birthdayDate);
            user.setPhone(phone);
            user.setAddress(address);
            user.setType(1);
            user.setKpi(0);
            
            // Lưu vào database
            if (signupService.registerUser(account, user)) {
                resp.sendRedirect(req.getContextPath() + "/login?message=signup_success");
            } else {
                req.setAttribute("error", "Đăng ký thất bại. Vui lòng thử lại sau");
                req.getRequestDispatcher("/views/signup.jsp").forward(req, resp);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            req.setAttribute("error", "Có lỗi xảy ra: " + e.getMessage());
            req.getRequestDispatcher("/views/signup.jsp").forward(req, resp);
        }
    }
}