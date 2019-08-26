<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>치면 다 나온다!다나옴 회원가입</title>
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
      <!-- 로그인 폼 CSS -->
      <div id="loginer" align="center">
        <div id="form">
          <form action="<c:url value='/reg' />" method="post" >
            <fieldset>
              <legend>회원 가입</legend> <!-- 이름 , id, password, password1, email, address,   -->
              <table>
			  <tr><td>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;아이디 : </td><td><input type="text" name="member_id" placeholder="Id" required/>  
              <input type="button" value="중복확인" onClick="idCheck(this.form.member_id.value)"/>
              <tr><td>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;비밀번호 : </td><td><input type="password" name="member_pass" placeholder="Password" required/></td></tr> 
              <tr><td>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;닉네임 : </td><td><input type="text" name="member_nick" placeholder="Nickname" required/></td></tr> 
              <tr><td>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;이메일 : </td><td><input type="text" name="member_email" placeholder="Email" required/></td></tr>
              </table>
             
              <table>             
              <tr><td>
                                성별 : 
               <input type="radio" name="member_gender" value="남자" required/>   남자 
               <input type="radio" name="member_gender" value="여자" required/>   여자
              </td></tr> 
              <tr><td>
                                생년월일 : <input type="password" name="member_birth" placeholder="8자리연속입력" required/>
              </td></tr>
              <tr><td>
                                운영자여부 : <input type="radio" name="member_admin" value=0 required/>    운영자
                      <input type="radio" name="member_admin" value=1 required/>	회원
              </td></tr> 
             </table>
             
              <table>
              <tr><td>
              <button type="submit">회원 가입</button> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <button type="reset">다시 입력</button>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <button type="button" onClick="<c:url value='/main' />"> 메인으로</button>
              </td></tr>
              
              </table>
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