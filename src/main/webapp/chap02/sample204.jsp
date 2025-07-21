<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sample204</title>
</head>
<body>
<%
	for(int i = 0; i < 3; i++) {
%>
<p>JSP!</p>
<p>count=<%=i %></p>
<%
	}
%>
</body>
</html>