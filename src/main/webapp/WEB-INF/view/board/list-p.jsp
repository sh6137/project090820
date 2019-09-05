<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="UTF-8">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
   <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" >
    
   <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
    <title>Hello, Main!</title>
  </head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<script>

//이전 버튼 이벤트

function fn_prev(page, range, rangeSize) {
		var page = ((range - 2) * rangeSize) + 1;
		var range = range - 1;
		var url = "${pageContext.request.contextPath}/board/list-p";
		url = url + "?page=" + page;
		url = url + "&range=" + range;
		location.href = url;
	}
  //페이지 번호 클릭
	function fn_pagination(page, range, rangeSize, searchType, keyword) {
		var url = "${pageContext.request.contextPath}/board/list-p";
		url = url + "?page=" + page;
		url = url + "&range=" + range;
		location.href = url;	
	}
	//다음 버튼 이벤트
	function fn_next(page, range, rangeSize) {
		var page = parseInt((range * rangeSize)) + 1;
		var range = parseInt(range) + 1;
		var url = "${pageContext.request.contextPath}/board/list-p";
		url = url + "?page=" + page;
		url = url + "&range=" + range;
		location.href = url;
	}
</script>
<body>
<div class="center">
<table border="1">
	 <%-- <c:forEach var="board3" items="${boardList3}" varStatus="status"> --%>
	 <c:forEach var="board3" items="${boardList3}" varStatus="loop">
	<tr align="center">
		<td width="50" height="50">${board3.proNo}</td>
		<td width="120" height="50"><img src="http://localhost:8080/${pageContext.request.contextPath}/resources/img/${board3.proFileName}" width="100" height="50"></td>
		<td width="120" height="50">${board3.proName}</td>
		<td width="610" height="50">${board3.proText}</td>
		
		<!-- jstl줄바꿈 -->
	</tr>
	</c:forEach>	
	</table>
	 	        <!-- pagination{s} -->

	<div id="paginationBox">
		<ul class="pagination">
			<c:if test="${pagination.prev}">
				<li class="page-item"><a class="page-link" href="#" onClick="fn_prev('${pagination.page}', '${pagination.range}', '${pagination.rangeSize}')">Previous</a></li>
			</c:if>				
			<c:forEach begin="${pagination.startPage}" end="${pagination.endPage+1}" var="idx">
				<li class="page-item <c:out value="${pagination.page == idx ? 'active' : ''}"/> "><a class="page-link" href="#" onClick="fn_pagination('${idx}', '${pagination.range}', '${pagination.rangeSize}')"> ${idx} </a></li>
			</c:forEach>
				
			<c:if test="${pagination.next}">
				<li class="page-item"><a class="page-link" href="#" onClick="fn_next('${pagination.range}', 
				'${pagination.range}', '${pagination.rangeSize}')" >Next</a></li>
			</c:if>
		</ul>
	</div>

	<!-- pagination{e} -->
</div>
</body>
</html>