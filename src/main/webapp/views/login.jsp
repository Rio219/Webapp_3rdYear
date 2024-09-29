<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<div class="content">
		<div class="container">
			<div class="row">
				<div class="col-md-6 order-md-2">
					<img src="template/login/images/undraw_file_sync_ot38.svg"
						alt="Image" class="img-fluid">
				</div>
				<div class="col-md-6 contents">
					<div class="row justify-content-center">
						<div class="col-md-8">
							<div class="mb-4">
								<h3>
									Sign In to <strong>Tree Shop</strong>
								</h3>
								<p class="mb-4">More tree, more life</p>
							</div>
							<form action="#" method="post">
								<div class="form-group first">
									<label for="username">Username</label> <input type="text"
										class="form-control" id="username">
								</div>
								<div class="form-group last mb-4">
									<label for="password">Password</label> <input type="password"
										class="form-control" id="password">

								</div>

								<div class="d-flex mb-5 align-items-center">
									<span class="caption">Remember me</span> 
									<input type="checkbox" checked="checked" name="remeber me" />
										<div class="control_indicator"></div> 
									<span class="ml-auto"><a href="#" class="forgot-pass">Forgot Password</a></span>
								</div>
								<input type="submit" value="Log In"
									class="btn text-white btn-block btn-primary"> <span
									class="d-block text-left my-4 text-muted"> or sign in
									with</span>

								<div class="social-login">
									<a href="#" class="facebook"> <span
										class="icon-facebook mr-3"></span>
									</a> <a href="#" class="twitter"> <span
										class="icon-twitter mr-3"></span>
									</a> <a href="#" class="google"> <span class="icon-google mr-3"></span>
									</a>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src="template/login/js/jquery-3.3.1.min.js"></script>
	<script src="template/login/js/popper.min.js"></script>
	<script src="template/login/js/bootstrap.min.js"></script>
	<script src="template/login/js/main.js"></script>
</body>
</html>