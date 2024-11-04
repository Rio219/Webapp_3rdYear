package com.webapp3rdyear.controller.web;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import com.webapp3rdyear.entity.UserModel;
import com.webapp3rdyear.service.LoginService;

@WebServlet(urlPatterns = { "/login", "/logout" })
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LoginService loginService = new LoginService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		String action = req.getServletPath();
		
		if ("/logout".equals(action)) {
			HttpSession session = req.getSession(false);
			if (session != null) {
				session.invalidate();
			}
			resp.sendRedirect(req.getContextPath() + "/home");
			return;
		}
		
		// Kiểm tra nếu user đã login
		HttpSession session = req.getSession(false);
		if (session != null && session.getAttribute("userModel") != null) {
			resp.sendRedirect(req.getContextPath() + "/home");
			return;
		}
		
		// Hiển thị form login
		req.getRequestDispatcher("/views/login.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		
		try {
			// Lấy thông tin đăng nhập
			String loginName = req.getParameter("loginName");
			String password = req.getParameter("password");
			
			// Kiểm tra null hoặc rỗng
			if (loginName == null || loginName.trim().isEmpty() ||
				password == null || password.trim().isEmpty()) {
				
				req.setAttribute("error", "Vui lòng nhập đầy đủ thông tin đăng nhập");
				req.getRequestDispatcher("/views/login.jsp").forward(req, resp);
				return;
			}
			
			// Kiểm tra đăng nhập
			UserModel user = loginService.checkLogin(loginName, password);
			
			if (user != null) {
				// Tạo session
				HttpSession session = req.getSession(true);
				session.setAttribute("userModel", user);
				
				// Chuyển hướng theo role
				switch (user.getType()) {
					case 1: // User thường
						resp.sendRedirect(req.getContextPath() + "/home");
						break;
					case 2: // Admin
						resp.sendRedirect(req.getContextPath() + "/admin");
						break;
					case 3: // Seller
						resp.sendRedirect(req.getContextPath() + "/seller");
						break;
					case 4: // Shipper
						resp.sendRedirect(req.getContextPath() + "/shipper");
						break;
					default:
						resp.sendRedirect(req.getContextPath() + "/home");
				}
			} else {
				req.setAttribute("error", "Tên đăng nhập hoặc mật khẩu không đúng");
				req.getRequestDispatcher("/views/login.jsp").forward(req, resp);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("error", "Có lỗi xảy ra: " + e.getMessage());
			req.getRequestDispatcher("/views/login.jsp").forward(req, resp);
		}
	}
}

