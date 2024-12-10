<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.webapp3rdyear.entity.ProductModel"%>

<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<head>
<meta charset="UTF-8">
<title>Trang Chủ</title>
<!-- Bootstrap CSS -->
<link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
    rel="stylesheet">
<!-- Font Awesome -->
<link
    href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
    rel="stylesheet">
<!-- Custom CSS -->
<link href="template/web/css/styles.css" rel="stylesheet">

<!-- jQuery -->
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<!-- Bootstrap JS -->
<script
    src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<!-- Custom JS -->
<script src="template/web/js/main.js"></script>
</head>
<body>
    <header class="bg-dark py-6"
        style="background-image: url('template/web/pic_welcome.png'); background-size: cover; background-position: center; display: flex; align-items: center; justify-content: center; height: 70vh;">
        <div class="container px-4 px-lg-5 text-center text-white">
            <h1 class="display-4 fw-bolder"
                style="text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.7);">Thêm cây
                xanh, thêm sự sống</h1>
            <p class="lead fw-normal text-white-50 mb-0"
                style="text-shadow: 1px 1px 3px rgba(0, 0, 0, 0.7); font-size: 1.5rem;">Mang
                thiên nhiên đến gần bạn hơn</p>
        </div>
    </header>
    <!-- Section-->
    <section class="py-5">
        <div class="container px-4 px-lg-5 mt-5">
            <div
                class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">
                <c:forEach var="product" items="${products}">
                    <div class="col mb-5">
                        <div class="card h-100">
                            <!-- Product image-->
                            <img src="${product.imageUrl}" class="card-img-top" alt="${product.pName}" />
                            <!-- Product details-->
                            <div class="card-body p-4">	 	
                                <div class="text-center">
                                    <!-- Product name-->
                                    <h5 class="fw-bolder">${product.pName}</h5>
                                    <!-- Product price-->
                                    <c:choose>
                                        <c:when test="${product.originalPrice != null}">
                                            <span class="">${product.originalPrice}</span>
                                    </c:when>
                                        <c:otherwise>
                                        ${product.originalPrice}
                                    </c:otherwise>
                                    </c:choose>
                                </div>
                            </div>
                            <!-- Product actions-->
                            <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                                <div class="text-center">
                                    <a class="btn btn-outline-dark mt-auto" href="productDetail?id=${product.productId}">Xem chi tiết</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>

            <!-- Hiển thị điều hướng phân trang -->
            <nav aria-label="Page navigation">
                <ul class="pagination justify-content-center">
                    <c:if test="${currentPage > 1}">
                        <li class="page-item"><a class="page-link"
                            href="?page=${currentPage - 1}" aria-label="Previous"> <span
                                aria-hidden="true">&laquo;</span>
                        </a></li>
                    </c:if>
                    <c:forEach begin="1" end="${totalPages}" var="i">
                        <li
                            class="page-item <c:if test='${i == currentPage}'>active</c:if>">
                            <a class="page-link" href="?page=${i}">${i}</a>
                        </li>
                    </c:forEach>
                    <c:if test="${currentPage < totalPages}">
                        <li class="page-item"><a class="page-link"
                            href="?page=${currentPage + 1}" aria-label="Next"> <span
                                aria-hidden="true">&raquo;</span>
                        </a></li>
                    </c:if>
                </ul>
            </nav>
        </div>
    </section>

</body>
