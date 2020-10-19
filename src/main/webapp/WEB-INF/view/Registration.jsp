<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h2 align="center">REGISTRATION</h2> </br>
   <fieldset style="300px">
     <legend>Register</legend>
      <form action="reg" method="post" modalAttribute="user">
      USER NAME : <input type="text" placeholder="enter user name" name="userName" /> <br><br>
      PASS WORD : <input type="password" placeholder="enter password" name="passWord" > <br><br>
      FIRST NAME: <input type="text" placeholder="enter first name" name="firstName" /> <br><br> 
      LAST NAME: <input type="text" placeholder="enter last name" name="lastName" /> <br><br>
      MOBILE NUMBER : <input type="number" placeholder="enter number"  max="9000000000000" name="mobile"/><br><br> 
      EMAIL : <input type="email" placeholder="enter email" name="email" > <br><br>
      <input type="submit"></br> </br>
      
      ${ss}
      
      
      </form>
   </fieldset>  
</body>
<%@ include file = "Header.jsp" %>
</html>