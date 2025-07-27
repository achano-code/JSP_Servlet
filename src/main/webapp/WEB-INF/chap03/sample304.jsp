<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="chap03.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sample304</title>
</head>
<body>
<%
	Employee employee = (Employee)request.getAttribute("empData");
%>
<h1>DispatchSample3</h1>
<p>名前：<%=employee.getName() %></p>
<p>年齢：<%=employee.getAge() %></p>
</body>
</html>