<%@ page import = "java.util.Date, org.studyeasy.UserDefined" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=  new Date() %>
	<br/>
	<% out.print(new UserDefined().Demo());%>
</body>
</html>