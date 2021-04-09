<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL</title>
</head>
<body>
<%-- 	<p>Reading a c:set Variable and param.</p>	
	<c:set var="name" value="Tom"></c:set>
	${name}
	${param.paramName}	
	<br>
	<br>
	<p>Reading from Beans</p>
	<jsp:useBean id="user" class="org.studyeasy.beans.User" scope="page"></jsp:useBean>
	${user.getFirstName()}
	${user.lastName}
	<c:out value="${user.getLastName()}"></c:out>
	<br>
	<br> --%>
<%-- 	<p>Using Conditionals IF</p>
	<br>
	<c:if test="${param.paramNam ==`tom`}">
		Hello Tom
	</c:if>
		Hello Other --%>
<%-- 		<c:when test="${param.lang =='Java' }">
			Learning Java
		</c:when>
		<c:when test="${param.lang =='PHP' }">
			Learning PHP
		</c:when>
		<c:otherwise>
			Learning Something
		</c:otherwise> --%>
		
		<p>Loops</p>
<c:forEach var="i" begin="1" end="10">
${i}
</c:forEach>

</body>
</html>