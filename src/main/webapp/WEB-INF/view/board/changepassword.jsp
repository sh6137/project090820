<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 변경</title>
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
          <form action="${pageContext.request.contextPath}/board/changepassword" method="post" >
           <fieldset>
           <legend>비밀번호 변경</legend>
                비밀번호를 변경하시겠습니까?<br><br>
                비밀번호  : <input type="password" name="memberpass" />
                <input type="submit" value="비밀번호 변경"> <br><br>
               <a href="<c:url value='/danaom' />">메인으로</a>
        </form>
        </fieldset>
        </div>
      </div>
 
      <!-- 하단 -->
      <div id="footer">
        <p align="center">&copy; Copyright 2019 By son DANAOM</p>
      </div>
      
      
  </body>
</html>