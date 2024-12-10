package com.webapp3rdyear.controller.shipper;

import java.io.IOException;
import java.util.List;

import com.webapp3rdyear.entity.UserModel;
import com.webapp3rdyear.service.UserService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/shippers"})
public class HomeController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserService userService;

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		List<UserModel> list = userService.getAllShippers();
		req.setAttribute("listS", list);
		req.getRequestDispatcher("/view/shipper/home.jsp").
				forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);	}
}
