<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/commons/taglibs.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/template/web/css/style.css">
</head>
<body>
	<div class="sidebar">
		<a href="#"> <span class="material-symbols-sharp">home_and_garden</span>
			<span>Home</span>
		</a> <a href="#" class="active"> <span class="material-symbols-sharp">face_2</span>
			<span>Accounts</span>
		</a> <a href="#"> <span class="material-symbols-sharp">yard</span> <span>Vouchers</span>
			<span class="msg_count">14</span>
		</a> <a href="#"> <span class="material-symbols-sharp">local_florist</span>
			<span>Products</span>
		</a> <a href="#"> <span class="material-symbols-sharp">receipt_long</span>
			<span>Orders</span>
		</a>
		<!-- <a href="#">
                    <span class="material-symbols-sharp">emoji_nature</span>
                    <span>Users</span>
                </a> -->
		<a href="#"> <span class="material-symbols-sharp">insights</span>
			<span>KPI</span>
		</a>
		<div class="dropdown">
			<a href="#" class="dropdown-toggle"> <span
				class="material-symbols-sharp">emoji_nature</span> <span>Users</span>
			</a>
			<div class="dropdown-menu">
				<a href="#">User List</a> <a href="#">Add User</a> <a href="#">User
					Roles</a>
			</div>
		</div>

		<a href="#"> <span class="material-symbols-sharp">logout</span> <span>Logout</span>
		</a>

	</div>
</body>
</html>