<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%--   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
suc
     <%
     	String role = (String)session.getAttribute("role");
     	if(role.equalsIgnoreCase("Admin")){
     %>
   	<a href="">home</a>
   	<a href="">register</a>
   	<a href="">View Users</a>
   	<%} else { %>
   	<a href="">home</a>
   	<a href="">register</a>
   	<%} %>
</body>
</html>