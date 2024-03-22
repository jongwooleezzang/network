<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %> 
<%@ page import="org.kh.dto.Member" %>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>표현언어의 비교문장</title>
</head>
<body>
<c:set scope="application" var="num3" value="30"/>
<%
	pageContext.setAttribute("num1", 9);
	pageContext.setAttribute("num2", "10");
	pageContext.setAttribute("nullStr", null);
	pageContext.setAttribute("emptyStr", " ");
	pageContext.setAttribute("lengthZero", new Integer[0]);
	pageContext.setAttribute("sizeZero", new ArrayList());
	
	session.setAttribute("sid", "kim"); //로그인되어있음 kim 이라는 Id로 
%>
<%@ include file="menu.jsp" %>
<hr> <!-- <>이건 전부다 jstl 임?-->
<h2>표현언어의 비교문장</h2>
<div>
  <c:if test="${sid.equals('admin') }">
  	<P>관리자</P>
  </c:if>
  <c:if test="${not empty sid }">
  	<p>일반 사용자 ${sid }님이 로그인중</p>
  </c:if>
  	 <c:if test="${empty sid }">
  	<p>로그인 중이 아닙니다.</p>
  </c:if>
</div>
<hr>
<div>
	<h3>Empty 비교확인 </h3>
	<p>empty nullStr : {empty nullSrt} </p>	
	<p>empty emptyStr : {empty emptyStr} </p>	
	<p>empty lengthSrt : {empty lengthSrt} </p>	
	<p>empty sizeZero : {empty sizeZero} </p>	
</div>
<hr>
<div>
	<h3>삼항 연산자</h3>
	<p>num1 &gt; num2 ? "참" : "거짓" => ${num1 gt num2 ? "참" : "거짓" }</p>
</div>
</body>
</html>