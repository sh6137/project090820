<%@ page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<title>${requesttbVO.reqTitle}&nbsp내용</title>
</head>
<body>
        <table border="1">
                <tr>
                        <th>제목</th>
                        <td>${requesttbVO.reqTitle}</td>
                </tr>
                <tr>
                        <th>내용</th>
                        <td>${requesttbVO.reqText}</td>
                </tr>
                <tr>
                        <th>작성자</th>
                        <td>${requesttbVO.reqUser}</td>
                </tr>
                <tr>
                        <th>작성일</th>
                        <td>${requesttbVO.reqRegDt}</td>
                </tr>
              
                <tr>
                        <th>조회수</th>
                        <td>${requesttbVO.reqReadCnt}</td>
                </tr>
        </table>
        <div>
                <a href="<c:url value="/requestboard/edit/${requesttbVO.reqNo}"/>">수정</a>
                <!-- 삭제 추가 -->
                <a href="<c:url value="/requestboard/delete/${requesttbVO.reqNo}"/>">삭제</a> 
                <a href="<c:url value="/requestboard/list" />">목록</a>
        </div>
</body>
</html>
