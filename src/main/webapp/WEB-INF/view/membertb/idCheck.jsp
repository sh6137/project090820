<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/index.css">
<link href="<c:url value="/resources/css/Main.css"/>">

<style type="text/css">
     a:link { color: black; text-decoration: none;}
     a:visited { color: black; text-decoration: none;}
     a:hover { color: black; text-decoration: underline;}
</style>

<title>ID 중복체크</title>
</head>
<body>
<div id="loginer" align="center">
<div id="form">
<fieldset>
<legend>ID중복확인</legend>
<b>${id}</b>
<c:choose>
	<c:when test="${check == 0}">는 이미 존재하는 ID입니다.</c:when>
	<c:otherwise>는 사용가능합니다.<br></c:otherwise>
</c:choose>
	<a href="#" onclick="javascript:self.close()">닫기</a>
</fieldset>
</div>
<div id="footer">
        <p align="center">&copy; Copyright 2019 By son DANAOM</p>
</div>
</div>
</body>
</html>