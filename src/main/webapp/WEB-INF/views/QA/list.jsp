<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/include.jsp" %>     
<!DOCTYPE html>
<html>

<head>
<title>방문상담예약 및 문의</title>


</head>
<body>
    
    <!-- menu파일불러오기 -->
	<%@include file="../menu.jsp" %>
	
	
   <h2>방문예약 및 문의</h2>

	<table border="1">
		<tr>
			<th>번호</th>
			<th>방문예약/문의</th>
			<th>제목</th>
			<th>아이디</th>
			<th>등록일자</th>
		</tr>
		<c:forEach var="QA" items="${QAlist}" varStatus="status" > 
			<tr>
				<td>${QA.qnum}</td>
				<td>${QA.qchoose}</td>
				<td><a href="${path}/QA/detail?qnum=${QA.qnum}">${QA.qsubject}</a></td>
				<td>${QA.userid}</td>
				<td>${QA.regdate}</td>
			</tr>
		
		</c:forEach>		
	</table>
	
	<input type="button" value="글작성" onclick="location.href='${path}/QA/add'">
        
        <%@include file="../footer.jsp" %> 
    </body>
</html>