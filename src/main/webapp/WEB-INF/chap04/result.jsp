<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>result</title>
</head>
<body>
<%
	String param1 = (String)request.getAttribute("param1");
	String param2 = (String)request.getAttribute("param2");
%>
<p>param1=<%=param1 %></p>
<p>param2=<%=param2 %></p>
</body>
</html>