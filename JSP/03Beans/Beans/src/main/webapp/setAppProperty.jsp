<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="user" class="org.studyeasy.beans.User" scope="application"></jsp:useBean>

<jsp:setProperty property="firstName" name="user" value="Tomas"></jsp:setProperty>
<jsp:setProperty property="lastName" name="user" value="Padilla"></jsp:setProperty>
Values has been set.
</body>
</html>