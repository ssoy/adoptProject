<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/include.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정</title>
<script type="text/javascript">
	function modifyCheck() {
		const userid = frmModify.userid.value;
		const oldpasswd = frmModify.oldpasswd.value;
		const email = frmModify.email.value;
		
		console.log(userid);
		console.log(oldpasswd);
		console.log(email);
		
		if (userid==''){
			alert('아이디를 입력하세요');
			frmModify.userid.focus();
		}else if (oldpasswd ==''){
			alert('기존비밀번호를 입력하세요');
			frmModify.oldpasswd.focus();
		}else if (email==''){
			alert('이메일를 입력하세요');
			frmModify.email.focus();
		}else{
			frmModify.submit();
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
			document.frmModify.addr1.value = roadAddrPart1;
			document.frmModify.addr2.value = addrDetail;
			document.frmModify.zip.value = zipNo;
	}
	
</script>
</head>
<body>
<!-- 	기존비밀번호 반드시 입력 : 기존비밀번호 불일치시 수정 불가
		변경비밀번호는 선택 : 기존비밀번호 그대로 저장  -->	
	<h2>수정</h2>
	<form name="frmModify" action="${path}/member/modify" method="post" enctype="multipart/form-data">
		아이디 <input type="text" name="userid" value="${mdto.userid}" readonly><br>
		기존비밀번호 <input type="password" name="oldpasswd"><br>
		변경비밀번호 <input type="password" name="passwd"><br>
		이메일 <input type="email" name="email" value="${mdto.email}"><br>
		주소 <input type="text" name="zip" size="5" value="${mdto.zip}" maxlength="5">
		<input type="button" value="주소찾기" onClick="goPopup();"><br>
		<input type="text" name="addr1" value="${mdto.addr1}">
		<input type="text" name="addr2" value="${mdto.addr2}"><br>
		사진 :  <input type="text" name="filename" value="${mdto.filename}" readonly><br>
		<input type="file" name="uploadfile"><br>
		<input type="button" value="수정" onclick="modifyCheck()">
		<input type="reset" value="취소">
	</form>	
</body>
</html>