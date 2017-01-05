<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<title>LMS</title>

<!-- Bootstrap 3.3.5 -->
<link rel="stylesheet" href="<c:url value="/css/bootstrap.min.css"/>">
<!-- Font Awesome -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
<!-- Ionicons -->
<link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
<!-- Theme style -->
<link rel="stylesheet" href="<c:url value="/css/AdminLTE.min.css"/>">
<!-- AdminLTE Skins. Choose a skin from the css/skins folder instead of downloading all of them to reduce the load. -->
<link rel="stylesheet" href="<c:url value="/css/_all-skins.min.css"/>">

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
	</div>
	<!-- 모달 END -->
	
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
	</div>
	<!-- 모달 END -->

	
	
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
									<li><a href="#">-</a></li>
									<li><a href="#">-</a></li>

								</ul>
							</li>
							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown">회원관리<span class="caret"></span></a>
								<ul class="dropdown-menu" role="menu">
									<li><a href="/lms/user/userDetail/userDetail">회원등록</a></li>
									<li><a href="#">회원정보</a></li>
									<li><a href="/lms/userDetail/userDetailModify">회원수정</a></li>
								</ul>
							</li>
							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown">결제관리<span class="caret"></span></a>
								<ul class="dropdown-menu" role="menu">
									<li><a href="/lms/user/payment/payment">결제등록</a></li>
									<li><a href="#">-</a></li>
									<li><a href="#">-</a></li>
								</ul>
							</li>

							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown">예약관리 <span class="caret"></span></a>
								<ul class="dropdown-menu" role="menu">
									<li><a href="#">-</a>
									<li><a href="#">-</a>
									<li><a href="#">-</a>
								</ul>
							</li>
							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown">출결관리 <span class="caret"></span></a>
								<ul class="dropdown-menu" role="menu">
									<li><a href="#">-</a>
									<li><a href="#">-</a>
									<li><a href="#">-</a>
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
									
									<li class="dropdown"><a href="#" class="dropdown-toggle"
										data-toggle="dropdown">로그인</a>
										<ul class="dropdown-menu" role="menu">
											<li><a href="/lms/login/login">로그인</a></li>
											<li><a href="#">회원가입</a></li>
										</ul>
									</li>
									
								</c:when>
								<c:otherwise>
									<li class="dropdown"><a href="#" class="dropdown-toggle"
										data-toggle="dropdown">${sid }</a>
										<ul class="dropdown-menu" role="menu">
											<li><a href="#">로그아웃</a></li>
											<li><a href="#"></a></li>
										</ul>
									</li>
									
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
					<!-- 이미지 슬라이드 -->
					<div class="box box-info">
						<!-- /.box-header -->
						<div class="box-body">
							<div class="box-body">
								<div id="carousel-example-generic" class="carousel slide"
									data-ride="carousel">
									<ol class="carousel-indicators" style="float: right">
										<li data-target="#carousel-example-generic" data-slide-to="0"
											class="active"></li>
										<li data-target="#carousel-example-generic" data-slide-to="1"
											class=""></li>
										<li data-target="#carousel-example-generic" data-slide-to="2"
											class=""></li>
									</ol>
									<div class="carousel-inner">
										<div class="item active">
											<img src="<c:url value="/img/1.jpg"/>" alt="First slide"
												style="margin-left: auto; margin-right: auto;">
											<div class="carousel-caption">First Slide</div>
										</div>
										<div class="item">
											<img src="<c:url value="/img/2.jpg"/>" alt="Second slide"
												style="margin-left: auto; margin-right: auto;">
											<div class="carousel-caption">Second Slide</div>
										</div>
										<div class="item">
											<img src="<c:url value="/img/3.jpg"/>" alt="Third slide"
												style="margin-left: auto; margin-right: auto;">
											<div class="carousel-caption">Third Slide</div>
										</div>
									</div>
									<a class="left carousel-control"
										href="#carousel-example-generic" data-slide="prev"> <span
										class="fa fa-angle-left"></span>
									</a> <a class="right carousel-control"
										href="#carousel-example-generic" data-slide="next"> <span
										class="fa fa-angle-right"></span>
									</a>
								</div>
							</div>
							<!-- /.box-body -->
							<!-- /.table-responsive -->
						</div>
						<!-- /.box-body -->

					</div>
					
					
					<!-- second -->
					<div class="row">
						<div class="col-md-6">
							<div class="box box-info">
								<div class="box-header with-border">
									<h3 class="box-title">입출결현황</h3>
									<div class="box-tools pull-right">

									</div>
								</div>
								<!-- /.box-header -->
								<div class="box-body">
									<div id="noticeView" class="table-responsive"></div>
									<!-- /.table-responsive -->
								</div>
								<!-- /.box-body -->
							</div>
						</div>
				
						<div class="col-md-6">
							<div class="box box-info">
								<div class="box-header with-border">
									<h3 class="box-title">공지사항</h3>
									<div class="box-tools pull-right">

									</div>
								</div>
								<!-- /.box-header -->
								<div class="box-body">
									<div id="boardView" class="table-responsive"></div>
									<!-- /.table-responsive -->
								</div>
								<!-- /.box-body -->
							</div>
						</div>
					</div>
					<!-- ./second -->
					
					
					<div class="box box-info">
						<!-- /.box-header -->
						<div class="box-body">
							<div class="box-body">
								<div class="box-header with-border">
									<h3 class="box-title">좌석현황</h3>
									<div class="box-tools pull-right">

									</div>
								</div>
									<img src="<c:url value="/img/seat.jpg"/>" alt="First slide"
												style="margin-left: auto; margin-right: auto;">
							</div>
							<!-- /.box-body -->
							<!-- /.table-responsive -->
						</div>
						<!-- /.box-body -->

					</div>

				</section>
				<!-- /.content -->
			</div>
			<!-- /.container -->
			<!-- /.content-wrapper -->
			
			<footer class="main-footer navbar-fixed-bottom">
				<div class="container">
					<div class="pull-right hidden-xs">
						<b>Version</b> 1.0.0
					</div>
					<strong>Copyright &copy; 2017 <a
						href="#">LMS</a>
					</strong> All rights reserved.
				</div>
			</footer>
		</div>
	</div>
	<!-- ./wrapper -->





	<c:choose>
	<c:when test="${loginMsg!=null }">
		<script>
		
		$("#modalContent").html("${loginMsg}");
		$("#modal").modal({show:true});
		
		<%session.removeAttribute("loginMsg");%>
			
		</script>
	</c:when>
</c:choose> 
<c:choose>
	<c:when test="${adminMsg!=null }">
		<script>
		$("#modalContent").html("${adminMsg}");
		$("#modal").modal('show');
		
		<%session.removeAttribute("adminMsg");%>
			
		</script>
	</c:when>
</c:choose>

<script>
	$("#modal").on("hidden.bs.modal", function(){
		document.location.href="/lms/login/login";
	});
</script>
