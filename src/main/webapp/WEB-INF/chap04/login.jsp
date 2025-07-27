<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sample404</title>
</head>
<body>
<form action="Exercise401" method="POST">
	<input type="text" name="username">username<br>
	<input type="text" name="password">Password<br>
	<input type="submit" value="送信">
	<p><%=request.getAttribute("message") %></p>
</form>
</body>
</html>