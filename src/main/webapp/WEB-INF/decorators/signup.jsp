<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Đăng ký tài khoản GARDENIA</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style>
body {
	background-color: #f8f9fa;
	display: flex;
	justify-content: center;
	align-items: center;
	min-height: 100vh;
}

.content {
	width: 100%;
	max-width: 1000px;
	padding: 20px;
}

.form-container {
	background-color: white;
	border-radius: 10px;
	padding: 30px;
	box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
}

.form-group {
	margin-bottom: 20px;
}

.form-control {
	height: 45px;
}

.btn-primary {
	height: 45px;
	font-size: 16px;
	background-color: #4CAF50;
	border: none;
}

.social-login a {
	display: inline-block;
	width: 35px;
	height: 35px;
	line-height: 35px;
	text-align: center;
	border-radius: 50%;
	margin-right: 10px;
	color: white;
}

.social-login .facebook {
	background-color: #3b5998;
}

.social-login .twitter {
	background-color: #1da1f2;
}

.social-login .google {
	background-color: #db4437;
}

.img-container {
	display: flex;
	align-items: center;
	justify-content: center;
	height: 100%;
}
</style>
</head>
<body>
	<sitemesh:write property='body' />
</body>
</html>