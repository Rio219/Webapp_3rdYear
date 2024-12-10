package com.webapp3rdyear.controller.seller;

import java.io.IOException;
import java.util.List;

import com.webapp3rdyear.entity.UserModel;
import com.webapp3rdyear.service.UserService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/seller" })
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService;

	public HomeController() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<UserModel> list = userService.getAllSellers();
		request.setAttribute("listS", list);
		request.getRequestDispatcher("/view/seller/home.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
