<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Member Area</title>
	</head>
	<body>
		<%
			String username=null, sessionID=null;
		// Using COOKIES:
		// Cookie[] cookies = request.getCookies();
		// if(cookies != null){
		//	for(Cookie cookie : cookies){
		//		if(cookie.getName().equals("username")){
		//			username = cookie.getValue();
		//		}
		//		if(cookie.getName().equals("JSESSIONID")){
		//			sessionID = cookie.getValue();
		//		}
		//	}
		// }
		// Condition if session doesn't match
		// if(sessionID == null || username == null){
		//	response.sendRedirect("login.jsp");
		// }
			
		// Using SESSIONS:
			if(request.getSession().getAttribute("username")== null){
				response.sendRedirect("login.jsp");
			} else {
				username = request.getSession().getAttribute("username").toString();
				sessionID = request.getSession().getId();				
			}	
			
		%>
		<h1>Successfully logged in as</h1>
		User: <%= username %>
		<br>
		Session Id: <%= sessionID %>
		<br>
		<h4>*******</h4>
		<br>
		<form action="<%= request.getContextPath() %>/MemberAreaController" method="get">
			<input type="hidden" name="action" value="destroy">
			<input type="submit" value="logout">
		</form>
	</body>
</html>