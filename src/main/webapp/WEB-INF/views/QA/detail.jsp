<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/include.jsp" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>한건조회</title>
<script type="text/javascript">
	function deleteCheck() {
		const result = confirm("삭제하시겠습니까?");
		console.log(result);
		if (result){
			location.href='${path}/QA/delete?num=${qadto.num}';//get방식
		}
	}
</script>
</head>
<body>

	<%@include file="../menu.jsp" %>
	
	
	<h2>한건조회</h2>
	제목 : ${qadto.subject}<br>
	장르 : ${qadto.userid}<br>
	개봉일자 : ${qadto.regdate}<br>
	줄거리 <br>
	<textarea rows="20" cols="30" >${qadto.content}</textarea><br>
	<hr>
	<input type="button" value="수정" onclick="location.href='${path}/QA/update?num=${qadto.num}'">
	<input type="button" value="삭제" onclick="deleteCheck()">
	<input type="button" value="리스트" onclick="location.href='${path}/QA/list'">
	
	<%@include file="../footer.jsp" %> 
</body>
</html>