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
		const subject = frmUpdate.subject.value;
		const genre = frmUpdate.genre.value;
		const showtime = frmUpdate.showtime.value;
		const opendate = frmUpdate.opendate.value;
		console.log(subject);
		console.log(genre);
		console.log(showtime);
		console.log(opendate);
		if (subject==''){
			alert('제목을 입력해주세요!');
			frmAdd.subject.focus();
		}else if (genre==''){
			alert('장르를 선택해주세요!');
			frmUpdate.genre.focus();
		}else if (showtime==''){
			alert('상영시간을 선택해주세요!');
			frmUpdate.showtime.focus();
		}else if (opendate==''){
			alert('개봉일자를 선택해주세요!');
			frmUpdate.opendate.focus();
		}else{
			frmUpdate.submit();
		}
	}

</script>
</head>
<body>
	<h2>수정</h2>
	<form name="frmUpdate" action="${path}/QA/update" method="post">
		번호 :<input type="text" name="num" value="${qadto.num}"> <br>
		제목 <input type="text" name="subject" value="${qadto.subject}"> <br>
		방문예약 및 문의 
		<select name="choose">
			<option <c:out value="${qadto.choose=='QA'?'selected':''}"/>>QA</option>
			<option <c:out value="${qadto.choose=='방문예약'?'selected':''}"/>>방문예약</option>
		</select><br>
		내용 <textarea rows="5" cols="18" name="content">${qadto.content}</textarea><br>
		<hr>
		<input type="button" value="저장" onclick="updateCheck()">
	</form>
	
	<%@include file="../footer.jsp" %> 
</body>
</html>