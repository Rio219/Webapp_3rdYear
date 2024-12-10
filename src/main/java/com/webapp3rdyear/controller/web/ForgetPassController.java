package com.webapp3rdyear.controller.web;

import java.io.IOException;

import com.webapp3rdyear.entity.UserModel;
import com.webapp3rdyear.utils.EmailUtils;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/forgetPassword")
public class ForgetPassController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
        req.getRequestDispatcher("views/forgetPassword.jsp").forward(req, resp);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");

        // Tạo đối tượng UserModel và thiết lập email
        UserModel user = new UserModel();
        user.setEmail(email);

        // Gọi hàm gửi email
        EmailUtils emailUtils = new EmailUtils();
        boolean emailSent = emailUtils.sendEmail(user);

        if (emailSent) {
            request.setAttribute("message", "Verification code sent to your email.");
        } else {
            request.setAttribute("message", "Failed to send email. Please try again.");
        }

        request.getRequestDispatcher("views/forgetPassword.jsp").forward(request, response);
    }
}
