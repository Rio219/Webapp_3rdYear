<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ include file="/commons/taglibs.jsp"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>UX/UI</title>
    <link rel="stylesheet"
        href="https://fonts.googleapis.com/css2?family=Material+Symbols+Sharp:opsz,wght,FILL,GRAD@48,400,0,0" />
    <link rel="stylesheet" type="text/css" href="template/web/web.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css" integrity="sha512-Kc323vGBEqzTmouAECnVceyQqyqdsSiqLQISBL29aUW4U/M7pSPA/gEUZQqv1cwx4OnYxTxve5UMg5GT6L4JJg==" crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>

<body>
    <div class="container">
        <!-- aside section start -->
        <aside>

            <div class="top">

                <div class="logo">
                    <h2>B<span class="danger">lOOM</span></h2>
                </div>
                <div class="close" id="close_btn">
                    <span class="material-symbols-sharp">close</span>
                </div>
            </div>
            <!-- end top -->

            <div class="sidebar">
                <a href="#">
                    <span class="material-symbols-sharp">home_and_garden</span>
                    <h3>Home</h3>
                </a>

                <a href="#" class="active">
                    <span class="material-symbols-sharp">face_2</span>
                    <h3>Accounts</h3>
                </a>
                <a href="#">
                    <span class="material-symbols-sharp">yard</span>
                    <h3>Vouchers</h3>
                    <span class="msg_count">14</span>
                </a>
                <a href="#">
                    <span class="material-symbols-sharp">local_florist</span>
                    <h3>Products</h3>
                </a>
                <a href="#">
                    <span class="material-symbols-sharp">receipt_long</span>
                    <h3>Orders</h3>
                </a>
                <!-- <a href="#">
                    <span class="material-symbols-sharp">emoji_nature</span>
                    <h3>Users</h3>
                </a> -->
                <a href="#">
                    <span class="material-symbols-sharp">insights</span>
                    <h3>KPI</h3>
                </a>
                <div class="dropdown">
                    <a href="#" class="dropdown-toggle">
                        <span class="material-symbols-sharp">emoji_nature</span>
                        <h3>Users</h3>
                    </a>
                    <div class="dropdown-menu">
                        <a href="#">User List</a>
                        <a href="#">Add User</a>
                        <a href="#">User Roles</a>
                    </div>
                </div>
                
                <a href="#">
                    <span class="material-symbols-sharp">logout</span>
                    <h3>Logout</h3>
                </a>
                
        </aside>
        <!-- aside section end -->

        <!-- main section start -->
        <main>
            <div class="info-page">
                <h1>Account management</h1>
                <div class="address">
                    <!-- <input type="date"> -->
                    <th>Home/Accounts</th>
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
                <svg viewBox="0 0 24 24" aria-hidden="true" class="icon-search">
                    <g>
                    <path
                        d="M21.53 20.47l-3.66-3.66C19.195 15.24 20 13.214 20 11c0-4.97-4.03-9-9-9s-9 4.03-9 9 4.03 9 9 9c2.215 0 4.24-.804 5.808-2.13l3.66 3.66c.147.146.34.22.53.22s.385-.073.53-.22c.295-.293.295-.767.002-1.06zM3.5 11c0-4.135 3.365-7.5 7.5-7.5s7.5 3.365 7.5 7.5-3.365 7.5-7.5 7.5-7.5-3.365-7.5-7.5z"
                    ></path>
                    </g>
                </svg>
                <input class="input-search" type="search" placeholder="Search" />
                </div>
            </div>
            <div class="accounts_table">
                <table>
                    <thread>
                        <tr>
                            <th>Customer ID</th>
                            <th>Account name</th>
                            <th>Password</th>
                            <th>Update</th>
                            <th>Thao tác</th>
                        </tr>
                    </thread>
                    <tbody>

                        <tr>
                            <td>Mini USB</td>
                            <td>456</td>
                            <td>Due</td>
                            <td class="warning">Pending</td>
                            <td class="ope-btn">
                                <button class="btn-edit"><i class="fa-solid fa-pencil"></i></button>
                                <button class="btn-delete"><i class="fa-solid fa-trash-can"></i></button>
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
                    <span class="material-symbols-sharp active">light_mode</span>
                    <span class="material-symbols-sharp">dark_mode</span>

                </div>

                <div class="profile">
                    <div class="info">
                        <p><b>Barbar</b></p>
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
                            <p><b>Barbar</b> Recived his order</p>
                        </div>
                    </div>
                    <div class="update">
                        <div class="profile-photo">
                            <img src="images/profile-2.jpg" alt="">
                        </div>
                        <div class="message">
                            <p><b>Barbar</b> Recived his order</p>
                        </div>
                    </div>
                    <div class="update">
                        <div class="profile-photo">
                            <img src="images/profile-2.jpg" alt="">
                        </div>
                        <div class="message">
                            <p><b>Barbar</b> Recived his order</p>
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
                            <h3>onlion orders</h3>
                            <small class="text-muted">Last seen 2 hours</small>
                        </div>
                        <h5 class="danger">-17%</h5>
                        <h3>3849</h3>
                    </div>
                </div>

                <div class="item onlion">
                    <div class="icon">
                        <span class="material-symbols-sharp">shopping_cart</span>
                    </div>
                    <div class="right_text">
                        <div class="info">
                            <h3>onlion orders</h3>
                            <small class="text-muted">Last seen 2 hours</small>
                        </div>
                        <h5 class="danger">-17%</h5>
                        <h3>3849</h3>
                    </div>
                </div>

                <div class="item onlion">
                    <div class="icon">
                        <span class="material-symbols-sharp">shopping_cart</span>
                    </div>
                    <div class="right_text">
                        <div class="info">
                            <h3>onlion orders</h3>
                            <small class="text-muted">Last seen 2 hours</small>
                        </div>
                        <h5 class="danger">-17%</h5>
                        <h3>3849</h3>
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
    </div>





    <script src="/template/web/js/script.js"></script>
</body>

</html>\
