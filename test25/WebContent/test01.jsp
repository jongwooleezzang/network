<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>  
 
<%-- 1.<%@ 디렉티브 %>  :현제 페이지에 필요한 설정이나 리소스 로딩--%>   
<%-- 2.<%! 선언문(Declare)  %> 익명의 클래스로서 현재 문서에만 유효--%>
<%-- 3.<% 자바명령문(Scriptlet)  %>: 해당페이지에 자바 언어로 프로그래밍한 코드부--%>
<%-- 4.<%= 표현식(Expression)  %> : 해당 결과를 출력 또는 표현시 사용--%>
<%!
	private String name;
	public String getName(){
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%
	String title ="메인페이지";
%>
<title><%= title %></title>
</head>
<body>
<%
	setName("이종우");
%>
<h2><%=getName() %>의 홈페이지</h2>
</body>
</html>