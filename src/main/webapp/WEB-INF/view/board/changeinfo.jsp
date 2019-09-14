<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 변경</title>
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
          <form action="${pageContext.request.contextPath}/membertb/changeinfo" method="post" >
        <fieldset>
           <legend>회원정보 변경</legend>     
         PW  : <input type="password" name="memberpass" /> <br><br>
       	 이메일  : <input type="email" name="memberemail" /> <br><br>
       	 닉네임  : <input type="text" name="membernick" />  <br><br>  
               <input type="submit" value="회원정보 변경"> &nbsp;&nbsp;&nbsp;&nbsp;
               <input type="button" value="메인으로" onclick="location.href='${pageContext.request.contextPath}/membertb/danaom'"/>
        </fieldset>
        </form>
        </div>
      </div>
 
      <!-- 하단 -->
      <div id="footer">
        <p align="center">&copy; Copyright 2019 By son DANAOM</p>
      </div>
      
      
  </body>
</html>