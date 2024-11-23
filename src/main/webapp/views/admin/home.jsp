<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ include file="/commons/taglibs.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>UX/UI</title>
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css2?family=Material+Symbols+Sharp:opsz,wght,FILL,GRAD@48,400,0,0" />
<link rel="stylesheet" href="template/web/web.css">
<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css" />
<script src="template/web/js/script.js"></script>
</head>

<body>
	<div class="container">
		<!-- aside section start -->
		<aside>

			<div class="top">

				<div class="logo">
					<h2>
						B<span class="danger">lOOM</span>
					</h2>
				</div>
				<div class="close" id="close_btn">
					<span class="material-symbols-sharp">close</span>
				</div>
			</div>
			<!-- end top -->

			<div class="sidebar">
				<a href="#"> <span class="material-symbols-sharp">home_and_garden</span>
					<span>Home</span>
				</a> <a href="#" class="active"> <span
					class="material-symbols-sharp">face_2</span> <span>Accounts</span>
				</a> <a href="#"> <span class="material-symbols-sharp">yard</span> <span>Vouchers</span>
					<span class="msg_count">14</span>
				</a> <a href="#"> <span class="material-symbols-sharp">local_florist</span>
					<span>Products</span>
				</a> <a href="#"> <span class="material-symbols-sharp">receipt_long</span>
					<span>Orders</span>
				</a> <a href="#"> <span class="material-symbols-sharp">insights</span>
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
			</div>


			<a href="#"> <span class="material-symbols-sharp">logout</span> <span>Logout</span>
			</a>
		</aside>
		<!-- aside section end -->

		<!-- main section start -->
		<main>
			<div class="info-page">
				<h1>Account management</h1>
				<div class="address">
					<p>Home/Accounts</p>
				</div>
				<div class="btn">
					<i class="fa-solid fa-pencil"></i>
					<button class="btn-add">New Account</button>
				</div>
			</div>

			<!-- start accounts_table -->
			<div class="operation-management">
				<div class="selection">
					<select name="numbers" id="numbers">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="6">6</option>
					</select>
					<p>entries per page</p>
				</div>
				<div class="group">
					<span class="material-symbols-sharp">search</span> <input
						class="input-search" type="search" placeholder="Search" />
				</div>
			</div>
			<div class="accounts_table">
				<table>
					<thead>
						<tr>
							<th>Customer ID</th>
							<th>Account name</th>
							<th>Password</th>
							<th>Update</th>
							<th>Thao tác</th>
						</tr>
					</thead>
					<tbody>

						<tr>
							<td>Mini USB</td>
							<td>456</td>
							<td>Due</td>
							<td class="warning">Pending</td>
							<td class="ope-btn">
								<button class="btn-edit">
									<i class="fa-solid fa-pencil"></i>
								</button>
								<button class="btn-delete">
									<i class="fa-solid fa-trash-can"></i>
								</button>
							</td>
						</tr>

						<tr>
							<td>Mini USB</td>
							<td>456</td>
							<td>Due</td>
							<td class="warning">Pending</td>
							<td class="primary">Details</td>
						</tr>
						<tr>
							<td>Mini USB</td>
							<td>456</td>
							<td>Due</td>
							<td class="warning">Pending</td>
							<td class="primary">Details</td>
						</tr>

						<tr>
							<td>Mini USB</td>
							<td>456</td>
							<td>Due</td>
							<td class="warning">Pending</td>
							<td class="primary">Details</td>
						</tr>


					</tbody>
				</table>
			</div>

		</main>
		<!-- main section end -->

		<!-- right section start -->
		<div class="right">
			<div class="top">

				<button id="menu_bar">
					<span class="material-symbols-sharp">menu</span>
				</button>
				<div class="theme-toggler">
					<span class="material-symbols-sharp active">light_mode</span> <span
						class="material-symbols-sharp">dark_mode</span>

				</div>

				<div class="profile">
					<div class="info">
						<p>
							<b>Barbar</b>
						</p>
						<p>Admin</p>
						<small class="text-muted"></small>
					</div>
					<div class="profile-photo">
						<img src="images/profile-1.jpg" alt="">
					</div>
				</div>
			</div>
			<div class="recent_updates">
				<h2>Recent Update</h2>
				<div class="updates">
					<div class="update">
						<div class="profile-photo">
							<img src="images/profile-2.jpg" alt="">
						</div>
						<div class="message">
							<p>
								<b>Barbar</b> Recived his order
							</p>
						</div>
					</div>
					<div class="update">
						<div class="profile-photo">
							<img src="images/profile-2.jpg" alt="">
						</div>
						<div class="message">
							<p>
								<b>Barbar</b> Recived his order
							</p>
						</div>
					</div>
					<div class="update">
						<div class="profile-photo">
							<img src="images/profile-2.jpg" alt="">
						</div>
						<div class="message">
							<p>
								<b>Barbar</b> Recived his order
							</p>
						</div>
					</div>
				</div>
			</div>
			<div class="sales_analytics">
				<h2>Sales Analytics</h2>
				<div class="item onlion">
					<div class="icon">
						<span class="material-symbols-sharp">shopping_cart</span>
					</div>
					<div class="right_text">
						<div class="info">
							<span>onlion orders</span> <small class="text-muted">Last
								seen 2 hours</small>
						</div>
						<h5 class="danger">-17%</h5>
						<span>3849</span>
					</div>
				</div>

				<div class="item onlion">
					<div class="icon">
						<span class="material-symbols-sharp">shopping_cart</span>
					</div>
					<div class="right_text">
						<div class="info">
							<span>onlion orders</span> <small class="text-muted">Last
								seen 2 hours</small>
						</div>
						<h5 class="danger">-17%</h5>
						<span>3849</span>
					</div>
				</div>

				<div class="item onlion">
					<div class="icon">
						<span class="material-symbols-sharp">shopping_cart</span>
					</div>
					<div class="right_text">
						<div class="info">
							<span>onlion orders</span> <small class="text-muted">Last
								seen 2 hours</small>
						</div>
						<h5 class="danger">-17%</h5>
						<span>3849</span>
					</div>
				</div>
			</div>
			<div class="item add_products">
				<div>
					<span class="material-symbols-sharp">add</span>
				</div>
			</div>
		</div>
		<!--end top-->
		<!-- start recent updates-->

		<!-- end recent update -->
		<!-- start sale analytic-->

		<!-- end sale analytic-->

	</div>
</body>

</html>
