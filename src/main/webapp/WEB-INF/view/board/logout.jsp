<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>    
<% session.invalidate(); %> <% //로그아웃과 동시에 세션 파괴! %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<script>
alert('로그아웃 되었습니다.');
</script>

<title>로그아웃</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="css/index.css">
    <link rel="stylesheet" href="css/login.css">
 
<!-- 링크 색상 없애기 -->
    <style type="text/css">
     a:link { color: black; text-decoration: none;}
     a:visited { color: black; text-decoration: none;}
     a:hover { color: black; text-decoration: underline;}
    </style>
</head>
<body>
<div id="loginer" align="center">
        <div id="form">
		<fieldset>
		<legend>로그아웃 완료!</legend> 성공적으로 로그아웃 되었습니다. <br><br>
<a href="<c:url value="/login" />"> 로그인 페이지로 이동    | </a>
<a href="<c:url value="/main" />"> 메인 페이지로 이동 </a>
</fieldset>
</div>
</div>
</body>
</html>