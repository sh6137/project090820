<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>새 글 쓰기</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
 
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
 
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

</head>
<body>
	<div class="container"/>
	<table class="table table-bordered"/>
	<form:form commandName="noticetbVO" method="POST">
		<table border="2">
	<thead>
		<caption>새 글쓰기</caption>
	</thead>
	<tbody>
		<form action="list.jsp" method="post" encType="multiplart/form-data">
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
			<%-- <tr>
				<th><form:label path="noticePassword">비밀번호</form:label></th>
				<td>
				<form:password path="noticePassword" /> 
				<form:errors path="noticePassword" /></td>
			</tr> --%>
			<tr>
			<td colspan="2">
			<center>
			<input type="submit" value="등록" class="btn btn-warning"> 
			<a href="<c:url value="/noticeboard/list" />" class="btn btn-danger">목록</a></center>
			</td>
			</tr>
			</form>
			</tbody>
			</table>
		</div>
	</form:form>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.js"></script>
</body>
</html>
