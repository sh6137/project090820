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
	$('input[type="text"]').keydown(function() {
	  if (event.keyCode == 13) {
	    event.preventDefault();
	    send();
	  };
	});

	function send(){
		if(document.getElementsByName('reText')[0].value == ""){
			alert("내용을 입력하세요!");
			return false;
		}
		var formData = $("#form1").serialize();
		/* if(document.()) */
		$.ajax({
			type : "POST",
			url : "${pageContext.request.contextPath}/product/reply?location=${location}&postNo=${postNo}&pageNum=${pageList[pageList.size()-1]}",
			data : formData,
			dataType : "text",
			error : function(){
				alert("통신실패2");
			},
			success : function(data){
				$("#div1").html(data);
			}
		});
	}
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
					$("#div1").load("${pageContext.request.contextPath}/product/reply?location=${location}&postNo=${postNo}&pageNum=${pageList}");
				});
			});
		</script>
		<input type="button" id="pageMove${pageList}" value="${pageList}" style="background:gray">
	</c:when>
	<c:otherwise>
		<script type="text/javascript" charset="utf-8">
			$(document).ready(function(){
				$("#pageMove${pageList}").click(function(){
					$("#div1").load("${pageContext.request.contextPath}/product/reply?location=${location}&postNo=${postNo}&pageNum=${pageList}");
				});
			});
		</script>
		<input type="button" id="pageMove${pageList}" value="${pageList}">
	</c:otherwise>
	</c:choose> 
</c:forEach>
<form method="post" id="form1" onsubmit="return false">
	<input type="text" name="reText" size="50"/>
	<input type="button" value="댓글 등록" onclick="send();"/>
</form>
</div>
</body>
</html>