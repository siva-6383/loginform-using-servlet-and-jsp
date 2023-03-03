<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Register Form</h1>
<form action="RegisterServlet" method="post">
<table>
<tr><td>UserName:</td><td><input type="text" name="username"/></td></tr>
<tr><td>Password:</td><td><input type="text" name="userpassword"/></td></tr>
<tr><td>Email:</td><td><input type="text" name="email"/></td></tr>
<tr><td>PhoneNumber:</td><td><input type="text" name="phonenum"/></td></tr>
<tr><td><input type="submit" value="Register"/></td></tr>
</table>
</form>
</center>
</body>
</html>