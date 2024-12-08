<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <title>Shopping Cart</title>
    <link href='https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css' rel='stylesheet'>
    <link href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css' rel='stylesheet'>
    <script type='text/javascript' src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>
    <style>
        ::-webkit-scrollbar {
            width: 8px;
        }
        ::-webkit-scrollbar-track {
            background: #f1f1f1;
        }
        ::-webkit-scrollbar-thumb {
            background: #888;
        }
        ::-webkit-scrollbar-thumb:hover {
            background: #555;
        }

        @import url('https://fonts.googleapis.com/css?family=Open+Sans&display=swap');

        body {
            background-color: #f8f9fa;
            font-family: 'Open Sans', serif;
            font-size: 14px;
        }

        .container-fluid {
            margin-top: 70px;
        }

        .card {
            border-radius: 0.5rem;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        .table-shopping-cart {
            margin-bottom: 0;
        }

        .table-shopping-cart th, .table-shopping-cart td {
            vertical-align: middle;
        }

        .img-sm {
            width: 60px;
            height: 60px;
            object-fit: cover;
            border-radius: 8px;
        }

        .price-wrap {
            line-height: 1.2;
        }

        .price {
            font-weight: bold;
            color: #212529;
        }

        .btn-light {
            color: #ffffff;
            background-color: #dc3545;
            border-color: #dc3545;
        }

        .btn-light:hover {
            background-color: #c82333;
            border-color: #bd2130;
        }

        .btn-main {
            text-transform: capitalize;
            font-size: 15px;
            padding: 10px 19px;
            cursor: pointer;
            color: #fff;
            width: 100%;
        }

        .btn-apply {
            font-size: 11px;
        }
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
                                    <th scope="col" class="text-right d-none d-md-block" width="200"></th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>
                                        <figcaption class="info">
                                            <a href="#" class="title text-dark">Tshirt with round neck</a>
                                            <p class="text-muted small">SIZE: L <br> Brand: MAXTRA</p>
                                        </figcaption>
                                    </td>
                                    <td>
                                        <select class="form-control">
                                            <option>1</option>
                                            <option>2</option>
                                            <option>3</option>
                                            <option>4</option>
                                        </select>
                                    </td>
                                    <td>
                                        <div class="price-wrap">
                                            <var class="price">$10.00</var>
                                            <small class="text-muted">$9.20 each</small>
                                        </div>
                                    </td>
                                    <td class="text-right d-none d-md-block">
                                        <a href="#" class="btn btn-light" style="background-color: #dc3545; border-color: #dc3545;">Remove</a>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <figcaption class="info">
                                            <a href="#" class="title text-dark">Tshirt with round neck</a>
                                            <p class="text-muted small">SIZE: L <br> Brand: MAXTRA</p>
                                        </figcaption>
                                    </td>
                                    <td>
                                        <select class="form-control">
                                            <option>1</option>
                                            <option>2</option>
                                            <option>3</option>
                                            <option>4</option>
                                        </select>
                                    </td>
                                    <td>
                                        <div class="price-wrap">
                                            <var class="price">$10.00</var>
                                            <small class="text-muted">$9.20 each</small>
                                        </div>
                                    </td>
                                    <td class="text-right d-none d-md-block">
                                        <a href="#" class="btn btn-light" style="background-color: #dc3545; border-color: #dc3545;">Remove</a>
                                    </td>
                                </tr>                                <tr>
                                    <td>
                                        <figcaption class="info">
                                            <a href="#" class="title text-dark">Tshirt with round neck</a>
                                            <p class="text-muted small">SIZE: L <br> Brand: MAXTRA</p>
                                        </figcaption>
                                    </td>
                                    <td>
                                        <select class="form-control">
                                            <option>1</option>
                                            <option>2</option>
                                            <option>3</option>
                                            <option>4</option>
                                        </select>
                                    </td>
                                    <td>
                                        <div class="price-wrap">
                                            <var class="price">$10.00</var>
                                            <small class="text-muted">$9.20 each</small>
                                        </div>
                                    </td>
                                    <td class="text-right d-none d-md-block">
                                        <a href="#" class="btn btn-light" style="background-color: #dc3545; border-color: #dc3545;">Remove</a>
                                    </td>
                                </tr>
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
                                    <input type="text" class="form-control coupon" placeholder="Coupon code">
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
                        <dl class="dlist-align">
                            <dt>Total price:</dt>
                            <dd class="text-right">$69.97</dd>
                        </dl>
                        <dl class="dlist-align">
                            <dt>Discount:</dt>
                            <dd class="text-right text-danger">- $10.00</dd>
                        </dl>
                        <dl class="dlist-align">
                            <dt>Total:</dt>
                            <dd class="text-right text-dark"><strong>$59.97</strong></dd>
                        </dl>
                        <hr>
                        <a href="#" class="btn btn-primary btn-main" style="width: 100%;">Make Purchase</a>
                        <a href="#" class="btn btn-success btn-main mt-2" style="width: 100%;">Continue Shopping</a>
                    </div>
                </div>
            </aside>
        </div>
    </div>
    <script src='https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.bundle.min.js'></script>
</body>
</html>
