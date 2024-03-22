<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 1.<%@ 디렉티브 %>  :현제 페이지에 필요한 설정이나 리소스 로딩--%>   
<%-- 2.<%! 선언문(Declare)  %> 익명의 클래스로서 현재 문서에만 유효--%>
<%-- 3.<% 자바명령문(Scriptlet)  %>: 해당페이지에 자바 언어로 프로그래밍한 코드부--%>
<%-- 4.<%= 표현식(Expression)  %> : 해당 결과를 출력 또는 표현시 사용--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("name");
	int age = Integer.parseInt(request.getParameter("age"));
	int point = Integer.parseInt(request.getParameter("point"));
	
	
%>
<h2>요청된 데이터</h2>
<%
 	String hak = "";
	if(point>=90){
		hak ="수";
	}else if(point>=80){
		hak ="우";
	}else if(point>=70){
		hak="미";
	}else if(point>=60){
		hak="양";
	}else{
		hak="가";
	}
%>
<ul>
	<li><strong>이름</strong> :<span><%=name %></span></li>
	<li><strong>나이</strong> :<span><%=age %></span></li>
	<li><strong>점수</strong> :<span><%=point %></span></li>
	<li><strong>학점</strong> :<span><%=hak %></span></li>
</ul>
</body>
</html>