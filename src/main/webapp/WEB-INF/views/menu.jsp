<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./include/include.jsp" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Script-Type" content="text/javascript">
<meta http-equiv="Content-Style-Type" content="text/css">
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link rel="stylesheet" href="${path}/resources/css/style.css?ver=1">
<script type="text/javascript" src="${path}/resources/js/jquery-1.9.1.min.js"></script>

<title>DOGS</title>
<script type="text/javascript">
	$(function(){
		//홈
		$('#aHome').on('click', function(e) {
			$(this).attr('href', '${path}/');
		});
		//강아지분양
		$('#aDogAdopt').on('click', function(e) {
			$(this).attr('href', '${path}/board/');
		});
		//방문예약 및 문의
		$('#aQA').on('click', function(e) {
			$(this).attr('href', '${path}/QA/');
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
				<h1><a href="/">DOGS</a></h1>
				<nav>
					<ul>
						<li><a href="{path}/QA/list" class="active" id="aHome">HOME</a></li>
						<li><a href="" id="aDogAdopt">강아지분양</a></li>
						<li><a href="" id="aQA">방문예약 및 문의</a></li>
						<li><a href="" id="aDog">강아지 정보</a></li>
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