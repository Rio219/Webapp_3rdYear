<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.webapp3rdyear.entity.UserModel" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Thông tin cá nhân</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>
    <div class="container">
        <h2>Thông tin cá nhân</h2>
        <form id="profileForm" action="profile" method="post">
            <div class="user-info">
                <% 
                    UserModel user = (UserModel) session.getAttribute("user");
                    if (user != null) {
                %>
                    <div class="form-group">
                        <label for="fullName">Họ và tên:</label>
                        <input type="text" class="form-control" name="fullName" id="fullName" value="<%= user.getFirstName() + " " + user.getLastName() %>" readonly>
                    </div>
                    <div class="form-group">
                        <label for="email">Email:</label>
                        <input type="email" class="form-control" name="email" id="email" value="<%= user.getEmail() %>" readonly>
                    </div>
                    <div class="form-group">
                        <label for="phone">Số điện thoại:</label>
                        <input type="tel" class="form-control" name="phone" id="phone" value="<%= user.getPhone() %>" readonly>
                    </div>
                    <div class="form-group">
                        <label for="address">Địa chỉ:</label>
                        <textarea class="form-control" name="address" id="address" readonly><%= user.getAddress() %></textarea>
                    </div>
                    <p><strong>Ngày sinh:</strong> <%= new SimpleDateFormat("dd/MM/yyyy").format(user.getDateOfBirth()) %></p>
                <% 
                    } else {
                %>
                    <p>Không có thông tin người dùng.</p>
                <% 
                    } 
                %>
            </div>
            
            <p>
            <button type="button" class="btn btn-primary" id="editButton">Chỉnh sửa</button>
            <button type="button" class="btn btn-success" id="saveButton" style="display:none;">Lưu</button>
            </p>
            
        </form>
    </div>

    <!-- Modal xác nhận -->
    <div class="modal fade" id="confirmModal" tabindex="-1" role="dialog" aria-labelledby="confirmModalLabel" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="confirmModalLabel">Xác nhận chỉnh sửa</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    Bạn có chắc chắn muốn lưu các thay đổi không?
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Hủy</button>
                    <button type="button" class="btn btn-primary" id="confirmEdit">Xác nhận</button>
                </div>
            </div>
        </div>
    </div>

    <script>
        $(document).ready(function() {
            $("#editButton").click(function() {
                // Cho phép chỉnh sửa các trường
                $("#fullName").prop("readonly", false);
                $("#email").prop("readonly", false);
                $("#phone").prop("readonly", false);
                $("#address").prop("readonly", false);
                
                // Hiện nút Lưu và ẩn nút Chỉnh sửa
                $("#saveButton").show();
                $(this).hide();
            });

            $("#saveButton").click(function() {
                // Hiện modal xác nhận
                $("#confirmModal").modal('show');
            });	

            $("#confirmEdit").click(function() {
                // Gửi form sau khi xác nhận
                $("#profileForm").submit();
            });
        });
    </script>
</body>
</html> 