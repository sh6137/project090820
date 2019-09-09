<%@ page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>목록</title>
</head>
<body>
        <table border="1">
                <tr>
                        <th>NO</th>
                        <th>제목</th>
                        <th>작성자</th>                      
                        <th>작성일</th>
                        <th>조회수</th>
                </tr>
                <c:forEach var="requesttb" items="${requesttbList}" varStatus="loop">
                        <tr>
                                <td>${requesttb.reqNo}</td>
                                <td><a href="<c:url value="/requestboard/read/${requesttb.reqNo}" />">
                                        ${requesttb.reqTitle}</a></td>
                                <td>${requesttb.reqUser}</td>               
                                <td>${requesttb.reqRegDt}</td>
                                <td>${requesttb.reqReadCnt}</td>
                        </tr>
                </c:forEach>
        </table>
        <a href="<c:url value="/requestboard/write" />">새글</a>
</body>
</html>
