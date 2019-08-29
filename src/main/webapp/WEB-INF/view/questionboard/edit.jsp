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
				<%-- <form:input path="queCategory" />  --%>
				<form:select path="queCategory">--선택--
				<c:forEach var="questioncategorytb" items="${questioncategorytbList}" varStatus="loop">
                        <form:option value="${questioncategorytb.quecateCat}">
                        ${questioncategorytb.quecateCat}</form:option>
                              
                </c:forEach>
				</form:select>
				<form:errors path="queCategory" />
				</td>
			</tr>
			
			
			<tr>
				<th><label for="quePassword">비밀번호</label></th>
				<td><input type="quePassword" id="pwd" name="pwd" />${msg}</td>
<%-- 
다음 주석에 있는 것과 같이 기존 write와 동일하게 사용하면 
데이터베이스에 저장되어 있는 비밀번호가 그냥 보이게 된다. --%>
<%--	<th><form:label path="password">비밀번호</form:label></th>
        <td>
                <form:input path="password"/>
                <form:errors path="password"/>
        </td>
--%>
			</tr>
		</table>
		<div>
			<input type="submit" value="등록"> <a
				href="<c:url value="/questionboard/list" />">목록</a>
		</div>
	</form:form>
</body>
</html>
