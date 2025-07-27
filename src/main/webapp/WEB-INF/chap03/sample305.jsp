<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="chap03.Employee" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sample305</title>
</head>
<body>
<%
	List<Employee> empList = (List<Employee>)request.getAttribute("empData");
%>
<h1>DispatchSample3</h1>
<%
	for(Employee employee : empList) {
%>
<p>名前：<%=employee.getName() %></p>
<p>年齢：<%=employee.getAge() %></p>
<%
	}	
%>
</body>
</html>