package com.webapp3rdyear.controller.web;

import java.io.IOException;
import java.util.List;

import com.webapp3rdyear.configs.JPAConfig;
import com.webapp3rdyear.entity.ProductModel;
import com.webapp3rdyear.entity.UserModel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = { "/home" })
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		UserModel user = null;
		
		HttpSession session = request.getSession(true);
		if (session != null && session.getAttribute("user") != null) {
			user = (UserModel) session.getAttribute("user");
		}
		try {
			EntityManager em = JPAConfig.getEntityManager();

			// Phân trang
			int page = 1; // Trang mặc định là 1
			int pageSize = 12; // Số sản phẩm trên mỗi trang
			String pageParam = request.getParameter("page");
			if (pageParam != null) {
				page = Integer.parseInt(pageParam);
			}

			// Truy vấn danh sách sản phẩm với phân trang
			TypedQuery<ProductModel> query = em.createQuery("SELECT p FROM ProductModel p", ProductModel.class);
			query.setFirstResult((page - 1) * pageSize);
			query.setMaxResults(pageSize);

			List<ProductModel> products = query.getResultList();

			// Đếm tổng số sản phẩm để tính tổng số trang
			TypedQuery<Long> countQuery = em.createQuery("SELECT COUNT(p) FROM ProductModel p", Long.class);
			Long totalProducts = countQuery.getSingleResult();
			int totalPages = (int) Math.ceil((double) totalProducts / pageSize);

	        long cartItemCount = 0;
	        // Đếm số lượng sản phẩm trong giỏ hàng của người dùng
            TypedQuery<Long> cartCountQuery = em.createQuery(
                "SELECT COUNT(c) FROM CartModel c WHERE c.customerId = :userID", Long.class);
            cartCountQuery.setParameter("userID", user.getUserId());
            cartItemCount = cartCountQuery.getSingleResult().intValue();
			System.out.print(cartItemCount);

			// Gửi dữ liệu sang view
			request.setAttribute("products", products);
			request.setAttribute("currentPage", page);

			request.setAttribute("totalPages", totalPages);
			request.setAttribute("cartItemCount", cartItemCount);

			em.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Chuyển tiếp đến view

		request.getRequestDispatcher("/views/web/home.jsp").forward(request, response);

	}
}
