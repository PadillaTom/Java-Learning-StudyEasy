<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	Welcome to Homepage
	<br>
	<a href="<%= request.getContextPath() %>/SiteController?action=login">
		Login
	</a>
</body>
</html>