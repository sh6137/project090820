<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
    
<html lang="UTF-8">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
   <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" >
    
   <link href="<c:url value="/resources/css/Main.css"/>" rel="stylesheet">
    <title>Hello, Main!</title>
  </head>
<body>

<div class="top">
<div class="top-left">다나옴</div>
<div class="top-center">
<div class="top-center-south"><table><tr align="center"><td align="center"><img src="<c:url value="/resources/1.png"/>" width="900" height="120"></td></tr></table></div>
<div class="top-center-north" align="center">
	<input type="text" placeholder="검색어 입력"/>
	<button type="submit">검색</button></div>
</div>

<div class="top-right"><table>
<tr align="center">
<td width="120" height="100"><a class="btn btn-iight" href="#" role="button"><span style="font-size:13pt">최근 본 상품</span></a></td>
<td width="120" height="100"><a class="btn btn-iight" href="#" role="button"><span style="font-size:13pt">관심<br>상품 </span></a></td>
<td width="120" height="100"><a class="btn btn-iight" href="login/logout.jsp" role="button"><span style="font-size:13pt">로 그 아 웃</span></a></td>
</tr> 

</table></div>
</div>

<div class="top-middle">
<table align="center">
<tr>
	<td>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="Danaom.jsp">다나옴</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavDropdown">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="Danaom.jsp">Main</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">제품 목록 게시판</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="#">제품 등록/삭제/수정</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="#">고객 요청/게시판</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="#">관심상품</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Dropdown link
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item" href="login/logout.jsp">로그아웃</a>
          <a class="dropdown-item" href="login/IdPassword.jsp">아이디/패스워드 찾기</a>
          <a class="dropdown-item" href="<c:url value='/delete' />">회원탈퇴</a>
        </div>
      </li>
    </ul>
  </div>
</nav>
</td>
</tr>
</table>

<div class="middle">
<div class="left">

<div class="sidebar-heading"></div>
<div class="list-group list-group-flush">
        <a href="Main2.jsp" class="list-group-item list-group-item-action bg-light">가전,TV,기타</a>
        <a href="#" class="list-group-item list-group-item-action bg-light">컴퓨터,노트북,조립PC</a>
        <a href="#" class="list-group-item list-group-item-action bg-light">태블릿,모바일</a>
        <a href="#" class="list-group-item list-group-item-action bg-light">아웃도어,스포츠,골프</a>
        <a href="#" class="list-group-item list-group-item-action bg-light">자동차,용품,공구</a>
        <a href="#" class="list-group-item list-group-item-action bg-light">가구,침구,LED</a>
        <a href="#" class="list-group-item list-group-item-action bg-light">유아,완구,식품</a>
        <a href="#" class="list-group-item list-group-item-action bg-light">생활,주방,건강</a>
        <a href="#" class="list-group-item list-group-item-action bg-light">패션,잡화,화장품</a>
        <a href="#" class="list-group-item list-group-item-action bg-light">사무,취미,게임</a>
      </div>
</div>
<div class="center">center</div>
<div class="right">

<section class="main_partner_v2" id="main_brandAd" data-log-actionid-area="main_partner" data-log-actionid-label="btn" data-is-ab-send="5">
	<ul id="main_ul_main_brandAd_0"> 
	<h4>쇼핑하러 바로가기</h4>
	<table>
	<tr><td>
	
	<a href="<c:url value='https://www.shinsegae.com' />" data-log-index="1">
	<img src="resources/1.jpg" alt="신세계백화점" width="270" height="50"></a>
	</td></tr>
	
	<tr><td>
	<a href="<c:url value='https://www.lotteshopping.com' />" onclick="doCommonStat('MAINMB130101');"  data-log-index="2">	
	<img src="resources/2.jpg" alt="롯데백화점" width="270" height="50"></a>
	</td></tr>
	
	<tr><td>
	<a href="<c:url value='https://www.thehyundai.com' />" onclick="doCommonStat('MAINMB130101');"  data-log-index="3">	
	<img src="resources/3.jpg" alt="현대백화점" width="270" height="50"></a>
	</td></tr>
	
	<tr><td>
	<a href="<c:url value='http://www.galleria.co.kr' />" onclick="doCommonStat('MAINMB130101');" data-log-index="4">	
	<img src="resources/5.jpg" alt="갤러리아" width="270" height="50"></a>
	</td></tr>
	
	<tr><td>
	<a href="<c:url value='http://www.debec.co.kr' />" onclick="doCommonStat('MAINMB130101');" data-log-index="5">	
	<img src="resources/6.jpg" alt="대구백화점" width="270" height="50"></a>
	</td></tr>
	
	<tr><td>
	<a href="<c:url value='https://with.gsshop.com' />" onclick="doCommonStat('MAINMB130101');" data-log-index="6">	
	<img src="resources/8.jpg" alt="GS홈쇼핑" width="270" height="50"></a>
	</td></tr>
	
	<tr><td>
	<a href="<c:url value='http://display.cjmall.com' />" onclick="doCommonStat('MAINMB130101');" data-log-index="7">	
	<img src="resources/10.jpg" alt="CJ몰" width="270" height="50"></a>
	</td></tr>
	
	<tr><td>
	<a href="<c:url value='http://www.lotteimall.com' />" onclick="doCommonStat('MAINMB130101');" data-log-index="8">	
	<img src="resources/12.jpg" alt="롯데홈쇼핑" width="270" height="50"></a>
	</td></tr>
	
	<tr><td>
	<a href="<c:url value='http://www.nike.com' />" onclick="doCommonStat('MAINMB130101');" data-log-index="9">	
	<img src="resources/14.jpg" alt="나이키" width="270" height="50"></a>
	</td></tr>
	</table>
	</ul>
</section>

</div>
</div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  </body>
</html>