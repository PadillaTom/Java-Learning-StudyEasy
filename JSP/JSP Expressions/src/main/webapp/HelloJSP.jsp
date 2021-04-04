<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Expressions</title>
</head>
<body>
	<h1>Hello JSP</h1>
	<%! public int x = 22; %>
	<%= "X value is:" %>
	<%= x %>
	<br/>
	<%= "Printed in multiple Lines" %>
	<br/>
	<br/>
	<br/>
	<%= new Integer(22)  %>
	<br/>
	<%= new String("Tomas") %>
	<br/>
	<%= 15+15 %>
	<br/>
	<%= new java.util.Date() %>
	<br/>
	<br/>
	<br/>
	<%
		int x = 25;
		out.println("x is: " + x );
		out.print("<br/>");
		if(x > 25){
			out.println("X is bigger than 25");
		} else {
			out.println("X is lesser than 25");
		}
	%>

	
</body>
</html>