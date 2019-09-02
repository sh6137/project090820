<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html><head><title>새 글 쓰기</title></head>
<body>
	<form:form commandName="categorytbVO" method="POST">
		<table border="1">
			
			<tr>
				<th><form:label path="cateName">카테고리이름</form:label></th>
				<td><form:input path="cateName" /> 
				<form:errors path="cateName" /></td>
			</tr>
			
			<tr>
				<th><form:label path="catesubCate">하위카테고리</form:label></th>
				<td><form:input path="catesubCate" /> 
				<form:errors path="catesubCate" /></td>
			</tr>
			
			
			
		</table>
		<div>
		<input type="submit" value="등록"> 
			<a href="<c:url value="/categoryboard/list" />">목록</a>
		</div>
	</form:form>
</body>
</html>
