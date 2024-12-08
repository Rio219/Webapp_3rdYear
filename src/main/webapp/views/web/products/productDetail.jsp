<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.webapp3rdyear.entity.ProductModel"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Product Page</title>
<!-- Bootstrap CSS (Local or CDN) -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<!-- Slick Slider CSS -->
<link rel="stylesheet" type="text/css"
	href="https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css" />
<link rel="stylesheet" type="text/css"
	href="https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick-theme.css" />

<style>
.related-products-slider .slick-slide {
	margin: 0 10px;
	text-align: center;
}

.related-products-slider .slick-list {
	margin: 0 -10px;
}

.product-card {
	border: 1px solid #e0e0e0;
	border-radius: 8px;
	padding: 15px;
	transition: transform 0.3s;
}

.product-card:hover {
	transform: scale(1.05);
}

.slick-prev, .slick-next {
	z-index: 100;
}
</style>
</head>
<body>
	<div class="container py-4 my-4 mx-auto d-flex flex-column">
		<div class="header">
			<div class="row">
				<div class="col-md-9">
					<h1>${product.pName}</h1>
                    <p>FROM: ${product.supplier}</p>
				</div>
				<div class="col-md-3 text-right">
					<i class="fa fa-star"></i><i class="fa fa-star"></i><i
						class="fa fa-star"></i><i class="fa fa-star"></i><i
						class="fa fa-star"></i>
				</div>
				<p class="text-right">Based on 250 Review</p>
			</div>
		</div>
		<div class="container-body mt-4">
			<div class="row">
				<div class="col-md-5">
					<ul>
						<li>Original Price: ${product.originalPrice}</li>
						<li>100% Quality</li>
						<li>Free Shipping</li>
						<li>Easy Returns</li>
						<li>12 Months Warranty</li>
						<li>EMI Starting from (On Credit Cards)</li>
						<li>Normal Delivery : 4-5 Days</li>
						<li>Express Delivery : 2-3 Days</li>
						<li>COD Available (All Over India)</li>
						<li>Colors Available: White, Green</li>
					</ul>
				</div>
				<div class="col-md-7">
					<img
						src="https://assetscdn1.paytm.com/images/catalog/product/K/KI/KIDTORADO-MUSCUTORA65799297FD22C/1564571511644_0.jpg"
						width="90%" height="95%">
				</div>
			</div>
		</div>
		<div class="footer d-flex flex-column mt-5">
			<div class="row">
				<div class="col-md-2">
					<a href="javascript:void(0);"
						onclick="toggleSection('description')">Description</a>
				</div>
				<div class="col-md-2">
					<a href="javascript:void(0);" onclick="toggleSection('review')">Review</a>
				</div>
				<div class="col-md-2 offset-md-4">
					<a href="#">ADD TO CART</a>
				</div>
				<div class="col-md-2">
					<button type="button" class="btn btn-outline-warning">
						<a href="#">BUY NOW</a>
					</button>
				</div>
			</div>
		</div>
		<div id="description" class="content-section" style="display: none;">
			<h3>Description</h3>
			<p>${product.description}</p>
		</div>
		<div id="review" class="content-section" style="display: none;">
			<h3>Reviews</h3>
			<p>Here are the reviews of the product...</p>
		</div>
	</div>
	<script>
		function toggleSection(sectionId) {
			var section = document.getElementById(sectionId);
			if (section.style.display === "none"
					|| section.style.display === "") {
				section.style.display = "block";
			} else {
				section.style.display = "none";
			}
		}
	</script>
	<script type="text/javascript">
		$(document).ready(function() {
			$('.related-products-slider').slick({
				slidesToShow : 3,
				slidesToScroll : 1,
				autoplay : true,
				autoplaySpeed : 2000,
				arrows : true,
				dots : true,
			});
		});
	</script>
</body>
</html>