<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GET 전송결과</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("name");
	int age = Integer.parseInt(request.getParameter("age"));

%>
<h3>전송결과</h3>
<p>이름: <%=name %></p>
<p>나이: <%=age %></p>
</body>
</html>