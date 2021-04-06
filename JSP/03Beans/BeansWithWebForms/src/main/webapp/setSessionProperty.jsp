<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="user" class="org.studyeasy.beans.User" scope="session"></jsp:useBean>

<form action="getSessionProperty.jsp">
	First Name: <input type="text" name="firstName" value="<jsp:getProperty property="firstName" name="user"/>">
	<br>
	Last Name: <input type="text" name="lastName" value="<jsp:getProperty property="lastName" name="user"/>">
	<br>
	<input type="submit" value="submit">
</form>

</body>
</html>