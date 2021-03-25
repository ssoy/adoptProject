<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/include.jsp"  %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보</title>
<script type="text/javascript">
	function deleteCheck() {
		const result = confirm('정말 삭제하시겠습니까?');
		if (result){
			location.href='${path}/member/delete';
		}
	}


</script>
</head>
<body>
	<h2>내정보</h2>
	아이디 : ${mdto.userid}<br>
	이메일 : ${mdto.email}<br>
	주소 : ${mdto.zip}<br>
	${mdto.addr1} <br>${mdto.addr2}<br>
	사진 : ${mdto.filename}
	<img alt="" src="${path}/localimg/${mdto.filename}" width="30">
	
	<hr>
	<input type="button" value="수정" onclick="location.href='${path}/member/modify'">
	<input type="button" value="회원탈퇴" onclick="deleteCheck()">
	
</body>
</html>