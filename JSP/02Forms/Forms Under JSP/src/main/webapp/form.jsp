<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Demo</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/Controller" method="get">
	Full name: <input type="text" name="name" required>
	<br>
	Gender: <input type="radio" name="gender" value="male" checked="checked"> Male
			<input type="radio" name="gender" value="female"> Female
	<br>
	Languages: <input type="checkbox" name="language" value="english"> English
				<input type="checkbox" name="language" value="spanish"> Spanish
				<input type="checkbox" name="language" value="french"> French
				<input type="checkbox" name="language" value="italian"> Italian
	<br>
	Country: <select name="country">
				<option value="argentina">Argentina</option>
				<option value="usa">USA</option>
				<option value="india">India</option>
				<option value="francia">Francia</option>
				<option value="suiza">Suiza</option>
				<option value="peru">Peru</option>
			</select>
	<br>
	<input type="submit" value="submit">
	</form>
</body>
</html>