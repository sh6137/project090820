<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<html>
<head>

<script>
function re(){
	if(${re}==0){
		alert("ID와 PW를 확인하세요!");
	}
}

</script>

<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="css/index.css">
	<link href="<c:url value="/resources/css/Main.css"/>">
<title>치면 다 나온다!다나옴 로그인</title>

<!-- 링크 색상 없애기 -->
    <style type="text/css">
     a:link { color: black; text-decoration: none;}
     a:visited { color: black; text-decoration: none;}
     a:hover { color: black; text-decoration: underline;}
    </style>
  </head>
  <body>
      <!-- 로그인 폼 CSS -->
      <div id="loginer" align="center">
        <div id="form">
          <form action="${pageContext.request.contextPath}/membertb/login" method="post" >
            <fieldset>
              <legend>로그인!</legend>
              <table><tr><td>
              	ID : </td><td><input type="text" name="memberid" placeholder="Enter Your Id" required/> </td></tr>
              <tr><td>
              	PW : </td><td><input type="password" name="memberpass" placeholder="Enter Your Password" required/></td></tr>
              </table>
              <button type="submit"> 로그인 </button> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <br>
           
              <a href="<c:url value="/membertb/reg" />">|  회원 가입 하러 가기 &nbsp; | </a>
              <a href="<c:url value="/membertb/main" />">메인으로</a>
            </fieldset>
          </form>
        </div>
      </div>
 
      <!-- 하단 -->
      <div id="footer">
        <p align="center">&copy; Copyright 2019 By son DANAOM</p>
      </div>
      <script> re(); </script>
  </body>
</html>
