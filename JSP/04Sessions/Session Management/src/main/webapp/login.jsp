<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>

<form action="<%=request.getContextPath()%>/SiteController" method="POST">
	Username: <input type="text" name="username" value="Enter Username">
	<br>
	Password: <input type="password" name="password">
	<br>
	<input type="submit" value="submit">

</form>

</body>
</html>