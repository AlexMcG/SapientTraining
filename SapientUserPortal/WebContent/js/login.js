/**
 * 
 */
$('#btnLogin').click(
		function() {
			var uname = $('#uname').val();
			var password = $('#password').val();
			if (uname == 'harshit' && password == 'abc123') {
				$(location).attr('href', "html/home.html");
			} else {
				$('#loginFail').html(
						"Invalid username or password. Please try again!");
			}
		});

function setCookie(cname, cvalue, exdays) {
	var d = new Date();
	d.setTime(d.getTime() + (exdays * 24 * 60 * 60 * 1000));
	var expires = "expires=" + d.toUTCString();
	document.cookie = cname + "=" + cvalue + "; " + expires;
}

function getCookie(cname) {
	var name = cname + "=";
	var ca = document.cookie.split(';');
	for (var i = 0; i < ca.length; i++) {
		var c = ca[i];
		while (c.charAt(0) == ' ')
			c = c.substring(1);
		if (c.indexOf(name) == 0)
			return c.substring(name.length, c.length);
	}
	return "";
}

function checkCookie() {
	var uname = document.getElementById("uname");
	if (uname != "") {
		//alert("Welcome again" + uname);
	} else {
		uname = prompt("Please enter your name:", "");
		if (uname != "" && uname != null) {
			setCookie("uname", uname, 365);
		}
	}

}