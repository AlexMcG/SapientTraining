<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign Up Form</title>
<style>
.errMsg{
	color : red;
}
</style>
</head>
<body>
	Welcome!
<form:form method="POST" commandName="customer" action="/SpringValidation/customer/signup">
		<table>
			<tr>
				<td><form:input path="name" /></td>
				<td><form:errors path="name"/></td>
			</tr>
			<tr>
				<td><form:input path="age" /></td>
				<td><form:errors path="age"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>