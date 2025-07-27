<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sample303</title>
</head>
<body>
<%
	List<String> list = (List<String>)request.getAttribute("data");
%>
<h1>DispatchSample3</h1>
<%
	for(String data: list) {
%>
<p><%=data %></p>
<%
	}
%>
</body>
</html>