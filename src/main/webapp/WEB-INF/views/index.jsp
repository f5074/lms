<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>메인 페이지</title>


<style>
header {
	width: 1024px;
	height: 100px;
	margin: 0px 0px 70px 0px;
	padding: 10px;
	background-color: #D5D5D5;
}

header>h1 {
	text-align: center;
	text-shadow: 5px 5px 5px gray;
	font-size: 40px;
	letter-spacing: 3px;
}

div {
	width: 1024px;
	height: 50px;
	margin: 0px 0px 0px -10px;
	padding: 10px;
	border: thin solid black;
	position: absolute;
	top: 130px;
}

ul#list1 {
	list-style: none;
	width: 800px;
	height: 70px;
	position: absolute;
	right: 50px;
}

#list1>li {
	display: inline;
	padding: 10px 30px 10px 30px;
	background-color: #E8D9FF;
	margin-left: 5px;
	margin-right: -4px;
	text-align: center;
	border-radius: 10px 10px 0 0;
}

#li7:HOVER {
	background-color: #EAEAEA;
	box-shadow: 0px 5px 0px gray;
}

#li8:HOVER {
	background-color: #EAEAEA;
	box-shadow: 0px 5px 0px gray;
}

#li9:HOVER {
	background-color: #EAEAEA;
	box-shadow: 0px 5px 0px gray;
}

#li10:HOVER {
	background-color: #EAEAEA;
	box-shadow: 0px 5px 0px gray;
}

#li11:HOVER {
	background-color: #EAEAEA;
	box-shadow: 0px 5px 0px gray;
}

nav {
	width: 100px;
	height: 500px;
	margin: 0px;
	padding: 10px;
	background-color: #D9E5FF;
	display: table-cell;
}

nav>h1 {
	border: 2px solid black;
	font-size: 30px;
}

#menu {
	list-style: none;
	font-size: 30px;
	text-align: left;
	margin: 0px 0px 0px -10px;
	padding: 10px;
}

#menu>li:HOVER {
	background-color: green;
	transition: all 1s;
}

#li1 {
	border-top: solid;
}

#li2, #li3, #li4 {
	border: 2px;
	border-style: dotted none none none;
}

#li5 {
	border: 2px;
	border-style: dotted none dotted none;
}

#li6 {
	border-bottom: solid;
}

li>img {
	width: 120px;
	height: 110px;
}

section#content {
	width: 874px;
	height: 500px;
	margin: 0px;
	padding: 10px;
	background-color: #DAD9FF;
	display: table-cell;
}

#p1 {
	line-height: 200%;
}

#p2 {
	line-height: 150%;
}

footer {
	width: 1024px;
	height: 30px;
	margin: 0px;
	padding: 10px;
	background-color: #E8D9FF;
	text-align: center;
}
</style>



</head>


<body>
	<header>
		<h1>독서실 관리 프로그램</h1>

	</header>

	<nav>
		<h1>LINKS</h1>
		<ul id="menu">
			<li id="li1">좌석관리</li>
			<li id="li2">회원관리</li>
			<li id="li3">결재관리</li>
			<li id="li4">출석관리</li>
			<li id="li5">일정관리</li>
		</ul>
		<div>
			<ul id="list1">
				<li id="li7">좌석관리</li>
				<li id="li8">회원관리</li>
				<li id="li9">결재관리</li>
				<li id="li10">출석관리</li>
				<li id="li11">일정관리</li>
			</ul>


		</div>

	</nav>

	<section id="content">


							<!-------------------------------- 로그인 여부-------------------->
					<c:choose>
						<c:when test="${sessionScope.sid==null }">
							<td width="234" height="82" align="right" valign="middle"><a
								href="login"><input type="button" name="button" value="로그인"></a>
								<a href="join/join"><input type="button" name="button"
									value="회원가입"></a></td>
						</c:when>
						<c:otherwise>
							<td width="234" height="82" align="center" valign="bottom">
								<h4>${sid }님환영합니다.</h4> <input type="button" name="button"
								value="본인정보 관리"> <input type="button" name="button"
								value="복습"> <input name="button" type="button"
								onClick-"location.href='index.html' " value="로그아웃">
							</td>
						</c:otherwise>
					</c:choose>


					<!------------------------------- 로그인 여부 --------------------->


	</section>


	<footer>
		<p>Copyright&copy; 2016. 1.29</p>

	</footer>

</body>