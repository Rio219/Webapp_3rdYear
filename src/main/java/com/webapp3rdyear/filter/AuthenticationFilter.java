package com.webapp3rdyear.filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import com.webapp3rdyear.entity.UserModel;

@WebFilter(urlPatterns = {"/admin/*", "/seller/*", "/shipper/*"})
public class AuthenticationFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        
        HttpSession session = req.getSession(false);
        
        boolean isLoggedIn = (session != null && session.getAttribute("userModel") != null);
        
        if (isLoggedIn) {
            UserModel user = (UserModel) session.getAttribute("userModel");
            String requestURI = req.getRequestURI();
            
            boolean isAuthorized = false;
            
            if (requestURI.contains("/admin/") && user.getType() == 2) {
                isAuthorized = true;
            } else if (requestURI.contains("/seller/") && user.getType() == 3) {
                isAuthorized = true;
            } else if (requestURI.contains("/shipper/") && user.getType() == 4) {
                isAuthorized = true;
            }
            
            if (isAuthorized) {
                chain.doFilter(request, response);
            } else {
                resp.sendRedirect(req.getContextPath() + "/home");
            }
        } else {
            resp.sendRedirect(req.getContextPath() + "/login");
        }
    }

    @Override
    public void destroy() {
    }
}
