<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/include.jsp" %>     
<!DOCTYPE html>
<html>

<head>
<title>방문상담예약 및 문의</title>
<script type="text/javascript">
	function addCheck() {
		const subject = frmAdd.subject.value;
		const userid = frmAdd.genre.value;
		const content = frmAdd.showtime.value;
		console.log(subject);
		console.log(userid);
		console.log(content);
		if (subject==''){
			alert('제목을 입력해주세요!');
			frmAdd.subject.focus();
		}else if (userid==''){
			alert('장르를 선택해주세요!');
			frmAdd.userid.focus();
		}else if (content==''){
			alert('상영시간을 선택해주세요!');
			frmAdd.content.focus();
		}else{
			frmAdd.submit();
		}
	}

</script>

</head>
<body>
    
    <!-- menu파일불러오기 -->
	<%@include file="../menu.jsp" %>
	
	
   <h2>방문예약 및 문의</h2>
	<form action="${path}/QA/list">
		<select name="key">
			<option value="subject" <c:out value="${key=='subject'?'selected':''}"/>>제목</option>
			<option value="genre" <c:out value="${key=='userid'?'selected':''}"/>>아이디</option>
		</select>
		<input type="text" name="value" value="${value}">
		<input type="submit" value="조회">
		<input type="button" value="글작성" onclick="location.href='${path}/QA/add'">
	</form>
	<table border="1">
		<tr>
			<th>번호</th>
			<th>방문예약/문의</th>
			<th>제목</th>
			<th>아이디</th>
			<th>내용</th>
			<th>등록일자</th>
		</tr>
		<c:forEach var="QA" items="${QAlist}" > 
			<tr>
				<td>${QA.num}</td>
				<td>${QA.choose}</td>
				<td><a href="${path}/QA/detail?num=${QA.num}">${QA.subject}</a></td>
				<td>${QA.userid}</td>
				<td>${QA.content}</td>
				<td>${QA.regdate}</td>
			</tr>
		
		</c:forEach>
		
		
	</table>
        
        <%@include file="../footer.jsp" %> 
    </body>
</html>