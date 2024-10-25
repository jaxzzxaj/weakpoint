<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>住まい・趣味表示2</title>
</head>
<body>
	<h2>ページ②</h2>
	<%
		String address = (String) session.getAttribute("address");
		String hobby = (String) request.getAttribute("hobby");
	%>
	住まい＝<%=address%><br>
	趣味＝<%=hobby%><br>

	<a href="../InvalidateServlet">セッションを破棄する</a>
	<br>
</body>
</html>