<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sample302</title>
</head>
<body>
<%
	String message = (String)request.getAttribute("message");
	Integer number = (Integer)request.getAttribute("number");
%>
<h1>DispatchSample2</h1>
<p>message=<%=message %></p>
<p>number=<%=number %></p>
</body>
</html>