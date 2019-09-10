<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html><head><title>새 글 쓰기</title></head>
<body>
	<form:form commandName="requesttbVO" method="POST">
		<table border="1">
			<tr>
				<th><form:label path="reqTitle">제목</form:label></th>
				<td><form:input path="reqTitle" /> 
				<form:errors path="reqTitle" /></td>
			</tr>
			<tr>
				<th><form:label path="reqText">내용</form:label></th>
				<td><form:input path="reqText" /> 
				<form:errors path="reqText" />
				</td>
			</tr>
			<tr>
				<th><form:label path="reqUser">작성자</form:label></th>
				<td><form:input path="reqUser" /> 
				<form:errors path="reqUser" />
				</td>
			</tr>
			
		</table>
		<div>
		<input type="submit" value="등록"> 
			<a href="<c:url value="/requestboard/list" />">목록</a>
		</div>
	</form:form>
</body>
</html>
