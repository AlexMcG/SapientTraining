/**
 * 
 */
$('#btnLogin').click(
		function() {
			var uname = $('#uname').val();
			var password = $('#password').val();
			if (uname == 'Alex@mccarten-gibbs.com' && password == 'password') {
				$(location).attr('href', "html/home.html");
			} else {
				alert("Invalid username or password. Please try again!");
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

//visibility function
function setPage(bool) {
	var register = "block";
	var login = "block";
	if (bool) {
		register = "none";
	} else {  login = "none"; }
	var lDiv = document.getElementById("loginDiv");
	lDiv.style.display = login;
	var rDiv = document.getElementById("registerDiv");
	rDiv.style.display = register;
}

function forgotPassword() {
	var fpform = document.getElementById("fpform");
	if (fpform.style.display === "block") {
		fpform.style.display = "none";
	} else if (fpform.style.display === "none") {
		fpform.style.display = "block";
	}
}