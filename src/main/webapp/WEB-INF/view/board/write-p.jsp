<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="UTF-8">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
   <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" >
    
   <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
    <title>Hello, Main!</title>
  </head>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<div class="center">
<form action="<c:url value="/board/write-p"/>" method="POST" enctype="multipart/form-data">
<table border="1">
	<tr><td><h1>제품 등록</h1></td></tr>
	<tr><td>이름<input type="text" name="proName">
	<select name="proCate"><option>카테고리</option>
	<option value="menu1">카테고리</option>
	<option value="menu2">카테고리</option>
	<option value="menu3">카테고리</option></select></td></tr>
	<tr><td><textarea name="proText" rows="16" cols="125"></textarea></td></tr>
	
	<tr><td><input multiple="multiple" type="file" name="proMultipart"></td></tr>
	
	<tr><td><input type="submit" value="사진 등록">	
</table>
</form>
</div>
</body>
</html>