<%@ page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<title>${questiontbVO.queTitle}&nbsp내용</title>
</head>
<body>
        <table border="1">
                <tr>
                        <th>제목</th>
                        <td>${questiontbVO.queTitle}</td>
                </tr>
                <tr>
                        <th>내용</th>
                        <td>${questiontbVO.queText}</td>
                </tr>
                <tr>
                        <th>작성자</th>
                        <td>${questiontbVO.queUser}</td>
                </tr>
                <tr>
                        <th>작성일</th>
                        <td>${questiontbVO.queRegDt}</td>
                </tr>
                 <tr>
                        <th>카테고리</th>
                        <td>${questiontbVO.queCategory}</td>
                </tr>
                <tr>
                        <th>조회수</th>
                        <td>${questiontbVO.queReadCnt}</td>
                </tr>
        </table>
        <div>
                <a href="<c:url value="/questionboard/edit/${questiontbVO.queNo}"/>">수정</a>
                <!-- 삭제 추가 -->
                <a href="<c:url value="/questionboard/delete/${questiontbVO.queNo}"/>">삭제</a> 
                <a href="<c:url value="/questionboard/list" />">목록</a>
        </div>
</body>
</html>
