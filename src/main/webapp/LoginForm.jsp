<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<center>
<h1>LoginForm</h1>
<body>
<form action="LoginServlet" method="post">
<table>
<tr><td>UserName:</td><td><input type="text" name="username"/></td></tr>
<tr><td>Password:</td><td><input type="text" name="password"/></td></tr>
<tr><td><input type="submit" value="login"/></td></tr>
</table>
</form>
</center>
</body>
</html>