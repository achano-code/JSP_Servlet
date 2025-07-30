<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="chap11.dao.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>StudentList</title>
</head>
<body>
<h1>学生一覧</h1>
<table border="1" style="border-collapse: collapse">
	<tr>
		<th>学生番号</th>
		<th>名前</th>
		<th>学年</th>
	</tr>
<% for(Student student : (List<Student>)request.getAttribute("students")) { %>
	<tr>
		<td><%= student.getId() %></td>
		<td><%= student.getName() %></td>
		<td><%= student.getGrade() %></td>
	</tr>
<% } %>
</table>
</body>
</html>