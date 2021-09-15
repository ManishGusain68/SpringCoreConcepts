<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Successful !</title>
</head>
<body>
	<h1>${Header }</h1>
	<p>${desc }</p>
	<hr>
	<h1>Thank you ${user.uname} for registration</h1>
	<h3>your email id is ${user.uemail }</h3>
	<h3> state of user : ${user.address.state }</h3>
	<h3> city of user: ${user.address.city }</h3>
</body>
</html>