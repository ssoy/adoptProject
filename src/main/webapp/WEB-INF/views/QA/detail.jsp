<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/include.jsp" %>    
<!DOCTYPE html>
<html>
<head>
<title>한건조회</title>
<script type="text/javascript">
 	function deleteCheck() {
		const result = confirm("삭제하시겠습니까?");
		console.log(result);
		if (result){
			location.href='${path}/QA/delete?qnum=${qadto.qnum}';//get방식
		}
	} 
</script>
</head>
<body>

	<%@include file="../menu.jsp" %>
	
	
	<h2>한건조회</h2>
	글쓴이 : ${qadto.userid} <br>
	구분 : ${qadto.qchoose} <br>
	제목 : ${qadto.qsubject} <br>
	내용 : <textarea rows="5" cols="18" name="content" readonly>${qadto.qcontent}</textarea><br>
	<hr>
	<input type="button" value="수정" onclick="location.href='${path}/QA/update?qnum=${qadto.qnum}'">
	<input type="button" value="삭제" onclick="deleteCheck()">
	<input type="button" value="목록" onclick="location.href='${path}/QA/list'">
	
	<%@include file="../footer.jsp" %> 
</body>
</html>