<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<title>LMS</title>
<!-- Bootstrap 3.3.5 -->
<link rel="stylesheet" href="<c:url value="/css/bootstrap.min.css"/>">
<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
<!-- Ionicons -->
<link rel="stylesheet"
	href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">

<!-- Theme style -->
<link rel="stylesheet" href="<c:url value="/css/AdminLTE.min.css"/>">
<!-- AdminLTE Skins. Choose a skin from the css/skins
         folder instead of downloading all of them to reduce the load. -->
<link rel="stylesheet" href="<c:url value="/css/_all-skins.min.css"/>">
<script src="http://code.jquery.com/jquery-2.1.4.min.js"></script>

<!-- 로그아웃 추가 -->
<script src="<c:url value="/js/logout.js"/>"></script>

<!-- ADD THE CLASS layout-top-nav TO REMOVE THE SIDEBAR. -->
<body class="hold-transition skin-blue layout-top-nav">
	
	<!-- 작은 모달 -->
	<div class="modal fade" id="modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	  <div class="modal-dialog modal-sm">
	    <div class="modal-content">
	      <div class="modal-header" id="modalHeader">
		<button type="button"  class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
		<h4 class="modal-title" id="modalTitle">LMS 알림메시지</h4>
	      </div>
	      <div class="modal-body" id="modalContent">
			...
	      </div>
	      <div class="modal-footer" id="modalBtns">
		<button type="button" class="btn btn-primary" data-dismiss="modal">확인</button>
	      </div>
	    </div>
	  </div>
	</div><!-- 모달 END -->
	
	<!-- 로그아웃용 작은 모달 -->
	<div class="modal fade" id="modal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	  <div class="modal-dialog modal-sm">
	    <div class="modal-content">
	      <div class="modal-header" id="modalHeader1">
		<button type="button" class="close" data-dismiss="modal">
		<span aria-hidden="true">×</span>
		<span class="sr-only">Close</span>
		</button>
		<h4 class="modal-title" id="modalTitle1">LMS 알림메시지</h4>
	      </div>
	      <div class="modal-body" id="modalContent1">
			로그아웃 되었습니다.
	      </div>
	      <div class="modal-footer" id="modalBtns1">
		<button type="button" class="btn btn-primary" data-dismiss="modal">확인</button>
	      </div>
	    </div>
	  </div>
	</div><!-- 모달 END -->
	
	<div class="wrapper">
		<header class="main-header">
			<nav class="navbar navbar-static-top">
				<div class="container">
					<div class="navbar-header">
						<a href="/lms" class="navbar-brand"><b>참 좋은 독서실</b></a>
						<button type="button" class="navbar-toggle collapsed"
							data-toggle="collapse" data-target="#navbar-collapse">
							<i class="fa fa-bars"></i>
						</button>
					</div>

					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse pull-left"
						id="navbar-collapse">
						<ul class="nav navbar-nav">
							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown">좌석관리<span class="caret"></span></a>
								<ul class="dropdown-menu" role="menu">
									<li><a href="/lms/user/seat/seat">좌석이동</a></li>
								</ul>
							</li>
							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown">회원관리<span class="caret"></span></a>
								<ul class="dropdown-menu" role="menu">
									<li><a href="/lms/user/userDetail/userDetail">회원등록</a></li>
									<li><a href="/lms/user/userDetail/userDetailView">회원목록</a></li>
								</ul>
							</li>
							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown">결제관리<span class="caret"></span></a>
								<ul class="dropdown-menu" role="menu">
									<li><a href="/lms/user/payment/paymentView">결제목록</a></li>	
								</ul>
							</li>

							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown">출결관리 <span class="caret"></span></a>
								<ul class="dropdown-menu" role="menu">
									<li><a href="/lms/user/attendance/attendanceView">출결목록</a>

								</ul>
							</li>

								<c:if test="${sid=='admin' }">
									<li><a href="#">관리자페이지</a></li>
								</c:if>
						</ul>
					</div>
					<!-- /.navbar-collapse -->
					<!-- Navbar Right Menu -->
					<div class="navbar-custom-menu">
						<ul class="nav navbar-nav">

							<c:choose>
								<c:when test="${sessionScope.sid==null }">
									<li><a href="#"> 로그인 </a></li>
									<li><a href="#"> 회원가입 </a></li>
									<!-- 회원가입 -->
								</c:when>
								<c:otherwise>
									<li class="dropdown"><a href="#" class="dropdown-toggle"
										data-toggle="dropdown">${sid }</a>
										<ul class="dropdown-menu" role="menu">
											<li id="logout"><a>로그아웃</a></li>
										</ul></li>
									<!-- 회원가입 -->
								</c:otherwise>
							</c:choose>

						</ul>
					</div>
					<!-- /.navbar-custom-menu -->
				</div>
				<!-- /.container-fluid -->
			</nav>
		</header>
		<!-- Full Width Column -->
		<div class="content-wrapper">
			<div class="container">
				<!-- Content Header (Page header) -->
				<section class="content-header"></section>



				<!-- Main content -->
				<section class="content">
					
					<div class="box box-info">
						<div class="box-body">
								<div class="box-header with-border">
									<h3 class="box-title">출결목록</h3>
								</div>


<table class='table no-margin'>
	<tr>
		<th></th>
		<th>회원이름</th>
		<th>입실시간</th>	
		<th>퇴실시간</th>	
		<th>입실문자여부</th>	
		<th>퇴실문자여부</th>	
	</tr>


	
	<c:forEach var="attendance" items="${attendance }">
	<tr><td></td>
		<td>${attendance.userName }</td>
		<td>${attendance.checkInTime }</td>
		<td>${attendance.checkOutTime }</td>
		<td>${attendance.checkInSMS }</td>
		<td>${attendance.checkOutSMS }</td>
	</tr>
	</c:forEach>
</table>










						</div>
					</div>

				</section>
				<!-- /.content -->
			</div>
			<!-- /.container -->
			<!-- /.content-wrapper -->
			<footer class="main-footer navbar-fixed-bottom">
				<div class="container">
					<strong>Copyright &copy; 2017 <a href="#">LMS</a>
					</strong> All rights reserved.
					<div class="pull-right hidden-xs">
						<b>Version</b> 1.0.0
					</div>

				</div>
			</footer>
		</div>
	</div>
	<!-- ./wrapper -->


	<script src="http://code.jquery.com/jquery-2.1.4.min.js"></script>
	<!-- Bootstrap 3.3.5 -->
	<script src="<c:url value="/js/bootstrap.min.js"/>"></script>
	<!-- SlimScroll -->
	<script src="<c:url value="/js/jquery.slimscroll.min.js"/>"></script>
	<!-- FastClick -->
	<script src="<c:url value="/js/fastclick.min.js"/>"></script>
	<!-- AdminLTE App -->
	<script src="<c:url value="/js/app.min.js"/>"></script>
	<!-- AdminLTE for demo purposes -->
	<script src="<c:url value="/js/demo.js"/>"></script>