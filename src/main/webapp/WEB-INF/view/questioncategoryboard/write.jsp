<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html><head><title>새 글 쓰기</title></head>
<body>
	<form:form commandName="questioncategorytbVO" method="POST">
		<table border="1">
			
			<tr>
				<th><form:label path="quecateCat">제목</form:label></th>
				<td><form:input path="quecateCat" /> 
				<form:errors path="quecateCat" /></td>
			</tr>
			
			
			<tr>
				<th><form:label path="quecatePass">비밀번호</form:label></th>
				<td><%-- <form:input path="password" /> --%>
				<form:password path="quecatePass" /> 
				<form:errors path="quecatePass" /></td>
			</tr>
		</table>
		<div>
		<input type="submit" value="등록"> 
			<a href="<c:url value="/questioncategoryboard/list" />">목록</a>
		</div>
	</form:form>
</body>
</html>
