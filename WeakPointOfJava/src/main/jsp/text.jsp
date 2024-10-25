<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文章表示</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		String text = request.getParameter("text");
		int length = text.length();
	%>
	あなたが入力した文章は以下です。
	<br>
	<%=text%><br>
	文字数は<%= length %>です。
</body>
</html>