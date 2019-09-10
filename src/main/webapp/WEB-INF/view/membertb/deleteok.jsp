<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 탈퇴</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>

<div id="loginer" align="center">
        <div id="form">
<fieldset>
           <legend>계정삭제완료</legend>
	<p>회원정보가 삭제 되었습니다.<br></p>
	<p>이용해주셔서 감사합니다. <br></p>

<a href="<c:url value="/membertb/main" />">메인으로</a>
</fieldset>
</div>
</div>
</body>
</html>