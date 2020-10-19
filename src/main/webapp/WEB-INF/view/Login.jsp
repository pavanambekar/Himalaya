<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
       <h2 align="center">LOGIN PAGE</h2> </br>
       
       ${ress}  </br></br>
       <form action="log" method="post" modalAttribute="user">
       
      USER NAME : <input type="text" placeholder="enter user name" name="userName" /> <br><br> 
      PASS WORD : <input type="password" placeholder="enter pass word" name="passWord" /> <br><br>
      <input type="submit"> </br></br>
      
      
      <a href="register">click here for registration</a>
      
      </form>
</body>
</html>