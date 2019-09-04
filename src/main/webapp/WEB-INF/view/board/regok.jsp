<%@page import="java.sql.Timestamp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<html>
<head>
<meta charset="UTF-8">
<title>회원가입 완료!</title>
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
              <legend>회원등록완료</legend> 
              	    회원 가입이 완료 되었습니다. <br><br>
              <a href="<c:url value="/board/main" />">메인으로</a> &nbsp;&nbsp;&nbsp;&nbsp;
              <a href="<c:url value="/board/login" />">로그인하기</a>
		</fieldset>
</div>
</div>

<div id="footer">
        <p align="center">&copy; Copyright 2019 By son DANAOM</p>
      </div>
</body>
</html>