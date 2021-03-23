<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/include.jsp" %>     
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>강아지 분양게시판</title>
<!-- 핸들바 탬플릿 cdn추가 -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/4.7.7/handlebars.min.js"></script>
<!-- 탬플릿 소스 -->
<script id="template_source" type="text/x-handlebars-template">
<div class="board_list_wrap">
	<div class="board_list">
		<div class="board_list_head">
            <div>
                <div class="num">번호</div>
                <div class="tit">제목</div>
                <div class="writer">작성자id</div>
				<div class="date">등록일자</div>
				<div class="view">조회수</div>
            </div>
            {{#each.}}
            <div class="board_list_body">
		    	<div class="item">
    	            <div class="num">{{bnum}}</div>
        	        <div class="tit"><a href='${path}/board/detail/{{bnum}}'>{{subject}}</a></div>
					<div class="writer">{{userid}}</div>
               		<div class="date">{{regdate}}</div>
                	<div class="view">{{readcount}}</div>
            	</div>
            {{/each}}
        </div>
    </div>
</div>

</script>
        
  		<link rel="stylesheet" href="resources/css/board.css">
    </head>
    <body>
    
    <!-- menu파일불러오기 -->
	<%@include file="../menu.jsp" %>
	
	
    <div class="container">
		<form name="frmList" action="">
			<select name="findKey">
				<option value="userid">아이디</option>
				<option value="subject">제목</option>
				<option value="content">내용</option>
				<option value="subcon">제목+내용</option>
			</select>
			<input type="text" name="findValue"> 
			<button id="btnList">조회</button>
			<button id="btnAdd">게시글추가</button>
		</form>
		<div id="boardList"></div>
		<div id="paging"></div>
	</div>
            <!-- <div class="paging">
                <a href="#" class="bt first">처음 페이지</a>
                <a href="#" class="bt prev">이전 페이지</a>
                <a href="#" class="num on">1</a>
                <a href="#" class="num">2</a>
                <a href="#" class="num">3</a>
                <a href="#" class="bt next">다음 페이지</a>
                <a href="#" class="bt last">마지막 페이지</a>
            </div>
        </div> -->
        
        
        <%@include file="../footer.jsp" %> 
    </body>
</html>