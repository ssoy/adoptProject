<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./include/include.jsp" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>찾아오시는길</title>
<script type="text/javascript" src="https://openapi.map.naver.com/openapi/v3/maps.js?ncpClientId=ykw4yzp95q"></script>
</head>
<body>
	<%@include file="menu.jsp" %>
	
	<h2>회사위치</h2>
	<div id="map" style="width:100%;height:400px;"></div>

	<script>
		//맵의 옵션
		var mapOptions = {
		    center: new naver.maps.LatLng(37.4847794, 126.9301180),
		    zoom: 15
		};
		
		var map = new naver.maps.Map('map', mapOptions);
		
		//마커 생성하기
		var marker = new naver.maps.Marker({
		    position: new naver.maps.LatLng(37.4847794, 126.9301180),
		    map: map
		});
		
	</script>
	
	<%@include file="footer.jsp" %>
</body>
</html>