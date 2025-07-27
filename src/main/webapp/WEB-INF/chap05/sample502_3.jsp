<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sample503_1</title>
</head>
<body>
<%
	String param1 = (String)session.getAttribute("param1");
	int param2 = (int)session.getAttribute("param2");
%>
<p>param1=<%=param1 %></p>
<p>param2=<%=param2 %></p>
<a href="Sample502_2">GoTo2</a>
</body>
</html>