<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./include/main.jsp" %>   

<!DOCTYPE html>
<html>
<head>
<title>DOGS</title>
</head>
<style>

	html { overflow: hidden; }
	html, body { width: 100%; height: 100%; margin: 0; padding: 0; }
	#wrapper{ width: 100%; height: 100%; position: absolute; overflow-y:scroll; }
	#content { width: 100%; }
	#footer 
	{ 
		overflow: hidden;
		position: absolute;
		bottom: 0; 
		height: 100px; width:100%; text-align: center;
		margin-left:0px; margin-bottom:-1px;
		background:#CCC;
	}

</style>

<body>
		<!-- S : footer -->
		<footer>
			상호 : 독스<br>
			<address>주소 : 서울시 관악구 신림로 340, 르네상스복합쇼핑몰 6층</address>
			사업자등록번호 : 548-82-99999<br>
			<a href="mailto:coding@gmail.com">이메일 : coding@gmail.com</a>
		</footer>
		<!-- E : footer -->

</body>
</html>