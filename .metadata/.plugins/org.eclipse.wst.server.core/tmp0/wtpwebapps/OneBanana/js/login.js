/**
 * javascript to make the tabbed display work
 */
$(function() {

    $('#login-form-link').click(function(e) {
		$("#login-form").delay(100).fadeIn(100);
 		$("#register-form").fadeOut(100);
		$('#register-form-link').removeClass('active');
		$(this).addClass('active');
		e.preventDefault();
	});
	$('#register-form-link').click(function(e) {
		$("#register-form").delay(100).fadeIn(100);
 		$("#login-form").fadeOut(100);
		$('#login-form-link').removeClass('active');
		$(this).addClass('active');
		e.preventDefault();
	});

});

//$('#login-submit').click(function(){
//	var uname = $('#email').val();
//	var pwd = $('#password').val();
//    $.ajax({
//        url : 'rest/service/validate',
//        type : 'POST',
//        data : {uname: uname, pwd: pwd},
//        success : function(response) {
//        	window.location = "home.jsp";
//        }
//    });
//});