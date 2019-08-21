<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>제품 등록 폼</title>
</head>
<body>
	<form:form commandName="productVO" method="POST"
		enctype="multipart/form-data">
		<table border="1">
			<tr>
				<th><form:label path="proName">제품명</form:label></th>
				<td><form:input path="proName" /> <form:errors path="proName" /></td>
			</tr>
			<tr>
				<th><form:label path="proText">내용</form:label></th>
				<td><form:input path="proText" /> <form:errors path="proText" />
				</td>
			</tr>
			<tr>
				<th><form:label path="proThumbnail">썸네일 업로드</form:label></th>
				<td><form:input type="file" path="proThumbnail" /> <form:errors
						path="proThumbnail" /></td>
			</tr>
						<tr>
				<th><form:label path="proFileName">파일 업로드</form:label></th>
				<td><form:input type="file" path="proFileName" /> <form:errors
						path="proFileName" /></td>
			</tr>
		</table>
		<div>
			<input type="submit" value="등록"> <a
				href="<c:url value="/board/list" />">목록</a>
		</div>
	</form:form>
</body>
</html>
