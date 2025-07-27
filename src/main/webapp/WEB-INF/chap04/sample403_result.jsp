<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sample403</title>
</head>
<body>
<%
	String[] languages  = (String[])request.getAttribute("languages");
	for(String language : languages) {
%>
	<p><%=language %></p>
<%
	}
%>

</body>
</html>