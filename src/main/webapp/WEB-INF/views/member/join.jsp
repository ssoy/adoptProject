<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/include.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script type="text/javascript">
	function joinCheck() {
		const userid = frmJoin.userid.value;
		const passwd = frmJoin.passwd.value;
		const email = frmJoin.email.value;
		
		console.log(userid);
		console.log(passwd);
		console.log(email);
		
		if (userid==''){
			alert('아이디를 입력하세요');
			frmJoin.userid.focus();
		}else if (passwd ==''){
			alert('비밀번호를 입력하세요');
			frmJoin.passwd.focus();
		}else if (email==''){
			alert('이메일를 입력하세요');
			frmJoin.email.focus();
		}else{
			frmJoin.submit();
		}
		
	}

	function goPopup(){
		// 주소검색을 수행할 팝업 페이지를 호출합니다.
		// 호출된 페이지(jusopopup.jsp)에서 실제 주소검색URL(https://www.juso.go.kr/addrlink/addrLinkUrl.do)를 호출하게 됩니다.
		var pop = window.open("/adopt/member/jusoPopup","pop","width=570,height=420, scrollbars=yes, resizable=yes"); 
		
	}
	//roadAddrPart1, addrDetail, zipNo
	function jusoCallBack(roadFullAddr,roadAddrPart1,addrDetail,roadAddrPart2,engAddr, jibunAddr, zipNo, admCd, rnMgtSn, bdMgtSn,detBdNmList,bdNm,bdKdcd,siNm,sggNm,emdNm,liNm,rn,udrtYn,buldMnnm,buldSlno,mtYn,lnbrMnnm,lnbrSlno,emdNo){
			// 팝업페이지에서 주소입력한 정보를 받아서, 현 페이지에 정보를 등록합니다.
			document.frmJoin.addr1.value = roadAddrPart1;
			document.frmJoin.addr2.value = addrDetail;
			document.frmJoin.zip.value = zipNo;
	}

</script>
</head>
<body>
	<h2>회원가입</h2>
	<form name="frmJoin" action="${path}/member/join" method="post" enctype="multipart/form-data">
		아이디 <input type="text" name="userid"><br>
		비밀번호 <input type="password" name="passwd"><br>
		이메일 <input type="email" name="email"><br>
		<!-- 도로명주소api적용 -->
		주소 <input type="text" name="zip" size="5"> <input type="button" value="주소찾기" onClick="goPopup();"><br>
		<input type="text" name="addr1"><br>
		<input type="text" name="addr2"><br>
		사진 <input type="file" name="uploadfile"><br>
		<input type="button" value="가입" onclick="joinCheck()">
		<input type="reset" value="취소">	
	</form>
</body>
</html>