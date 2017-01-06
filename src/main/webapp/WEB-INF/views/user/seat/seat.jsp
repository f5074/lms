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
<link rel="stylesheet" href="<c:url value="/css/user/seat_table.css"/>">



<script src="http://code.jquery.com/jquery-2.1.4.min.js"></script>

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
						<!-- /.box-header -->
						<div class="box-body">
							<div class="box-body">
									
									
									<table class="seat_table">
										<tr>
											<th class="seat_th"></th>
											<th class="seat_th"></th>
											<th class="seat_th"></th>
											<th class="seat_th_blink"></th>
											<th class="seat_th"></th>
											<th class="seat_th"></th>
											<th class="seat_th_blink"></th>
											<th class="seat_th"></th>
											<th class="seat_th"></th>
											<th class="seat_th_blink"></th>
											<th class="seat_th"></th>
											<th class="seat_th"></th>										
										</tr>
										<tr>
											<td><div>&nbsp;</div></td>
											<td></td>
											<td class="red">67</td>
											<td class="border_top"></td>
											<td class="red">68</td>
											<td class="red"><div>71 임수진</div></td>
											<td class="border_top"></td>
											<td class="red">72</td>
											<td class="red">75</td>
											<td class="border_top"></td>
											<td class="red">76</td>
											<td class="red">78</td>											
										</tr>
										<tr>
											<td><div>&nbsp;</div></td>
											<td></td>
											<td class="red">66</td>
											<td></td>
											<td class="red">69</td>
											<td class="red">70</td>
											<td></td>
											<td class="red">73</td>
											<td class="red">74</td>
											<td></td>
											<td class="red">77</td>
											<td class="red">79</td>											
										</tr>
										<tr>
											<td class="seat_blink"></td>
											<td></td>
											<td class="border_left"></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td class="border_right"></td>											
										</tr>
										<tr>
											<td><div>&nbsp;</div></td>
											<td></td>
											<td class="red">65</td>
											<td class="border_bottom"></td>
											<td class="border_bottom"></td>
											<td></td>
											<td></td>
											<td class="red">89</td>
											<td class="red">88</td>
											<td></td>
											<td class="red">85</td>
											<td class="red">80</td>											
										</tr>
										<tr>
											<td class="gray"><div>화장실</div></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td class="red">93</td>
											<td></td>
											<td class="red">90</td>
											<td class="red">87</td>
											<td></td>
											<td class="red">84</td>
											<td class="red">81</td>											
										</tr>
										<tr>
											<td><div>&nbsp;</div></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td class="red">92</td>
											<td class="border_bottom"></td>
											<td class="red">91</td>
											<td class="red">86</td>
											<td class="border_bottom"></td>
											<td class="red">83</td>
											<td class="red">82</td>											
										</tr>
										<tr>
											<td><div>&nbsp;</div></td>
											<td class="deapblue">21</td>
											<td class="deapblue">22</td>
											<td></td>
											<td></td>
											<td class="deapred">63</td>
											<td></td>
											<td class="deapred">62</td>
											<td class="deapred">60</td>
											<td></td>
											<td class="deapred">58</td>
											<td class="deapred">56</td>											
										</tr>
										<tr>
											<td><div>&nbsp;</div></td>
											<td class="deapblue">19</td>
											<td class="deapblue">20</td>
											<td></td>
											<td></td>
											<td class="deapred">64</td>
											<td></td>
											<td class="deapred">61</td>
											<td class="deapred">59</td>
											<td></td>
											<td class="deapred">57</td>
											<td class="deapred">55</td>											
										</tr>
										<tr>
											<td class="seat_blink"><div>&nbsp;</div></td>
											<td class="border_left"></td>
											<td class="border_right"></td>
											<td></td>
											<td></td>
											<td class="border_left"></td>
											<td ></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td class="border_right"></td>											
										</tr>
										<tr>
											<td><div>&nbsp;</div></td>
											<td class="deapblue">17</td>
											<td class="deapblue">18</td>
											<td></td>
											<td></td>
											<td class="deapred">45</td>
											<td></td>
											<td class="deapred">48</td>
											<td class="deapred">50</td>
											<td></td>
											<td class="deapred">52</td>
											<td class="deapred">54</td>											
										</tr>
										<tr>
											<td class="blue"><div>12</div></td>
											<td class="blue">15</td>
											<td class="blue">16</td>
											<td></td>
											<td></td>
											<td class="deapred">46</td>
											<td class="border_bottom"></td>
											<td class="deapred">47</td>
											<td class="deapred">49</td>
											<td class="border_bottom"></td>
											<td class="deapred">51</td>
											<td class="deapred">53</td>											
										</tr>
										<tr>
											<td class="blue"><div>11</div></td>
											<td></td>
											<td class="border_right"></td>
											<td></td>
											<td></td>
											<td class="deapblue">44</td>
											<td></td>
											<td class="deapblue">42</td>
											<td class="deapblue">40</td>
											<td></td>
											<td class="deapblue">38</td>
											<td class="deapblue">36</td>											
										</tr>
										<tr>
											<td class="blue"><div>10</div></td>
											<td class="blue">13</td>
											<td class="blue">14</td>
											<td></td>
											<td></td>
											<td class="deapblue">43</td>
											<td></td>
											<td class="deapblue">41</td>
											<td class="deapblue">39</td>
											<td></td>
											<td class="deapblue">37</td>
											<td class="deapblue">35</td>											
										</tr>
										<tr>
											<td class="blue"><div>9</div></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td class="border_left"></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td class="border_right"></td>											
										</tr>
										<tr>
											<td class="blue"><div>8</div></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td class="deapblue">25</td>
											<td></td>
											<td class="deapblue">27</td>
											<td class="deapblue">29</td>
											<td></td>
											<td class="deapblue">31</td>
											<td class="deapblue">33</td>											
										</tr>
										<tr>
											<td class="blue"><div>7</div></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td class="deapblue">26</td>
											<td class="border_bottom"></td>
											<td class="deapblue">28</td>
											<td class="deapblue">30</td>
											<td class="border_bottom"></td>
											<td class="deapblue">32</td>
											<td class="deapblue">34</td>											
										</tr>
										<tr>
											<td><div>&nbsp;</div></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td class="pink">6</td>
											<td class="pink">5</td>
											<td></td>
											<td class="pink">4</td>
											<td class="pink">3</td>											
										</tr>
										<tr>
											<td><div>&nbsp;</div></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td class="pink">2</td>											
										</tr>
										<tr>
											<td class="gray"><div>출입구</div></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td class="pink">1</td>											
										</tr>
										<tr>
											<td><div>&nbsp;</div></td>
											<td></td>
											<td></td>
											<td></td>
											<td class="gray"><div>사무실</div></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td class="pink">99</td>											
										</tr>
									</table>
									
									
									
									
									
							</div>
							<!-- /.box-body -->
							<!-- /.table-responsive -->
						</div>
						<!-- /.box-body -->

					</div>
					<!-- 두번째 꺼 -->
					<div class="row">
						<div class="col-md-6">
							<div class="box box-info">
								<div class="box-header with-border">
									<h3 class="box-title">#</h3>
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
						<!-- 두번째꺼 -->

						<!-- 두번째 꺼 -->
						<div class="col-md-6">
							<div class="box box-info">
								<div class="box-header with-border">
									<h3 class="box-title">#</h3>
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
						<!-- 두번째꺼 -->
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