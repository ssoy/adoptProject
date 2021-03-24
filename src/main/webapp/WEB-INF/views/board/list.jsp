<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/include.jsp" %>


<!DOCTYPE html>
<html >
<head>
<link rel="stylesheet" href="${path}/resources/css/dogboard.css">
<meta charset="UTF-8">
<title>전체조회</title>

</head>
<body>
<%@include file="../menu.jsp" %>
<!-- 갤러리시작 -->
<div class="sub_photo">
    <div class="title_area">
        <h4 class="hh_photo"><strong class="blind">갤러리</strong></h4>
    </div>
    <ul>
    <li>
        <p class="thmb">
            <a href="#">
                <img src="../resources/img/nam.png" alt="">  
            </a>
        </p>
        <strong>냄비</strong>
    </li>
    <li>
        <p class="thmb">
            <a href="#">
                <img src="../resources/img/nam.png" alt="">  
            </a>
        </p>
        <strong>냄비</strong>
    </li>
    <li>
        <p class="thmb">
            <a href="#">
                <img src="../resources/img/nam.png" alt="">  
            </a>
        </p>
        <strong>냄비</strong>
    </li>
    <li>
        <p class="thmb">
            <a href="#">
                <img src="../resources/img/nam.png" alt="">  
            </a>
        </p>
        <strong>냄비</strong>
    </li>
    <li>
        <p class="thmb">
            <a href="#">
                <img src="../resources/img/nam.png" alt="">  
            </a>
        </p>
        <strong>냄비</strong>
    </li>
    <li>
        <p class="thmb">
            <a href="#">
                <img src="../resources/img/nam.png" alt="">  
            </a>
        </p>
        <strong>냄비</strong>
    </li>
    <li>
        <p class="thmb">
            <a href="#">
                <img src="../resources/img/nam.png" alt="">  
            </a>
        </p>
        <strong>냄비</strong>
    </li>
    <li>
        <p class="thmb">
            <a href="#">
                <img src="../resources/img/nam.png" alt="">  
            </a>
        </p>
        <strong>냄비</strong>
    </li>
    </ul>
</div>
<!-- 갤러리끝 -->


<!-- 페이징시작 
<div class="paginate">
<a class="pre" href="#">이전</a>
<a href="#">1</a>
<a href="#">2</a>
<a href="#">3</a>
<a href="#">4</a>
<strong>5</strong>  선택된페이지 
<a href="#">6</a>
<a href="#">7</a>
<a href="#">8</a>
<a href="#">9</a>
<a href="#">10</a>
<a class="next" href="#">다음</a>
</div>
 페이징끝 -->
	

	<div id="boardList"></div>
	<div id="paging"></div>
	
	
<%@include file="../footer.jsp" %>
</div>
</body>
</html>