package com.webapp3rdyear.controller.web;

import java.io.IOException;

import com.webapp3rdyear.entity.UserModel;
import com.webapp3rdyear.service.UserService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/profile"})
public class EditProfileController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/views/profile.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    HttpSession session = req.getSession();
	    UserModel user = (UserModel) session.getAttribute("user");
	    System.out.print("1");
	    if (user != null) {
	        String fullName = req.getParameter("fullName");
	        String email = req.getParameter("email");
	        String phone = req.getParameter("phone");
	        String address = req.getParameter("address");

	        // Cập nhật thông tin người dùng
	        String[] nameParts = fullName.split(" ", 2);
	        user.setFirstName(nameParts[0]);
	        user.setLastName(nameParts.length > 1 ? nameParts[1] : "");
	        user.setEmail(email);
	        user.setPhone(phone);
	        user.setAddress(address);

	        // Gọi phương thức updateUser để lưu thông tin vào cơ sở dữ liệu
	        UserService userService = new UserService();
	        userService.updateUser(user);

	        // Cập nhật lại thông tin trong session
	        session.setAttribute("user", user);	
	        resp.sendRedirect(req.getContextPath() + "/profile");
	    } else {
	    	resp.sendRedirect(req.getContextPath() + "/login"); // Nếu không có người dùng, chuyển hướng đến trang đăng nhập
	    }
	}
}