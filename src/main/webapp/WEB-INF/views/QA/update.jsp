<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/include.jsp" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정</title>
<script type="text/javascript">
	function updateCheck() {
		const qsubject = frmUpdate.qsubject.value;
		const qcontent = frmUpdate.qcontent.value;
		console.log(qsubject);
		console.log(qcontent);
		if (qsubject==''){
			alert('제목을 입력해주세요!');
			frmAdd.qsubject.focus();
		}else if (qcontent==''){
			alert('장르를 선택해주세요!');
			frmUpdate.qcontent.focus();
		}else{
			frmUpdate.submit();
		}
	}

</script>
</head>
<body>
	<h2>수정</h2>
	<form name="frmUpdate" action="${path}/QA/update" method="post">
		번호 <input type="text" name="qnum" value="${qadto.qnum}" readonly> <br>
		글쓴이 <input type="text" name="userid" value="${qadto.userid}" readonly> <br>
		방문예약 및 문의 
		<select name="qchoose">
			<option <c:out value="${qadto.qchoose=='QA'?'selected':''}"/>>문의</option>
			<option <c:out value="${qadto.qchoose=='방문예약'?'selected':''}"/>>방문예약</option>
		</select><br>
		제목 <input type="text" name="qsubject" value="${qadto.qsubject}"> <br>
		내용 <textarea rows="5" cols="18" name="qcontent">${qadto.qcontent}</textarea><br>
		<hr>
		<input type="button" value="저장" onclick="updateCheck()">
		<input type="button" value="목록" onclick="location.href='${path}/QA/list'">
	</form>
	
	<%@include file="../footer.jsp" %> 
</body>
</html>