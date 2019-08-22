<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
$(function(){
	$("#btnWrite").click(function(){
		location.href="${path}/board/write.do";
	});
	</script>
</head>
<body>
<h2>게시판</h2>
<button type="button" id="btnWrite">글쓰기</button>
	<table border="1" width="600px">
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>이름</th>
		<th>날짜</th>
		<th>조회수</th>
	</tr>
	<c:forEach var="row" items="${map.list}">
	<tr>
		<td>${row.notice_no}</td>
		<td>${row.notice_title}</td>
		<td>${row.notice_user}</td>
		<td>${row.notice_reg_date}</td>
		<td>${row.notice_read_cnt}</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>