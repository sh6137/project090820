<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 성공!!</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>

<div id="loginer" align="center">
        <div id="form">
<fieldset>
           <legend>로그인 성공</legend>
	<p>로그인 되었습니다<br></p>
	<p> 반갑습니다. <br></p>

<a href="<c:url value='/danaom' />">메인으로</a>
</fieldset>
</div>
</div>
</body>
</html>