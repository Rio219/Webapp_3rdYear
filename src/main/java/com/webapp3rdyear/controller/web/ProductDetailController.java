package com.webapp3rdyear.controller.web;

import java.io.IOException;

import com.webapp3rdyear.configs.JPAConfig;
import com.webapp3rdyear.entity.CartModel;
import com.webapp3rdyear.entity.ProductModel;
import com.webapp3rdyear.entity.UserModel;
import com.webapp3rdyear.service.AddService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = { "/productDetail", "/productDetail/addtocart" })
public class ProductDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("webapp_3rdyear");

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

	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session != null && session.getAttribute("user") != null) {
            UserModel user = (UserModel) session.getAttribute("user");
            EntityManager em = emf.createEntityManager();

                em.getTransaction().begin();

                // Lấy productId từ request
                String productId = request.getParameter("productId");
                System.out.println("Product ID: " + productId);
                System.out.println("Customer ID: " + user.getUserId());

               AddService add = new AddService();
               add.addtoCart(user.getUserId(), Integer.parseInt(productId), 1);
               System.out.print(add.addtoCart(Integer.parseInt(productId), user.getUserId(), 1));

            // Chuyển hướng về trang chi tiết sản phẩm hoặc trang giỏ hàng
            response.sendRedirect(request.getContextPath() + "/productDetail?id=" + request.getParameter("productId"));
        } else {
            // Nếu người dùng chưa đăng nhập, chuyển hướng đến trang đăng nhập
            response.sendRedirect(request.getContextPath() + "/login");
        }
    }

}
