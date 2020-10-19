<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table class="table table-striped">
<tr>
	<th>FirstName</th>
	<th>LastName</th>
	<th>UserName</th>
	<th>Password</th>
	<th>email</th>
	<th>mobileNumber</th>
</tr>

<c:forEach var="em" items="${res}">
<tr>
	<td>${em.firstName }</td>
	<td>${em.lastName }</td>
	<td>${em.userName }</td>
	<td>${em.passWord }</td>
	<td>${em.email }</td>
	<td>${em.mobile }</td>
</tr>
</c:forEach>
</table>

</body>
</html>