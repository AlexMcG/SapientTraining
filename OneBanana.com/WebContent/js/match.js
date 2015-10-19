function match() {
	var pVal = document.getElementById("rPassword").value;
	var cpVal = document.getElementById("confirm-password").value;
	if ((pVal != "") && (cpVal != "")) {
		if (cpVal === pVal) {
		} else {
			alert("Password fields do not match!");
			document.getElementById("confirm-password").value = "";
		}
	}
}