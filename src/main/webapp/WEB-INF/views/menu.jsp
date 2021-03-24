<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./include/main.jsp" %>   
<!DOCTYPE html>
<html>
<head>


<title>DOGS</title>
<script type="text/javascript">
	$(function(){
		//홈
		$('#DogsHome').on('click', function(e) {
			$(this).attr('href', '${path}/');
		});		
		//홈
		$('#aHome').on('click', function(e) {
			$(this).attr('href', '${path}/info');
		});
		//강아지분양
		$('#aDogAdopt').on('click', function(e) {
			$(this).attr('href', '${path}/board/list');
		});
		//방문예약 및 문의
		$('#aQA').on('click', function(e) {
			$(this).attr('href', '${path}/QA/list');
		});
	/* 	//회사위치
		$('#aDog').on('click', function(e) {
			$(this).attr('href', '${path}/info');
		}); */
	});
</script>
</head>
<body>
	<div class="wrapper">
		<!-- S : Header -->
		<header>
			<div class="area">
				<h1><a href="/" id="DogsHome">DOGS</a></h1>
				<nav>
					<ul>
						<li><a href="{path}/QA/list" class="active" id="aHome">회사정보</a></li>
						<li><a href="" id="aDogAdopt">강아지분양</a></li>
						<li><a href="" id="aQA">방문예약 및 문의</a></li>
<!-- 						<li><a href="" id="aDog">강아지 정보</a></li> -->
					</ul>
				</nav>
				<div class="util">
					<a href="javascript:;">로그인</a>
					<a href="javascript:;">회원가입</a>
				</div>
			</div>
		</header>
	</div>
</body>
</html>