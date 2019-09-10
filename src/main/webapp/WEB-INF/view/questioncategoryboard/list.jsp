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
                   
                </tr>
                <c:forEach var="questioncategorytb" items="${questioncategorytbList}" varStatus="loop">
                        <tr>
                                <td>${questioncategorytb.quecateNum}</td>
                                <td><a href="<c:url value="/questioncategoryboard/read/${questioncategorytb.quecateNum}" />">
                                        ${questioncategorytb.quecateCate}</a></td>
                               
                        </tr>
                </c:forEach>
        </table>
        <a href="<c:url value="/questioncategoryboard/write" />">새글</a>
</body>
</html>
