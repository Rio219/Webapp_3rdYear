package com.webapp3rdyear.controller.web;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/login", "/waiting", "/logout" })
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getRequestURI().toString();
		if (url.contains("login"))
			req.getRequestDispatcher("/views/login.jsp").forward(req, resp);
		else {
            req.getRequestDispatcher("/views/web/home.jsp").forward(req, resp);
        }
	}
}

