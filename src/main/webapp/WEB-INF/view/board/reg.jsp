<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>치면 다 나온다!다나옴 회원가입</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="css/index.css">
    <link rel="stylesheet" href="css/login.css">
    
<script> 
 function idCheck(id){
	if(id == ""){
		alert("ID를 입력해주세요");
		document.name.id.focus();
	}
	else{
		var popWidth = 300;
		var popHeight = 200;
		var winHeight = document.body.clientHeight;
		var winWidth = document.body.clientWidht;
		var winX = window.screenLeft;
		var winY = window.screenTop;
		var popX = winX + (winWidth - popWidth)/2;
		var popY = winY + (winHeight - popHeight)/2;
		var url = "${pageContext.request.contextPath}/membertb/idCheck?id=" + id;
		window.open(url, "post",
				"left="+popX+", top="+popY+", width="+popWidth + ", height="+popHeight);
	} 
 }
function nickCheck(nick){
	if(nick ==""){
		alert("닉네임을 입력해주세요");
		document.name.nick.focus();
	}
	
	else{
		var popWidth = 300;
		var popHeight = 200;
		var winHeight = document.body.clientHeight;
		var winWidth = document.body.clientWidht;
		var winX = window.screenLeft;
		var winY = window.screenTop;
		var popX = winX + (winWidth - popWidth)/2;
		var popY = winY + (winHeight - popHeight)/2;
		var url = "${pageContext.request.contextPath}/membertb/nickCheck?nick=" + nick;
		window.open(url, "post",
				"left="+popX+", top="+popY+", width="+popWidth + ", height="+popHeight);
		}
	}	
	
</script>
<!-- 링크 색상 없애기 -->
    <style type="text/css">
     a:link { color: black; text-decoration: none;}
     a:visited { color: black; text-decoration: none;}
     a:hover { color: black; text-decoration: underline;}
    </style>
 
</head>
<body>
<div id="loginer" align="center"> <div id="form">
<fieldset>
  <legend>약관동의</legend>

<div style="overflow:auto; width:1480px; height:180px;">											
제 1장 총칙<br>

제 1 조 (목 적)<br>
이 약관은 ㈜다나옴 (전자상거래 사업자)이 운영하는 인터넷 서비스 "다나옴" (www.danaom.com) 및 다나옴 관련 제반 서비스 사이트
(접속 가능한 유,무선 단말기의 종류와는 상관없이 이용 가능한 '회사' 가 제공하는 모든 "서비스" 를 의미하며, 이하 '사이트'라 함)에서 제공하는 상품 및 가격정보 등 
상품에 대한 정보 제공 및 광고서비스를 이용함에 있어 '회사' 와 이용자의 권리와 의무 및 책임사항 등을 규정함을 그 목적으로 합니다.
<br><br>
제 2 조 (정의)<br>
① '회사' 란 ㈜다나옴이 재화 또는 용역(이하 '상품'이라 함) 및 서비스를 이용자에게 제공하기 위하여 컴퓨터 등 정보통신설비를 이용하여 상품을 거래할 수 있도록 설정한 가상의 영업장을 말하며, 
아울러 '회사' 를 운영하는 사업자의 의미로도 사용합니다.<br>
② '서비스' 란 '회사' 와 계약을 통하여 입점 및 제휴한 쇼핑몰들의 상품 및 가격정보를 비교하여 회원의 구매를 돕는 서비스 및 기타 각종 서비스를 의미합니다 <br>
③ '이용자'란 '회사' 에 접속하여 이 약관에 따라 '회사' 가 제공하는 서비스를 받는 회원 및 비회원을 말합니다. <br>
④ '회원'이라 함은 '회사' 에 개인정보를 제공하여 회원등록을 한 자로서, '회사' 의 정보를 지속적으로 제공받으며, '회사' 가 제공하는 서비스를 계속적으로 이용할 수 있는 자를 말합니다. <br>
⑤ '비회원'이라 함은 회원에 가입하지 않고 '회사' 가 제공하는 서비스를 이용하는 자를 말합니다. <br>
⑥ '상품정보' 란 '회사' 가 보유한 웹 페이지 형태의 텍스트, 음성, 화상, 이미지 등의 각종 데이터를 지칭하며 보유 유형은 다음 각호와 같습니다.<br>
가. '회사' 가 자체 제작한 경우<br>
나. '회사' 가 계약 등을 통해 "업체회원" 이외의 업체로부터 확보한 경우<br>
다. '회사' 가 "업체회원" 으로부터 제공받은 경우<br>
⑦ '가격정보' 란 '회사' 가 이용자에게 고지하는 상품의 가격을 말합니다.<br><br>

제 3 조 (약관의 명시와 개정)<br>
① '회사' 는 이 약관의 내용과 상호 및 대표자의 성명, 영업소 소재지, 사업자등록번호, 통신판매업신고번호, 개인정보보호책임자, 연락처(전화, 팩스, 전자우편 주소 등) 등을 이용자가 쉽게 알 수 있도록 '회사' 의 초기 서비스화면(전면)에 게시합니다. 다만, 약관의 내용은 이용자가 연결화면을 통하여 볼 수 있도록 할 수 있습니다.<br>
② '회사' 는 이용자가 약관에 동의하기에 앞서 약관에 정하여져 있는 내용 중 구매취소ㆍ배송책임ㆍ환불조건 등과 같은 중요한 내용을 이용자가 이해할 수 있도록 별도의 연결화면 또는 팝업화면 등을 제공하여 이용자의 확인을 구하여야 합니다. <br>
③ '회사' 는 전자상거래 등에서의 소비자보호에 관한 법률, 약관의규제등에 관한 법률, 전자거래기본법, 전자서명법, 정보통신망 이용 촉진 및 정보보호등에 관한 법률, 방문판매등에 관한 법률, 소비자기본법 등 관련법을 위배하지 않는 범위에서 이 약관을 개정할 수 있습니다. <br>
④ '회사' 는 약관을 개정할 경우에는 적용일자 및 개정사유를 명시하여 현행 약관과 함께 '회사' 의 초기화면에 그 적용일자 15일 이전부터 적용일자 전일까지 공지합니다. 다만, 이용자에게 불리하게 약관 내용을 변경하는 경우에는 최소한 30일 이상의 사전 유예기간을 두고 공지합니다. 이 경우 '회사' 는 개정 전과 개정 후 내용을 명확하게 비교하여 이용자가 알기 쉽도록 표시합니다. <br>
⑤ '회사' 는 전자거래기본법, 전자서명법, 정보통신망 이용촉진 및 정보보호등에 관한 법률 등 관계법령을 위배하지 않는 범위에서 합리적 사유가 있는 경우 회원의 사전 동의 없이 본 약관을 개정할 수 있습니다. <br>
⑥ '회사' 는 개정된 약관의 공지 후 효력발생일 이전까지 거부 의사 표시 또는 탈퇴를 하지 않을 경우 개정 약관에 동의하는 것으로 간주합니다. 회원이 개정약관의 적용에 동의하지 않는 경우 '회사' 는 개정 약관의 내용을 적용할 수 없으며, 이 경우 '회사' 또는 회원은 이용계약을 해지할 수 있습니다.<br>
⑦ 이 약관에서 정하지 아니한 사항과 이 약관의 해석에 관하여는 전자상거래 등에서의 소비자보호에 관한 법률, 약관의 규제 등에 관한 법률, 공정거래위원회가 정하는 전자상거래 등에서의 소비자보호지침 및 관계 법령 또는 상관례에 따릅니다.<br><br>

제 2장 서비스의 제공<br>

제 4 조 (서비스의 제공 및 변경)<br>
① '회사' 는 다음과 같은 업무를 수행합니다. <br>
가. 재화 또는 용역(이하 상품이라 함)에 대한 정보 제공 및 구매계약의 체결
나. 구매계약이 체결된 상품의 배송
다. 게시판형 서비스
라. 기타 '회사' 가 정하는 업무
② '회사' 는 상품의 품절 또는 기술적 사양의 변경 등의 경우에는 장차 체결되는 계약에 의해 제공할 재화/용역의 내용을 변경할 수 있으며 해당 사항을 공지합니다.<br>
③ '회사' 가 제공하기로 한 이용자와 계약을 체결한 서비스의 내용을 상품의 품절 또는 기술적 사양의 변경 등의 사유로 변경할 경우에는 그 사유를 이용자에게 통지 가능한 주소로 통지합니다. 단, '회사' 에 입점한 판매점에서 제공하는 상품이 품절 또는 사양의 변경 등이 있을 경우 통지의 의무는 해당 판매점에게 있습니다. <br>
④ 전항의 경우 '회사' 는 이로 인하여 이용자가 입은 손해를 배상합니다. 단, '회사' 의 고의 또는 과실이 없음을 입증하는 경우에는 그러하지 아니합니다.<br><br>

제 5 조 (서비스의 중단)<br>
① '회사' 는 긴급한 시스템 점검, 증설 및 교체 등 부득이한 사유로 인하여 예고 없이 일시적으로 서비스를 중단할 수 있으며, 새로운 서비스의 교체 등 '회사' 가 적절하다고 판단하는 사유에 의하여 현재 제공되는 서비스를 완전히 중단할 수 있습니다.<br>
② 사업 종목의 전환, 사업의 포기, 업체간의 통합 등의 이유로 서비스를 제공할 수 없게 되는 경우에는 '회사' 는 제8조에 정한 방법으로 이용자에게 통지합니다.<br>
③ '회사' 는 서비스를 특정 범위로 분할하여 각 범위 별로 이용가능 시간을 별도로 지정할 수 있습니다. 다만 이 경우 그 내용을 공지합니다.<br><br>

제 3장 회원의 가입 및 탈퇴<br>

제 6조 (회원가입)<br>
① 이용자는 '회사' 가 정한 가입 양식에 따라 회원정보를 기입한 후 이 약관에 동의한다는 의사표시를 함으로서 회원가입을 신청합니다. <br>
②'회사' 는 제1항과 같이 회원으로 가입할 것을 신청한 이용자 중 다음 각 호에 해당하지 않는 한 회원으로 등록합니다.<br>
가. 만 14세 미만인 자<br>
나. 회원가입 신청자가 과거 회원 자격을 상실한 적이 있는 경우('회사' 로부터 회원자격의 제재조치를 받고 임의탈퇴 또는 강제탈퇴 한 경우를 포함)<br>
다. 회원 가입 시 기재한 내용에 허위, 누락, 오기가 있는 경우<br>
라. 기타 회원으로 가입하는 것이 '회사' 가 제공하는 서비스에 현저한 지장이 있다고 판단되는 경우<br>
③회원가입의 성립시기는 '회사' 의 이용 승낙의 의사가 해당 서비스화면에 게시하거나, email 또는 기타 '회사' 가 정하는 방법으로 이용자에게 도달한 시점으로 합니다.<br>
④회원은 제16조 제1항에 의한 등록사항에 변경이 있는 경우, 즉시 전자우편 또는 기타 방법으로 '회사' 에 그 변경사항을 알려야 합니다.<br>
⑤회원이 이용계약 종료(해지 포함) 후 재가입하는 경우에는 최종 탈퇴 시의 아이디를 재사용할 수 없으며, 30일 이후 새로운 아이디로 재가입이 가능합니다.<br><br>

제 7 조 (회원탈퇴 및 자격상실)<br>
① 회원은 '회사' 에 언제든지 탈퇴를 요청할 수 있으며 '회사' 는 즉시 회원탈퇴를 처리합니다. <br>
② 회원이 다음 각 호의 사유에 해당하는 경우, '회사' 는 회원 자격을 제한 및 정지시킬 수 있습니다.
가. 가입 신청 및 회원정보 변경 시 허위 내용을 등록한 경우<br>
나.'회원' 의 행위로 인하여 '회사' 의 신용도 및 대외적 이미지가 저해된 경우
다. 타인의 '회사' 이용을 방해하거나 타인의 정보를 도용하는 등 전자거래질서를 위협하는 경우 <br>
라. '회사' 의 운영진, 임직원 또는 관계자를 사칭하는 경우
마. '회사' 의 서비스 운영에 고의 또는 과실로 불이익을 주거나 방해를 하는 경우<br>
바. 타인의 명예를 훼손하거나 모욕하는 경우<br>
사. 법령 또는 이 약관에서 금지하거나 공서양속에 반하는 행위를 하는 경우<br>
③ 회원은 전 항의 귀책사유로 인하여 '회사' 나 다른 회원 및 이용자에게 입힌 손해를 배상할 민사상의 책임이 있으며, 범죄 행위에 대해서는 형사 상의 책임을 부담합니다.<br>
④ '회사' 는 회원 자격을 제한/정지 시킨 후, 동일한 행위가 반복되거나 상당기간 그 사유가 시정되지 아니하는 경우 '회사' 는 회원자격을 상실 시킬 수 있습니다.<br>
⑤ '회사' 는 회원의 자격을 상실 시키는 경우에는 회원등록을 말소합니다. 이 경우 회원에게 이를 통지하고, 회원등록 말소 전에 최소한 30일 이상의 기간을 정하여 소명할 기회를 부여합니다.<br><br>

제 8 조 (회원에 대한 통지)<br>
① '회사' 는 회원에 대한 통지를 하는 경우, 회원이 '회사' 와 미리 약정하여 지정한 전자우편 주소를 원칙으로 하며 전화, 팩스 등 유, 무선 연락처로도 통지할 수 있습니다.<br>
② '회사' 는 불특정다수 회원에 대한 통지의 경우 1주일 이상 '회사' 게시판에 게시함으로써 개별 통지에 갈음할 수 있습니다. 다만, 회원 본인의 거래와 관련하여 중대한 영향을 미치는 사항에 대하여는 개별 통지합니다.<br>
③ '회원' 이 '회사' 에 통지하는 경우에는 고객센터 페이지 상에 게재된 절차와 내용에 따라야 합니다. '회사' 는 '회원' 이 이러한 통지 절차 또는 내용을 준수하지 않는 경우 통지를 수령하지 아니하며, 이로 인하여 발생하는 모든 문제에 대한 책임은 '회원' 이 부담하여야 합니다. <br><br>

제 9 조 (대리행위 및 보증인의 부인)<br>
① '회사' 는 구매자와 판매자 간의 자유로운 상품의 거래를 위한 시스템을 운영 및 관리, 제공할 뿐이므로 구매자 또는 판매자를 대리하지 않으며, 이용자 사이에 성립된 거래에 관련된 책임과 회원이 제공한 정보에 대한 책임은 해당 이용자가 직접 부담하여야 합니다.<br>
② '회사' 를 이루어지는 구매자와 판매자 간의 거래와 관련하여 판매 의사 또는 구매 의사의 존부 및 진정성, 등록 상품의 품질, 완전성, 안정성, 적법성 및 타인의 권리에 대한 비침해성, 구매자 또는 판매자가 입력하는 정보 및 그 정보를 통하여 링크된 URL에 게재된 자료의 진실성 또는 적법성 등 일체에 대하여 보증하지 아니하며, 
이와 관련한 일체의 위험과 책임은 해당 이용자가 전적으로 부담합니다.<br><br>

본 개정약관은 2019년 9월 7일부터 시행합니다.	
</div>										
</fieldset>

</div>
</div>
          <form action="${pageContext.request.contextPath}/membertb/reg" name="name" method="post" >
<div class="checkbox_wrap">
<!-- 웹접근성을 위해 input의 id값과 label의 for값을 동일하게 해주세요.-->
<!-- 1702 라벨 클릭 시 클래스 on 추가  -->
<label title="다나옴 회원가입 약관에 모두 동의합니다.필수 체크 항목"><strong>다나옴 회원가입 약관에 동의합니다.</strong></label>
<!--1702 웹접근성 포커스 (Tab키) 이동 시 클래스 focus 추가 탭키 이동 관련 개발 필요 -->
<input type="checkbox" id="agree" name="checkbox" title="다나옴 회원가입 약관에 모두 동의합니다.필수 체크 항목" required/>
</div>
      <!-- 로그인 폼 CSS -->
      <div id="loginer" align="center">
        <div id="form">
        	<!-- 요청경로의 mapping이 잘 되있어야 함! 매우 중요! -->
            <fieldset>
              <legend>회원 가입</legend> <!-- 이름 , id, password, password1, email, address,   -->
              <table>
			  <tr><td>
   	 &nbsp;&nbsp;&nbsp;ID : </td><td><input type="text" name="memberid" placeholder="Id" required/> <input type="button" value="중복확인" onClick="idCheck(this.form.memberid.value) "/></td></tr> 
              <tr><td>
     &nbsp;&nbsp;&nbsp;PW : </td><td><input type="password" name="memberpass" placeholder="Password" required/></td></tr> 
              <tr><td>
      &nbsp;&nbsp;&nbsp;닉네임 : </td><td><input type="text" name="membernick" placeholder="Nickname" required/> <input type="button" value="중복확인" onClick="nickCheck(this.form.membernick.value) "/></td></tr> 
              <tr><td>
      &nbsp;&nbsp;&nbsp;이메일 : </td><td><input type="email" name="memberemail" placeholder="Email" required/></td></tr>
              </table>
             
              <table>             
              <tr><td>
               &nbsp;&nbsp;&nbsp; 성별 : 
               <input type="radio" name="membergender" value="남자" required/>   남자 
               <input type="radio" name="membergender" value="여자" required/>   여자
              </td></tr> 
              <tr><td>
               &nbsp;&nbsp;&nbsp;  생년월일 : <input type="password" name="memberbirth" placeholder="8자리연속입력" required/>
              </td></tr>
              <tr><td>
               &nbsp;&nbsp;&nbsp;운영자여부 : <input type="radio" name="memberadmin" value=0 required/>    운영자
              <input type="radio" name="memberadmin" value=1 required/>	회원
              </td></tr> 
             </table>
             
              <table>
              <tr><td>
              <button type="submit">회원 가입</button> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <button type="reset">다시 입력</button>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <input type="button" value="메인으로" onclick="location.href='${pageContext.request.contextPath}/membertb/main'"/>
              </td></tr>
              </table>
              
            </fieldset>
        </div>
      </div>
          </form>
 
      <!-- 하단 -->
      <div id="footer">
        <p align="center">&copy; Copyright 2019 By son DANAOM</p>
      </div>
  </body>
</html>