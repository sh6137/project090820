<%@ page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>ADMIN-댓글관리</title>
</head>
<script>

//이전 버튼 이벤트

function fn_prev(page, range, rangeSize) {
		var page = ((range - 2) * rangeSize) + 1;
		var range = range - 1;
		var url = "${pageContext.request.contextPath}/replyboard/list";
		url = url + "?page=" + page;
		url = url + "&range=" + range;
		location.href = url;
	}
  //페이지 번호 클릭
	function fn_pagination(page, range, rangeSize, searchType, keyword) {
		var url = "${pageContext.request.contextPath}/replyboard/list";
		url = url + "?page=" + page;
		url = url + "&range=" + range;
		location.href = url;	
	}
	//다음 버튼 이벤트
	function fn_next(page, range, rangeSize) {
		var page = parseInt((range * rangeSize)) + 1;
		var range = parseInt(range) + 1;
		var url = "${pageContext.request.contextPath}/replyboard/list";
		url = url + "?page=" + page;
		url = url + "&range=" + range;
		location.href = url;
	}
	
	$("btnDelete").click(function(){
		if(confirm("삭제하시겠습니까?")){
			$.ajax({
				type: "delete",
				url: "${path}/replyboard/delete/${replyVO.reNo}",
				success: function(result){
					if(result == "success"){
						alert("삭제되었습니다.");
					}
				}
			});
		}
	});
</script>
<body>

	<h1>ADMIN - 댓글관리 게시판</h1>
        <table border="1">
                <tr>
                        <th>NO</th>
                        <th>게시판위치</th>
                        <th>게시물번호</th>
                        <th>회원번호</th>
                        <th>닉네임</th>
                        <th>내용</th>
                        <th>등록일</th>
                        <th>삭제</th>
                </tr>
                <c:forEach var="replytb" items="${replytbList}" varStatus="loop">
                        <tr>
                                <td>${replytb.reNo}</td>
                                <td>${replytb.reLocation}</td>
                                <td>${replytb.rePostNo}</td>
                                <td>${replytb.reUserNo}</td>
                                <td>${replytb.reUser}</td>
                                <td>${replytb.reText}</td>
                                <td>${replytb.reRegDt}</td>
                               	<td><button type="button" id="btnDelete">삭제</button></td>
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
	
</body>
</html>
