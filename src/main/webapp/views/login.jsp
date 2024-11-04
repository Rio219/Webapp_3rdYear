<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
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
						
						<!-- Hiển thị thông báo lỗi -->
						<c:if test="${not empty error}">
							<div class="alert alert-danger" role="alert">
								${error}
							</div>
						</c:if>
						
						<!-- Hiển thị thông báo thành công -->
						<c:if test="${not empty param.message}">
							<div class="alert alert-success" role="alert">
								<c:choose>
									<c:when test="${param.message == 'signup_success'}">
										Đăng ký thành công! Vui lòng đăng nhập.
									</c:when>
									<c:when test="${param.message == 'logout_success'}">
										Đăng xuất thành công!
									</c:when>
								</c:choose>
							</div>
						</c:if>
						
						<form action="login" method="post">
							<div class="form-group">
								<input type="text" class="form-control" name="loginName"
									id="loginName" placeholder="Tên đăng nhập" required>
							</div>
							<div class="form-group">
								<input type="password" class="form-control" name="password"
									id="password" placeholder="Mật khẩu" required>
							</div>
							<div class="form-group form-check">
								<input type="checkbox" class="form-check-input" 
									name="rememberMe" id="rememberMe">
								<label class="form-check-label" for="rememberMe">
									Ghi nhớ đăng nhập
								</label>
							</div>
							<button type="submit" class="btn btn-primary btn-block">
								Đăng nhập
							</button>
						</form>
						
						<p class="text-center mt-3">
							<a href="forgot-password">Quên mật khẩu?</a> | 
							<a href="signup">Đăng ký tài khoản mới</a>
						</p>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<!-- JavaScript validation -->
	<script>
	document.querySelector('form').addEventListener('submit', function(e) {
		var loginName = document.getElementById('loginName').value.trim();
		var password = document.getElementById('password').value.trim();
		
		if (loginName === '' || password === '') {
			e.preventDefault();
			alert('Vui lòng nhập đầy đủ thông tin đăng nhập!');
			return false;
		}
	});
	</script>
</body>
</html>