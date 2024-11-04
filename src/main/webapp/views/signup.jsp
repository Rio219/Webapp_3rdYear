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
						<img src="template/login/images/Image_Login.png"
							alt="Image" class="img-fluid">
					</div>
				</div>
				<div class="col-lg-6">
					<div class="form-container">
						<h3 class="mb-2">
							Đăng ký tài khoản <strong>GARDENIA</strong>
 						</h3>
						<p class="mb-4">Thêm cây xanh, thêm sự sống</p>
						<c:if test="${not empty error}">
							<div class="alert alert-danger" role="alert">
								${error}
							</div>
						</c:if>
						<c:if test="${not empty param.message && param.message == 'signup_success'}">
							<div class="alert alert-success" role="alert">
								Đăng ký thành công! Vui lòng đăng nhập.
							</div>
						</c:if>
						<form action="signup" method="post" id="signupForm">
							<div class="form-group">
								<input type="text" class="form-control" name="loginName" id="loginName"
									placeholder="Tên đăng nhập" required>
							</div>
							<div class="form-group">
								<input type="password" class="form-control" name="password" id="password"
									placeholder="Mật khẩu" required>
							</div>
							<div class="form-group">
								<input type="password" class="form-control" name="retypePassword" id="retypePassword"
									placeholder="Nhập lại mật khẩu" required>
							</div>
							<div class="form-group">
								<input type="text" class="form-control" name="fullName" id="fullName"
									placeholder="Họ và tên" required>
							</div>
							<div class="form-group">
								<input type="email" class="form-control" name="email" id="email"
									placeholder="Email" required>
							</div>
							<div class="form-group">
								<div class="custom-control custom-radio custom-control-inline">
									<input type="radio" id="male" name="gender"
										class="custom-control-input" value="male" required> <label
										class="custom-control-label" for="male">Nam</label>
								</div>
								<div class="custom-control custom-radio custom-control-inline">
									<input type="radio" id="female" name="gender"
										class="custom-control-input" value="female" required>
									<label class="custom-control-label" for="female">Nữ</label>
								</div>
							</div>
							<div class="form-group">
								<input type="date" class="form-control" name="birthday" id="birthday" required>
							</div>
							<div class="form-group">
								<input type="tel" class="form-control" name="phone" id="phone"
									placeholder="Số điện thoại" required>
							</div>
							<div class="form-group">
								<textarea class="form-control" name="address" id="address" rows="3"
									placeholder="Địa chỉ" required></textarea>
							</div>
							<button type="submit" class="btn btn-primary btn-block">Đăng
									ký</button>
						</form>
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

	<!-- Thêm modal xác nhận -->
	<div class="modal fade" id="confirmSignupModal" tabindex="-1" role="dialog" aria-labelledby="confirmSignupModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="confirmSignupModalLabel">Xác nhận đăng ký</h5>
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					Bạn có chắc chắn muốn đăng ký tài khoản với thông tin đã nhập?
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary" data-dismiss="modal" id="cancelSignup">Hủy</button>
					<button type="button" class="btn btn-primary" id="confirmSignup">Xác nhận</button>
				</div>
			</div>
		</div>
	</div>

	<!-- Thêm JavaScript để xử lý modal -->
	<script>
	$(document).ready(function() {
		// Khi form được submit
		$('#signupForm').on('submit', function(e) {
			e.preventDefault(); // Ngăn form submit ngay lập tức
			$('#confirmSignupModal').modal('show'); // Hiển thị modal xác nhận
		});

		// Khi nhấn nút xác nhận trong modal
		$('#confirmSignup').click(function() {
			$('#signupForm')[0].submit(); // Submit form
		});

		// Khi nhấn nút hủy trong modal
		$('#cancelSignup').click(function() {
			// Xóa session và reset form
			$.ajax({
				url: 'signup?action=cancel',
				method: 'POST',
				success: function() {
					$('#signupForm')[0].reset();
					$('#confirmSignupModal').modal('hide');
					window.location.href = 'home'; // Chuyển về trang chủ
				}
			});
		});
	});
	</script>
</body>
</html>
