package com.webapp3rdyear.controller.web;

import java.io.IOException;

import com.webapp3rdyear.configs.JPAConfig;
import com.webapp3rdyear.entity.ProductModel;

import jakarta.persistence.EntityManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/productDetail" })
public class ProductDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String productId = request.getParameter("id");
		ProductModel product = null;

		EntityManager em = JPAConfig.getEntityManager();

		try {
			em.getTransaction().begin();
			product = em.find(ProductModel.class, Integer.parseInt(productId));
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		} finally {
			if (em.isOpen()) {
				em.close();
			}
		}

		// Gửi dữ liệu sản phẩm đến view
		request.setAttribute("product", product);
		request.getRequestDispatcher("/views/web/products/productDetail.jsp").forward(request, response);
	}
}