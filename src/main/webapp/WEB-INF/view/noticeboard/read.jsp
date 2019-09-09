<%@ page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<title>${noticetbVO.noticeTitle}&nbsp내용</title>
</head>
<body>
        <table border="1">
                <tr>
                        <th>제목</th>
                        <td>${noticetbVO.noticeTitle}</td>
                </tr>
                <tr>
                        <th>내용</th>
                        <td>${noticetbVO.noticeText}</td>
                </tr>
                <tr>
                        <th>작성자</th>
                        <td>${noticetbVO.noticeUser}</td>
                </tr>
                <tr>
                        <th>작성일</th>
                        <td>${noticetbVO.noticeRegDt}</td>
                </tr>
                <tr>
                        <th>조회수</th>
                        <td>${noticetbVO.noticeReadCnt}</td>
                </tr>
        </table>
        <div>
                <a href="<c:url value="/noticeboard/edit/${noticetbVO.noticeNo}"/>">수정</a>
                <!-- 삭제 추가 -->
                <a href="<c:url value="/noticeboard/delete/${noticetbVO.noticeNo}"/>">삭제</a> 
                <a href="<c:url value="/noticeboard/list" />">목록</a>
        </div>
</body>
</html>
