<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<%@ page import="com.webapp3rdyear.entity.UserModel"%>

<style>
.user-avatar, .dropdown-avatar {
	width: 50px;
	height: 50px;
	object-fit: cover;
	border-radius: 50%;
}

.navbar {
    padding: 1.2rem 1rem;
    font-size: 1.2rem;
}
</style>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
	<div class="container px-4 px-lg-5">
		<a class="navbar-brand" href="${pageContext.request.contextPath}"><strong>GARDENIA</strong></a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4">
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="#!">Home</a></li>
				<li class="nav-item"><a class="nav-link" href="#!">About</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" id="navbarDropdown" href="#"
					role="button" data-bs-toggle="dropdown" aria-expanded="false">Shop</a>
					<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
						<li><a class="dropdown-item" href="#!">All Products</a></li>
						<li><hr class="dropdown-divider" /></li>
						<li><a class="dropdown-item" href="#!">Popular Items</a></li>
						<li><a class="dropdown-item" href="#!">New Arrivals</a></li>
					</ul></li>
			</ul>
			<div class="d-flex align-items-center">
				<a href="cart" class="btn btn-outline-dark me-3" type="button">
					<i class="bi-cart-fill me-1"></i> Cart <span class="badge bg-dark text-white ms-1 rounded-pill">${cartItemCount}</span>
				</a>
				<%
				UserModel user = (UserModel) session.getAttribute("user");
				if (user != null) {
				%>
				<div class="dropdown">
					<div class="avatar-dropdown" id="userDropdown"
						data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
						<img
							src="<%=user.getAvatar() != null ? user.getAvatar() : "template/web/defaultAvatar.jpg"%>"
							alt="Avatar" class="user-avatar">
					</div>
					<div class="dropdown-menu dropdown-menu-right"
						aria-labelledby="userDropdown">
						<div class="dropdown-header">
							<div class="user-info">
								<img
									src="<%=user.getAvatar() != null ? user.getAvatar() : "template/web/defaultAvatar.jpg"%>"
									alt="Avatar" class="dropdown-avatar">
								<div class="user-details">
									<span class="user-name"><%=user.getFirstName() + " " + user.getLastName()%></span>
								</div>
							</div>
						</div>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="profile"> <i
							class="fas fa-user"></i> Thông Tin Cá Nhân
						</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="logout"> <i
							class="fas fa-sign-out-alt"></i> Đăng xuất
						</a>
					</div>
				</div>
				<%
				} else {
				%>
				<a href="login" class="btn btn-outline-primary me-2">Login</a> <a
					href="signup" class="btn btn-primary">Signup</a>
				<%
				}
				%>
			</div>
		</div>
	</div>
</nav>