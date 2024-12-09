package com.webapp3rdyear.controller.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.webapp3rdyear.configs.JPAConfig;
import com.webapp3rdyear.dto.CartDetailDTO;
import com.webapp3rdyear.entity.CartModel;
import com.webapp3rdyear.entity.ItemModel;
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

@WebServlet(urlPatterns = { "/cart" })

public class CartController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		if (session != null && session.getAttribute("user") != null) {
			UserModel user = (UserModel) session.getAttribute("user");
			String sessionId = session.getId();
			System.out.println("Session ID cart: " + sessionId);
			EntityManager em = JPAConfig.getEntityManager();
			try {
				TypedQuery<Object[]> query = em.createQuery(
						"SELECT c, i, p FROM CartModel c " + "JOIN ItemModel i ON c.itemId = i.itemId "
								+ "JOIN ProductModel p ON i.productId = p.productId " + "WHERE c.customerId = :userID",
						Object[].class);
				query.setParameter("userID", user.getUserId());
				List<Object[]> results = query.getResultList();
				List<CartDetailDTO> cartDetails = new ArrayList<>();
				for (Object[] result : results) {
					CartModel cart = (CartModel) result[0];
					ItemModel item = (ItemModel) result[1];
					ProductModel product = (ProductModel) result[2];

					CartDetailDTO dto = new CartDetailDTO();
					dto.setCartId(cart.getCartId());
					dto.setItemColor(item.getColor());
					dto.setItemColorCode(item.getColorCode());
					dto.setItemOriginalPrice(item.getOriginalPrice());
					dto.setItemStock(item.getStock());
					dto.setProductName(product.getpName());
					dto.setQuantity(cart.getQuantity());

					cartDetails.add(dto);
				}
	            // In ra từng chi tiết trong giỏ hàng
	            for (CartDetailDTO dto : cartDetails) {
	                System.out.println("Cart ID: " + dto.getCartId());
	                System.out.println("Product Name: " + dto.getProductName());
	                System.out.println("Item Color: " + dto.getItemColor());
	                System.out.println("Item Color Code: " + dto.getItemColorCode());
	                System.out.println("Item Price: " + dto.getItemOriginalPrice());
	                System.out.println("Item Stock: " + dto.getItemStock());
	                System.out.println("Quantity: " + dto.getQuantity());
	                System.out.println("-----");
	            }
				req.setAttribute("cartDetails", cartDetails);
			} finally {
				em.close();
			}
		}
		req.getRequestDispatcher("/views/web/products/cartDetail.jsp").forward(req, resp);
	}

}
