<%@ page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>목록</title>
</head>
<script>

//이전 버튼 이벤트

function fn_prev(page, range, rangeSize) {
		var page = ((range - 2) * rangeSize) + 1;
		var range = range - 1;
		var url = "${pageContext.request.contextPath}/questionboard/list";
		url = url + "?page=" + page;
		url = url + "&range=" + range;
		location.href = url;
	}
  //페이지 번호 클릭
	function fn_pagination(page, range, rangeSize, searchType, keyword) {
		var url = "${pageContext.request.contextPath}/questionboard/list";
		url = url + "?page=" + page;
		url = url + "&range=" + range;
		location.href = url;	
	}
	//다음 버튼 이벤트
	function fn_next(page, range, rangeSize) {
		var page = parseInt((range * rangeSize)) + 1;
		var range = parseInt(range) + 1;
		var url = "${pageContext.request.contextPath}/questionboard/list";
		url = url + "?page=" + page;
		url = url + "&range=" + range;
		location.href = url;
	}
</script>
<body>
        <table border="5">
                <tr>
                        <th>NO</th>
                        <th>제목</th>
                        <th>작성자</th>
                        <th>카테고리</th>
                        <th>작성일</th>
                        <th>조회수</th>
                </tr>
                <c:forEach var="questiontb" items="${questiontbList}" varStatus="loop">
                        <tr>
                                <td>${questiontb.queNo}</td>
                                <td><a href="<c:url value="/questionboard/read/${questiontb.queNo}" />">
                                        ${questiontb.queTitle}</a></td>
                                <td>${questiontb.queUser}</td>
                                <td>${questiontb.queCategory}</td>
                                <td>${questiontb.queRegDt}</td>
                                <td>${questiontb.queReadCnt}</td>
                        </tr>
                </c:forEach>
        </table>
        <a href="<c:url value="/questionboard/write" />">새글</a>
        
        <!-- pagination{s} -->

	<div id="paginationBox">
		<ul class="pagination">
			<c:if test="${pagination.prev}">
				<li class="page-item"><a class="page-link" href="#" onClick="fn_prev('${pagination.page}', '${pagination.range}', '${pagination.rangeSize}')">Previous</a></li>
			</c:if>				
			<c:forEach begin="${pagination.startPage}" end="${pagination.endPage}" var="idx">
				<li class="page-item <c:out value="${pagination.page == idx ? 'active' : ''}"/> "><a class="page-link" href="#" onClick="fn_pagination('${idx}', '${pagination.range}', '${pagination.rangeSize}')"> ${idx} </a></li>
				
			</c:forEach>
				
			<c:if test="${pagination.next}">
				<li class="page-item"><a class="page-link" href="#" onClick="fn_next('${pagination.range}', 
				'${pagination.range}', '${pagination.rangeSize}')" >Next</a></li>
			</c:if>
			
			
		</ul>
	</div>
	
	<!-- pagination{e} -->
	
	<!--search{s} -->
	<form:form commandName="questiontbVO" method="POST">
	<form:select path="searchType">
		<form:option value="queTitle" label="제목" />
		<form:option value="queCategory" label="카테고리" />
		<form:option value="queUser" label="작성자" />
		<form:input path="keyword" /> 
	</form:select>
		<input type="submit" value="검색">
	<br>
	<br>
	
	</form:form>
	
	
	
	
	<!--search{e} -->
</body>
</html>
