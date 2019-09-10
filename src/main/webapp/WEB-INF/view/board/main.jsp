<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="UTF-8">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
   <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" >
    
   <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
    <title>Hello, Main!</title>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
	<script type="text/javascript">
		function main(){
			$.ajax({
				type : "GET",
				url : "${pageContext.request.contextPath}/board/main-p",
				dataType : "text",
				error : function(){
					alert("통신실패");
				},
				success : function(data){
					$("#center").html(data);
				}
			});
		}
		
		function list(){
			$.ajax({
				type : "GET",
				url : "${pageContext.request.contextPath}/board/list-p",
				dataType : "text",
				error : function(){
					alert("통신실패");
				},
				success : function(data){
					$("#center").html(data);
				}
			});
		}
		
		function notice(){
			var url = '${pageContext.request.contextPath}/noticeboard/list';
			$.ajax({
				type : "GET",
				url : url,
				dataType : "text",
				error : function(){
					alert("통신실패");
				},
				success : function(data){
					$("#center").html(data);
				}
			});
		}
		function question(){
			var url = '${pageContext.request.contextPath}/questionboard/list';
			$.ajax({
				type : "GET",
				url : url,
				dataType : "text",
				error : function(){
					alert("통신실패");
				},
				success : function(data){
					$("#center").html(data);
				}
			});
		}
		function productInsert(){
			var url = '${pageContext.request.contextPath}/board/write-p';
			$.ajax({
				type : "GET",
				url : url,
				dataType : "text",
				error : function(){
					alert("통신실패");
				},
				success : function(data){
					$("#center").html(data);
				}
			});
		}
		function replyList(){
			var url = '${pageContext.request.contextPath}/replyboard/list';
			$.ajax({
				type : "GET",
				url : url,
				dataType : "text",
				error : function(){
					alert("통신실패");
				},
				success : function(data){
					$("#center").html(data);
				}
			});
		}
	</script>
	<!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	<script>
	main();
	</script>
  </head>
<body>
<div class="top">
<div class="top-left">다나옴</div>
<div class="top-center">
<div class="top-center-south"><table><tr align="center"><td align="center"><img src="<c:url value="/resources/img/dada.png" />" width="900" height="120"></td></tr></table></div>
<div class="top-center-north" align="center">
	<input type="text" placeholder="검색어 입력"/>
	<button type="submit">검색</button></div>
</div>

<div class="top-right"><table>
<tr align="center">
<td width="120" height="100"><a class="btn btn-iight" href="#" role="button"><span style="font-size:13pt">최근 본 상품</span></a></td>
<td width="120" height="100"><a class="btn btn-iight" href="#" role="button"><span style="font-size:13pt">관심<br>상품 </span></a></td>
	<c:if test="${re == null || re == 0}">
		<td width="120" height="100"><a class="btn btn-iight" href="<c:url value="/membertb/login" />" role="button"><span style="font-size:13pt">로 그 인</span></a></td>
	</c:if>
	<c:if test="${re == 1}">
		<td width="120" height="100"><a class="btn btn-iight" href="<c:url value="/membertb/login" />" role="button"><span style="font-size:13pt">로 그 아 웃</span></a></td>
	</c:if>
</tr> 

</table></div>
</div>

<div class="top-middle">
<table align="center">
<tr>
	<td>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">다나옴</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavDropdown">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" onclick="main();">Main</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" onclick="notice();">공지사항</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" onclick="list();">제품 목록 게시판</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" onclick="productInsert();">제품 등록</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" onclick="question();">고객 요청/게시판</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="#">관심상품</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" onclick="replyList();">댓글 관리</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Dropdown link
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item" href="#">회원가입</a>
          <a class="dropdown-item" href="#">로그인</a>
          <a class="dropdown-item" href="#">아이디/패스워드 찾기</a>
        </div>
      </li>
    </ul>
  </div>
</nav>
</td>
</tr>
</table>
</div>

<div class="middle">
<div class="left">

<div class="sidebar-heading"></div>
<div class="list-group list-group-flush">
        <a href="#" class="list-group-item list-group-item-action bg-light">가전,TV,기타</a>
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
<div class="center" id="center">

</div>
<div class="right">
</div>
</div>

    
  </body>
</html>