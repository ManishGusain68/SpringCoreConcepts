<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h1> this is home page</h1>
<h2> called by home controller</h2>
<h3>name is Manish</h3>


<%

String name= (String) request.getAttribute("name");
Integer id =(Integer) request.getAttribute("id");
List<String> friends=(List<String>)request.getAttribute("f");


%>


<h3> Name is <%=name %></h3>
<h3> Id is <%=id %></h3>


<%
for (String s : friends){
	%>
<h2> <%=s %></h2>	
	<%
	
}


%>

</body>
</html>