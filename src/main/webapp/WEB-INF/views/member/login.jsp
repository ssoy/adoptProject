<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/include.jsp"  %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script type="text/javascript">
	function loginCheck() {
		const userid = frmLogin.userid.value;
		const passwd = frmLogin.passwd.value;
		console.log(userid);
		console.log(passwd);
		if (userid==''){
			alert('아이디를 입력해 주세요!');
			frmLogin.userid.focus();
		}else if (passwd==''){
			alert('비밀번호를 입력해 주세요!');
			frmLogin.passwd.focus();
		}else{
			frmLogin.submit();
		}
		
	}
</script>
</head>
<body>
	<h2>로그인</h2>
	<form name="frmLogin" action="${path}/member/login" method="post">
		아이디 <input type="text" name="userid"> <br>
		비밀번호 <input type="password" name="passwd"> <br>
		<input type="button" onclick="loginCheck()" value="로그인">
	</form>
</body>
</html>