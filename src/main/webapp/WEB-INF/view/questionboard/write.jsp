<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html><head><title>새 글 쓰기</title></head>
<body>
	<form:form commandName="questiontbVO" method="POST">
		<table border="1">
			
			<tr>
				<th><form:label path="queTitle">제목</form:label></th>
				<td><form:input path="queTitle" /> 
				<form:errors path="queTitle" /></td>
			</tr>
			<tr>
				<th><form:label path="queText">내용</form:label></th>
				<td><form:input path="queText" /> 
				<form:errors path="queText" />
				</td>
			</tr>
			<tr>
				<th><form:label path="queUser">작성자</form:label></th>
				<td><form:input path="queUser" /> 
				<form:errors path="queUser" />
				</td>
			</tr>
			<tr>
			
				<th><form:label path="queCategory">카테고리</form:label></th>
				<td>
				<form:select path="queCategory">--선택--
				<c:forEach var="questioncategorytb" items="${questioncategorytbList}" varStatus="loop">
                        <form:option value="${questioncategorytb.quecateCat}">
                        ${questioncategorytb.quecateCat}</form:option>
                              
                </c:forEach>
				</form:select>
				<form:errors path="queCategory" />
				
				</td>
			
			</tr>
			
			
		</table>
		<div>
		<input type="submit" value="등록"> 
			<a href="<c:url value="/questionboard/list" />">목록</a>
		</div>
	</form:form>
</body>
</html>
