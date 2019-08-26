<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원탈퇴</title>
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
          <form action="<c:url value='/delete' />" method="post">
            <fieldset>
              <legend>회원 탈퇴</legend> 
             
              	패스워드 : <input type="password" name="memberpass" placeholder="Enter Your Password" required/>
             &nbsp;&nbsp; 
      		<button type="submit"> 회원탈퇴 </button> 
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