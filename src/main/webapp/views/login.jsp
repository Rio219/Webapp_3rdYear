<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<div class="content">
		<div class="container-fluid">
			<div class="row">
				<div class="col-lg-6">
					<div class="img-container">
						<img src="template/login/images/Image_Login.png" alt="Image"
							class="img-fluid">
					</div>
				</div>
				<div class="col-lg-6">
					<div class="form-container">
						<h3 class="mb-3">
							Đăng nhập <strong>GARDENIA</strong>
						</h3>
						<p class="mb-4">Thêm cây xanh, thêm sự sống</p>
						<form action="#" method="post">
							<div class="form-group">
								<input type="text" class="form-control" id="loginName"
									placeholder="Tên đăng nhập" required>
							</div>
							<div class="form-group">
								<input type="password" class="form-control" id="password"
									placeholder="Mật khẩu" required>
							</div>
							<div class="form-group form-check">
								<input type="checkbox" class="form-check-input" id="rememberMe">
								<label class="form-check-label" for="rememberMe">Ghi nhớ
									đăng nhập</label>
							</div>
							<button type="submit" class="btn btn-primary btn-block">Đăng
								nhập</button>
						</form>
						<p class="text-center mt-3">
							<a href="#">Quên mật khẩu?</a> | <a href="signup.jsp">Đăng ký
								tài khoản mới</a>
						</p>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	<script src="https://kit.fontawesome.com/your-fontawesome-kit.js"></script>
</body>
</html>