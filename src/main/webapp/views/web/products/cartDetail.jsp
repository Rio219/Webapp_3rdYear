<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.webapp3rdyear.entity.CartModel"%>
<%@ page import="com.webapp3rdyear.dto.CartDetailDTO"%>
<%@ page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset='utf-8'>
<meta name='viewport' content='width=device-width, initial-scale=1'>
<title>Shopping Cart</title>
<link
    href='https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css'
    rel='stylesheet'>
<link
    href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css'
    rel='stylesheet'>
<script type='text/javascript'
    src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>
<style>
/* Your styles remain unchanged */
</style>
</head>
<body>
    <div class="container-fluid">
        <div class="row">
            <aside class="col-lg-9">
                <div class="card">
                    <div class="table-responsive">
                        <table class="table table-borderless table-shopping-cart">
                            <thead class="text-muted">
                                <tr class="small text-uppercase">
                                    <th scope="col">Product</th>
                                    <th scope="col" width="120">Quantity</th>
                                    <th scope="col" width="120">Price</th>
                                    <th scope="col" class="text-right d-none d-md-block"
                                        width="200"></th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="dto" items="${cartDetails}">
                                    <tr>
                                        <td>
                                            <figcaption class="info">
                                                <a href="#" class="title text-dark">${dto.productName}</a>
                                                <p class="text-muted small">SIZE: ${dto.itemColor}</p>
                                            </figcaption>
                                        </td>
                                        <td><select class="form-control">
                                                <c:forEach begin="1" end="${dto.itemStock}" var="i">
                                                    <option><c:if test="${i == dto.quantity}">${dto.quantity}</c:if>${i}</option>
                                                </c:forEach>
                                        </select></td>
                                        <td>
                                            <div class="price-wrap">
                                                <var class="price">${dto.itemOriginalPrice}</var>
                                            </div>
                                        </td>
                                        <td class="text-right d-none d-md-block"><a href="#"
                                            class="btn btn-light"
                                            style="background-color: #dc3545; border-color: #dc3545;">Remove</a>
                                        </td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </aside>
            <aside class="col-lg-3">
                <div class="card mb-3">
                    <div class="card-body">
                        <form>
                            <div class="form-group">
                                <label>Have coupon?</label>
                                <div class="input-group">
                                    <input type="text" class="form-control coupon"
                                        placeholder="Coupon code">
                                    <div class="input-group-append">
                                        <button class="btn btn-primary btn-apply">Apply</button>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
                <div class="card">
                    <div class="card-body">
                        <c:set var="totalPrice" value="0" />
                        <c:set var="discountRate" value="0.1" /> <!-- Tỷ lệ giảm giá: 10% -->
                        
                        <!-- Tính tổng tiền -->
                        <c:forEach var="dto" items="${cartDetails}">
                            <c:set var="itemTotal" value="${dto.itemOriginalPrice * dto.quantity}" />
                            <c:set var="totalPrice" value="${totalPrice + itemTotal}" />
                        </c:forEach>
                        
                        <!-- Tính số tiền giảm giá -->
                        <c:set var="discount" value="${totalPrice * discountRate}" />
                        
                        <!-- Tính tổng tiền sau khi giảm giá -->
                        <c:set var="totalAfterDiscount" value="${totalPrice - discount}" />

                        <dl class="dlist-align">
                            <dt>Total price:</dt>
                            <dd class="text-right">$<c:out value="${totalPrice}"/></dd>
                        </dl>
                        <dl class="dlist-align">
                            <dt>Discount:</dt>
                            <dd class="text-right text-danger">- $<c:out value="${discount}"/></dd>
                        </dl>
                        <dl class="dlist-align">
                            <dt>Total:</dt>
                            <dd class="text-right text-dark">
                                <strong>$<c:out value="${totalAfterDiscount}"/></strong>
                            </dd>
                        </dl>
                        <hr>
                        <a href="#" class="btn btn-primary btn-main" style="width: 100%;">Make Purchase</a>
                        <a href="#" class="btn btn-success btn-main mt-2" style="width: 100%;">Continue Shopping</a>
                    </div>
                </div>
            </aside>
        </div>
    </div>
    <script
        src='https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.bundle.min.js'></script>
</body>
</html>
