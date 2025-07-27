<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<body>
<%
	session.getAttribute("param1");
	session.getAttribute("param2");
%>
<p>param1=<%=param1 %></p>
<p>param2=<%=param2 %></p>
<form action="Sample501Regist" method="POST">
</form>
<a href="Sample501Input">トップへ戻る</a>
</body>
</body>
</html>