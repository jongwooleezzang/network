<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터 전송 비교</title>
</head>
<body>
	<h2>데이터 전송비교</h2>
	<table>
		<caption><h3><strong style>GET/POST 비교</strong> 비교</h3></caption>
		<tbody>
			<th>GET</th> <th>POST</th>
			<tr>
				<td>
					<p>보안이 취약</p>
					<p>전송할수 있는 데이터는 최대 255Byte이다</p>
					<p>?name=? 형식으로 주소창에전달</p>
					<p>post 방식에 비해 처리속도는 빠른편</p>
					<p>서블릿에서는 doGet()을 이용합니다.</p>
					<p>주로 a태그를 활용</p>
				</td>
				<td>
					<p>get 방식에 비해 보안에 더 유리</p>
					<p>전송할수 있는 데이터의 양은 거의 무한</p>
					<p>get방식에 비해 처리속도는 느림</p>
					<p>서블릿 에서는 doPost()를 이용합니다.</p>
					<p>주로 폼 태그를 활용</p>
				</td>
			</tr>
		</tbody>
		<hr>
		<h3>GET 방식 예</h3>
		<div>
			<a href="get.jsp?name=권 &age=25"></a>
		</div>
		<hr>
		<h3>POST 방식의 예</h3>
		<div>
			<form action="post.jsp" metod="post">
				<table>
					<caption>설문조사</caption>
					<tbody>
						<tr>
							<th><label for="id">아이디</label></th>
							<td><input type="text" name="id" id="id" required ></td>
						</tr>
						<tr>
							<th><label for="birtg">출생년도</label></th>
							<td><input type="number" name="birth" id="birth"></td>
						</tr>
						<tr>
						  	<th><label for="name">이름</label></th>
							<td><input type="text" name="name" id="name" required></td>
						</tr>
						<tr>
							<th><label>좋아하는동물</label></th>
							<td>
								<input type="checkbox" name="pet" id="pet1" value="dog"checked>
								<label for="pet1">강아지</label>
								<input type="checkbox" name="pet" id="pet2"value="cat" checked>
								<label for="pet2">고양이</label>
								<input type="checkbox" name="pet" id="pet3"value="cow" checked>
								<label for="pet3">송아지</label>
							</td>
						</tr>
						<tr>
							<td colspan="2">
							<button type="submit">전송</button>
							<button type="reset">초기화</button>
						</tr>
					</tbody>
				</table>
			</form>
		</div>
	</table>
</body>
</html>