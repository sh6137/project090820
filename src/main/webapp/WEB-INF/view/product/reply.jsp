<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>reply</title>
<script src="https://code.jquery.com/jquery-3.0.0.min.js"></script>
<script type="text/javascript" charset="utf-8">
	$(document).ready(function(){
		$("form").on("submit", function(event){
			event.preventDefault();
			$("#div1").load("${pageContext.request.contextPath}/product/read?location=${location}&postNo=${postNo}&pageNum=${pageList[pageList.size()-1]}");
		})
	});
</script>
</head>
<body>

<div id="div1">
<c:forEach var="replyVO" items="${replyList}">
	${replyVO.reNo} | ${replyVO.reUser} | ${replyVO.reText} | ${replyVO.reRegDt}
	<br>
</c:forEach>
<c:forEach var="pageList" items="${pageList}">
	<c:choose>
	<c:when test="${pageList eq currentPage}">
		<script type="text/javascript" charset="utf-8">
			$(document).ready(function(){
				$("#pageMove${pageList}").click(function(){
					$("#div1").load("${pageContext.request.contextPath}/product/read?location=${location}&postNo=${postNo}&pageNum=${pageList}");
				});
			});
		</script>
		<input type="button" id="pageMove${pageList}" value="${pageList}" style="background:gray">
	</c:when>
	<c:otherwise>
		<script type="text/javascript" charset="utf-8">
			$(document).ready(function(){
				$("#pageMove${pageList}").click(function(){
					$("#div1").load("${pageContext.request.contextPath}/product/read?location=${location}&postNo=${postNo}&pageNum=${pageList}");
				});
			});
		</script>
		<input type="button" id="pageMove${pageList}" value="${pageList}">
	</c:otherwise>
	</c:choose> 
</c:forEach>
<form method="post">
	<input type="text" name="reText" size="50">
	<input type="submit" value="댓글 등록"/>
</form>
</div>
${pageList[pageList.size()-1]}
</body>
</html>