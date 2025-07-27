<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="chap03.Product" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exercise302.jsp</title>
</head>
<body>
<%
	List<Product> products = (List<Product>)request.getAttribute("products");
%>
<table border="1" style="border-collapse: collapse">
<%
	for(Product product : products) {
%>
<tr>
	<td><%=product.getName() %></td>
	<td>&yen<%=product.getPrice() %></td>
</tr>
<%
	}
%>
</table>

</body>
</html>