<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>日本の都市</title>
</head>
<body>
	<h1>日本の都市</h1>
	<%
		ArrayList<String> cities = new ArrayList<String>();
		cities.add("札幌");
		cities.add("東京");
		cities.add("名古屋");
		cities.add("大阪");
		cities.add("神戸");
		for (String city : cities) {
	%>
	<p><%=city%></p>
	<%
		}
	%>
</body>
</html>