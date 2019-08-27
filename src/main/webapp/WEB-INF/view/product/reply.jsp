<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>reply</title>
</head>
<body>
<c:forEach var="replyVO" items="${replyList}">
	${replyVO.reNo} | ${replyVO.reUser} | ${replyVO.reText} | ${replyVO.reRegDt}
	<br>
</c:forEach>
</body>
</html>