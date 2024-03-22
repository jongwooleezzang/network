<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스코프 데이터 추적하기</title>
</head>
<body>
<h2>스코프 데이터 추적하기</h2>
<%
	String msg =request.getParameter("msg");
	String pageData =(String )pageContext.getAttribute("pageData");
	String reqData =(String)request.getAttribute("reqData");
	String sesData =(String) session.getAttribute("sesData"); //세션데이타는 로그아웃하기전까지는 출력이되
	String appData =(String)application.getAttribute("appData"); //앱데이타는 전역변수 

%>
<div>
	<p>msg(request on :<%=msg %>)</p>
	<p>pageData(pageContext) : <%= pageData %></p>
	<p>reqData(request off) : <%= reqData %></p>
	<p>sesData(session ) : <%= sesData %></p>
	<p>appData(application ) : <%= appData %></p>
<%
	session.invalidate(); //세션을 종료하는것
	sesData =(String) session.getAttribute("sesData");
%>
	<p>세션종료후</p>
	<p>sesData(session) : <%=sesData %></p>
	<p>web.xml 전역변수 :<%=application.getInitParameter("admin") %></p>
</div> 
<hr>
<div>
	<a href="index.jsp">홈으로이동하기</a>
	<a href="test06.jsp">테스트06페이지</a>
</div>
</body>
</html>