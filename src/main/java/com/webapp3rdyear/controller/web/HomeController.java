package com.webapp3rdyear.controller.web;

import java.io.IOException;

import com.webapp3rdyear.configs.JPAConfig;
import com.webapp3rdyear.entity.UserModel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/home"})
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		HttpSession session = request.getSession(true);
		if (session != null && session.getAttribute("user") != null) {
			UserModel user = (UserModel) session.getAttribute("user");
			
			// Lấy số đơn hàng đang chờ xử lý
			try {
				EntityManager em = JPAConfig.getEntityManager();
				TypedQuery<Long> query = em.createQuery(
					"SELECT COUNT(o) FROM OrderModel o WHERE o.customerId = :customerId AND o.status IN (0, 1)", 
					Long.class);
				query.setParameter("customerId", user.getUserId());
				Long pendingOrdersCount = query.getSingleResult();
				
				request.setAttribute("pendingOrdersCount", pendingOrdersCount);
				
				em.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		// Tiếp tục xử lý hiện tại của bạn
		String action = request.getParameter("action");
		if ("login".equals(action)) {
			response.sendRedirect("login");
		} 
		else if("signup".equals(action)){
			response.sendRedirect("signup");
		}
		else {
			request.getRequestDispatcher("/views/web/home.jsp").forward(request, response);
		}
	}
}