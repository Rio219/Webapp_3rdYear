package com.webapp3rdyear.controller.user.seller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.webapp3rdyear.dao.UsersDAO;


@WebServlet(urlPatterns = {"/deleteseller"})

public class DeleteSellerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public DeleteSellerController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("sid");
		UsersDAO dao = new UsersDAO();
		dao.deleteUser(id);
		response.sendRedirect("sellers");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
