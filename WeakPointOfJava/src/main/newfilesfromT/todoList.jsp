<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>予定一覧</title>
</head>
<body>
予定一覧<br /><br />
<%
	//予定を格納したリストをセッションから取得
	String[] toDoList = (String[]) session.getAttribute("toDoList");
	if(toDoList != null){
		//予定を一つずつ表示
		for(int i = 0; i < toDoList.length; i++){
			String toDo = toDoList[i];
%>
	予定<%= i+1 %>：<%= toDo %><br /><br />
<%
		}
	}else{
		//予定リストがない（予定が登録されていない）場合
%>
	登録されている予定はありません。<br /><br />
<%
	}
%>
 <a href="question3/inputToDo.html">更に登録</a>&nbsp;&nbsp;
<a href="./ResetToDoServlet">リセット</a>

</body>
</html>