<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sample504</title>
</head>
<body>
<h1>session</h1>
<p><%=request.getAttribute("message") %>
<form action="Sample504_1" method="get">
	<input type="submit" value="セッション生成">
</form>
</body>
</html>