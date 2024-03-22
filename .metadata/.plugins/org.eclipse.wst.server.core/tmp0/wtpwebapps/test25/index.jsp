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
<title>아 여기는 뭐들어감?</title>
</head>
<body>
    <h2>아 이거 이렇게 하는거맞음?</h2>
    <hr>
    <nav>
    	<ul>
    	 	<li><a href="test01.jsp">JSP 페이지의 기본 구성 요소</a></li>
			<li><a href="test02.jsp?name='김기태'&age=43&point=80">GET 데이터 전송</a></li>
			<li><a href="test03.jsp">POST 데이터 전송</a></li>
			<li><a href="test04.jsp">데이터 전송 비교</a></li>
			<li><a href="test05.jsp?msg=복습하세요">메시지 전달</a></li>
			<li><a href="test06.jsp">jsp의 기본 객체</a></li>
			<li><a href="test10.jsp">로그인 테스트</a></li>
			<li><a href="test11.jsp">include</a></li>
    	</ul>
    </nav>
</body>
</html>