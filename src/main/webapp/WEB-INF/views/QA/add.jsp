<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/include.jsp" %>    
<!DOCTYPE html>
<html>
<head>
<title>방문예약 및 문의 글작성</title>
<script type="text/javascript">
	function addCheck() {
		const userid = frmAdd.userid.value;
		const qsubject = frmAdd.qsubject.value;
		const qcontent = frmAdd.qcontent.value;
		console.log(userid);
		console.log(qsubject);
		console.log(qcontent);
		if (userid==''){
			alert('아이디을 입력해주세요!');
			frmAdd.userid.focus();
		}else if (qsubject==''){
			alert('제목을 입력해주세요!');
			frmAdd.qsubject.focus();
		}else if (qcontent==''){
			alert('내용을 입력해주세요!');
			frmAdd.qcontent.focus();
		}else{
			frmAdd.submit();
		}
	}

</script>
</head>
<body>

	<%@include file="../menu.jsp" %>
	
	
	<h2>추가</h2>
	<form name="frmAdd" action="${path}/QA/add" method="post">
		글쓴이 <input type="text" name="userid"> <br>
		방문예약 및 문의  
		<select name="qchoose">
			<option>문의</option>
			<option selected>방문예약</option>
		</select><br>
		제목 <input type="text" name="qsubject"> <br>
		내용 <textarea rows="5" cols="18" name="qcontent"></textarea><br>
		<hr>
		<input type="button" value="저장" onclick="addCheck()">
		<input type="button" value="목록" onClick="location.href='${path}/QA/list'">


	</form>
	
	
	<%@include file="../footer.jsp" %> 
</body>
</html>