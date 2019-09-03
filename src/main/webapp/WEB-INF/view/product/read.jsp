<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
test
	<div id="replyArea"></div>
test
</body>
</html>