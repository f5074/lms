<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>메인 페이지</title>

<!-- 메인화면 css -->
<link rel="stylesheet" href="<c:url value="/css/index_style.css"/>">
</head>


<body>
	<header>
		<h1>
			독서실 관리 프로그램
			<c:choose>
				<c:when test="${sessionScope.sid==null }">
					<strong><a href="login/login"><input type="button"
							name="button" value="로그인"></a> <a href="join/join"><input
							type="button" name="button" value="회원가입"></a></strong>
				</c:when>
				<c:otherwise>
					<strong>${sid }님환영합니다.<input name="button" type="button"
						onClick-"location.href='index.html' " value="로그아웃"></strong>

				</c:otherwise>
			</c:choose>
		</h1>
		<div>
			<ul id="list1">
				<li id="li7"><a href="seat">좌석관리</a></li>
				<li id="li8"><a href="userDetail">회원관리</a></li>
				<li id="li9"><a href="payment">결제관리</a></li>
				<li id="li10"><a href="attendance">출석관리</a></li>
			</ul>
		</div>
	</header>


	<nav>
		<h1>LINKS</h1>
		<ul id="menu">
			<li id="li1">링크1</li>
			<li id="li2">링크2</li>
			<li id="li3">링크3</li>
			<li id="li4">링크4</li>
			<li id="li5">링크5</li>
		</ul>
	</nav>

	<section id="content">
		<table>
			<c:forEach var="seat" items="${seat }">
				<tr>
					<td>${seat.seatNo }</td>
					<td>${seat.seatCheck }</td>
				</tr>
			</c:forEach>
		</table>
	</section>


	<footer>
		<p>Copyright&copy; 2016. 12.19</p>
	</footer>

</body>