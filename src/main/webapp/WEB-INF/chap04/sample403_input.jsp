<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sample403</title>
</head>
<body>
<form action="post_params" method="POST">
	<p>使用できるプログラミング言語</p>
	<input type="checkbox" name="languages" value="Java">Java<br>
	<input type="checkbox" name="languages" value="C">C<br>
	<input type="checkbox" name="languages" value="C++">C++<br>
	<input type="checkbox" name="languages" value="Python">Python<br>
	<input type="checkbox" name="languages" value="C#">C#<br>
	<input type="submit" value="送信">
</form>
</body>
</html>