<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP File</title>
</head>
<body>
<!-- For Adding Static Content -->
	<%@ include file="file1.txt" %>
	<br/>
<!-- For Adding Dynamic Content -->
	<jsp:include page="file2.txt"></jsp:include>
	
	
	
</body>
</html>