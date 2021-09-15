<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
	<%
		/* String name=(String)request.getAttribute("name");
		Integer rollnumber=(Integer) request.getAttribute("roll number");
		LocalDateTime time=(LocalDateTime) request.getAttribute("time");
		 */
	%>
	<%-- <h2> name is <%= name %></h2>
<h2> roll number is <%= rollnumber %></h2>
<h2> time is <%= time %></h2> --%>


	<h1>hello my name is using jsp expression language ${name }</h1>
	<h3>My roll number is ${rollnumber}</h3>
	<h2>Todays date is ${time}</h2>
	<hr>
	<h3>My friends are ${myfriends }</h3>
	
	
	<h2>My friends are : </h2>
	<c:forEach var="item" items="${myfriends }">
	  <h1>${item}</h1>
	</c:forEach>

</body>
</html>