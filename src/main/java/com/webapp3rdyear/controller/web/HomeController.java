package com.webapp3rdyear.controller.web;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/home"})
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
        if ("login".equals(action)) {
            response.sendRedirect("login"); // Redirect to the LoginController
        } 
        else if("signup".equals(action)){
            response.sendRedirect("signup");
        }
        else {
            request.getRequestDispatcher("/views/web/home.jsp").forward(request, response);
        }
    }
}