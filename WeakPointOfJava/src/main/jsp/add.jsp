<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>合計値</title>
</head>
<body>
	<%
		String num1Str = request.getParameter("num1");
		String num2Str = request.getParameter("num2");
		int num1 = Integer.parseInt(num1Str);
		int num2 = Integer.parseInt(num2Str);
		int result = num1 + num2;
	%>
	計算の結果
	<br>
	<%=num1%>
	+
	<%=num2%>
	=
	<%=result%>
</body>
</html>