<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>수정</title>
</head>
<body>
	<form:form commandName="noticetbVO" method="POST">
		<table border="1">
			<tr>
				<th><form:label path="noticeTitle">제목</form:label></th>
				<td><form:input path="noticeTitle" /> 
				<form:errors path="noticeTitle" /></td>
			</tr>
			<tr>
				<th><form:label path="noticeText">내용</form:label></th>
				<td><form:input path="noticeText" /> 
				<form:errors path="noticeText" />
				</td>
			</tr>
			<tr>
				<th><form:label path="noticeUser">작성자</form:label></th>
				<td><form:input path="noticeUser" /> 
				<form:errors path="noticeUser" />
				</td>
			</tr>
			
		</table>
		<div>
			<input type="submit" value="등록"> 
			<a href="<c:url value="/noticeboard/list" />">목록</a>
		</div>
	</form:form>
</body>
</html>
