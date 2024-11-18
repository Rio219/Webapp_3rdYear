$(document).ready(function() {
    // Khởi tạo tooltips và popovers của Bootstrap
    $('[data-toggle="tooltip"]').tooltip();
    $('[data-toggle="popover"]').popover();

    // Xử lý click outside để đóng dropdown
    $(document).on('click', function(e) {
        if (!$(e.target).closest('.dropdown').length) {
            $('.dropdown-menu').removeClass('show');
        }
    });

    // Xử lý hover effect cho dropdown items
    $('.dropdown-item').hover(
        function() { $(this).find('i').css('color', '#007bff'); },
        function() { $(this).find('i').css('color', '#6c757d'); }
    );
}); 