<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/include.jsp" %>    
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>

	<%@include file="../menu.jsp" %>
	
	
	<h2>추가</h2>
	<form name="frmAdd" action="${path}/QA/add" method="post">
		제목 <input type="text" name="subject"> <br>
		방문예약 및 문의  
		<select name="choose">
			<option>QA</option>
			<option selected>방문예약</option>
		</select><br>
		내용 <textarea rows="5" cols="18" name="content"></textarea><br>
		<hr>
		<input type="button" value="저장" onclick="addCheck()">
	</form>
	
	
	<%@include file="../footer.jsp" %> 
</body>
</html>