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

<!-- ADD THE CLASS layout-top-nav TO REMOVE THE SIDEBAR. -->
<body class="hold-transition skin-blue layout-top-nav">

	<!-- 작은 모달 -->
	<div class="modal fade" id="modal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-sm">
			<div class="modal-content">
				<div class="modal-header" id="modalHeader">
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">×</span><span class="sr-only">Close</span>
					</button>
					<h4 class="modal-title" id="modalTitle">LMS 알림메시지</h4>
				</div>
				<div class="modal-body" id="modalContent">...</div>
				<div class="modal-footer" id="modalBtns">
					<button type="button" class="btn btn-primary" data-dismiss="modal">확인</button>
				</div>
			</div>
		</div>
	</div>
	<!-- 모달 END -->

	<!-- 로그아웃용 작은 모달 -->
	<div class="modal fade" id="modal1" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-sm">
			<div class="modal-content">
				<div class="modal-header" id="modalHeader1">
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">×</span> <span class="sr-only">Close</span>
					</button>
					<h4 class="modal-title" id="modalTitle1">LMS 알림메시지</h4>
				</div>
				<div class="modal-body" id="modalContent1">로그아웃 되었습니다.</div>
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
									<li><a href="#">-</a></li>
									<li><a href="#">-</a></li>
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
									<li><a href="#"> 로그인 </a></li>
									<li><a href="#"> 회원가입 </a></li>
									<!-- 회원가입 -->
								</c:when>
								<c:otherwise>
									<li class="dropdown"><a href="#" class="dropdown-toggle"
										data-toggle="dropdown">${sid }</a>
										<ul class="dropdown-menu" role="menu">
											<li><a href="#">복습</a></li>
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
			
							<!-- row -->
							<div class="row">
								<div class="col-sm-12">
									<div class="the-box">
										<form method="POST" action="#" accept-charset="UTF-8" class="form-horizontal" id="addForm">
											<input name="_token" type="hidden"
												value="sLNs1goRacLky1uDTFebUMuZ8gdyTSSOeYSMxYv0"> <input
												name="profile_filename" type="hidden" value="">

											<fieldset>
												<legend>회원정보</legend>

												<div class="the-box no-border property-list">
													<div class="media">

														<div class="pull-left">
	
															<div>회원검색 <a href="#" type="button" class="btn btn-danger btn-xs">검색</a></div>
															<div><input type="text" class="form-control" name="#"></div>
														</div>
														<div class="clearfix visible-xs"></div>
														<div class="media-body">

															
															
																	<div class="form-group">
																		<label class="col-sm-4 control-label">이름</label>
																		<div class="col-sm-8">
																			<input type="text" class="form-control" placeholder="필수 입력" name="#" >
																		</div>
																	</div>
<!-- 																	<div class="form-group">
																		<label class="col-sm-4 control-label">성별</label>
																		<div class="col-sm-8">
																			<label for="M">남성</label> <input type="radio" name="gender" id="M" value="M">
																			<label for="F">여성</label> <input type="radio" name="gender" id="F" value="F"> 	
																		</div>
																	</div>	 -->																
																	<div class="form-group">
																		<label class="col-sm-4 control-label">연락처_학생</label>
																		<div class="col-sm-8">
																			<input type="text" class="form-control" placeholder="필수 입력" name="#">
																		</div>
																	</div>
																	<div class="form-group">
																		<label class="col-sm-4 control-label">학교명(소속)</label>
																		<div class="col-sm-8">
																			<input type="text" class="form-control" name="#">
																		</div>
																	</div>																	

																	<div class="form-group">
																		<label class="col-sm-4 control-label">학년</label>
																		<div class="col-sm-8">
																			<input type="text" class="form-control" name="#">
																		</div>
																	</div>
																	<div class="form-group">
																		<label class="col-sm-4 control-label">주소</label>
																		<div class="col-sm-8">
																			<input type="text" class="form-control" name="#" size="50">
																		</div>
																	</div>
																	<div class="form-group">
																		<label class="col-sm-4 control-label">연락처_부모</label>
																		<div class="col-sm-8">
																			<input type="text" class="form-control" placeholder="필수 입력" name="#">
																		</div>
																	</div>
																	
																	<div class="form-group">
																		<label class="col-sm-4 control-label">문자 알림 
																			<i class="fa fa-question-circle" data-toggle="tooltip" title="" data-original-title="입퇴실 시 문자전송하는기능"></i>
																		</label>
																		<div class="col-sm-8">
																			<div class="onoffswitch">
																				<input type="checkbox" class="onoffswitch-checkbox" name="option1" value="Y" id="switch-1" checked="">
																				<label class="onoffswitch-label" for="switch-1" style="height: 20px"> 
																					<span class="onoffswitch-inner"></span>
																					<span class="onoffswitch-switch" style="background: #CCCCCC;"></span>
																				</label>
																			</div>
																		</div>
																	</div>
																	
																	<div class="form-group">
																		<label class="col-sm-4 control-label">좌석번호</label>
																		<div class="col-sm-8">
																			<select class="form-control" name="#">
																				<option value="0">선택</option>
																				<option value="1">1</option>
																				<option value="2">2</option>
																				<option value="3">3</option>
																			</select>
																		</div>
																	</div>
																	<div class="form-group">
																		<label class="col-sm-4 control-label">등록시작일</label>
																		<div class="col-sm-8">
																			<input type="date" class="form-control" name="#">
																		</div>
																	</div>
																	<div class="form-group">
																		<label class="col-sm-4 control-label">등록종료일</label>
																		<div class="col-sm-8">
																			<input type="date" class="form-control" name="#">
																		</div>
																	</div>
																	<div class="form-group">
																		<label class="col-sm-4 control-label">이용요금</label>
																		<div class="col-sm-8">
																			<input type="text" class="form-control" name="#">
																		</div>
																	</div>
																	<div class="form-group">
																		<label class="col-sm-4 control-label">결제방식</label>
																		<div class="col-sm-8">
																			<input type="text" class="form-control" name="#">
																		</div>
																	</div>

																	<div class="form-group">
																		<label class="col-sm-4 control-label">메모</label>
																		<div class="col-sm-8">
																			<textarea class="form-control" rows="4" name="#"></textarea>
																		</div>
																	</div>
																	
																	

<!-- 																<div class="form-group">
																		<label class="col-sm-4 control-label">수강료</label>
																		<div class="col-sm-8">
																			<div class="input-group">
																				<input type="text" class="form-control" name="tuition"> <span class="input-group-addon"><i class="fa fa-won"></i></span>
																			</div>
																		</div>
																	</div> -->


														</div>
													</div>

												</div>



											</fieldset>
										</form>

										<div class="the-box text-center clear">
											<a class="btn btn-primary btn-lg" href="/lms/"><i class="fa fa-reply"></i> 뒤로가기</a>
											<button class="btn btn-danger btn-lg" id="addBtn"><i class="fa fa-plus"></i> 등록하기 </button>
										</div>

									</div>
								</div>
							</div>
							<!-- /.row -->







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