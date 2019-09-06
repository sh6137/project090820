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
<body>
<div class="center">
<table border="1">
	<tr><td colspan="3" align="center">좋아요 많은 게시물</td></tr>
	<tr align="center">
	 <c:forEach var="board" items="${boardList}" varStatus="loop">
		<td width="900" height="140"><img src="http://localhost:8080/${pageContext.request.contextPath}/resources/img/${board.proSystemThumbnail}" width="295" height="195"></td>
	</c:forEach> 
	</tr>
	<tr align="center">
	<c:forEach var="board" items="${boardList}" varStatus="loop">
		<td width="900" height="30">
		<a href="${pageContext.request.contextPath}/product/read?location=product&postNo=${board.proNo}"
		onclick="window.open(this.href, '_blank', 'width=1000, height=900, toolbars=no'); return false;">${board.proName}</a>
		</td>
	</c:forEach>
	</tr>
	<tr><td colspan="3" align="center">조회수 많은 게시물</td></tr>
	<tr align="center">
	 <c:forEach var="board2" items="${boardList2}" varStatus="loop">
		<td width="900" height="140"><img src="http://localhost:8080/${pageContext.request.contextPath}/resources/img/${board2.proSystemThumbnail}" width="295" height="195"></td>
	</c:forEach> 
	</tr>
	<tr align="center">
	<c:forEach var="board2" items="${boardList2}" varStatus="loop">
		<td width="900" height="30">
		<a href="${pageContext.request.contextPath}/product/read?location=product&postNo=${board2.proNo}"
		onclick="window.open(this.href, '_blank', 'width=1000, height=900, toolbars=no'); return false;">${board2.proName}</a>
		</td>
	</c:forEach>
	</tr>
</table>
</div>
<!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>
