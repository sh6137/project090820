<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${productVO.proName}</title>
<script src="https://code.jquery.com/jquery-3.0.0.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$.ajax({
			type : "GET",
			url : "${pageContext.request.contextPath}/product/reply?location=${location}&postNo=${postNo}",
			dataType : "text",
			error : function(){
				alert("통신실패");
			},
			success : function(data){
				$("#replyArea").html(data);
			}
		});
	});
</script>
</head>
<body>
조회수 : ${productVO.proReadCnt}     좋아요 : ${productVO.proLikeCnt}
<br>
<c:forEach var="sysFiles" items="${sysFiles}" varStatus="status">
	<img src="http://localhost:8080${pageContext.request.contextPath}/resources/img/${sysFiles}"><br>
	${files[status.index]}
	<br>
</c:forEach>
${productVO.proText}
<br>
<br>
<br>
<br>
	<div id="replyArea"></div>
</body>
</html>