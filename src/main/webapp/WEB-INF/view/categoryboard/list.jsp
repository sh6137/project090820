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
                        <th>카테고리이름</th>
                        <th>하위카테고리</th>
                   
                </tr>
                <c:forEach var="categorytb" items="${categorytbList}" varStatus="loop">
                        <tr>
                                <td>${categorytb.cateNo}</td>
                                <td><a href="<c:url value="/categoryboard/read/${categorytb.cateNo}" />">
                                        ${categorytb.cateName}</a></td>
                               	<td>${categorytb.catesubCate}</td>
                               
                        </tr>
                </c:forEach>
        </table>
        <a href="<c:url value="/categoryboard/write" />">새글</a>
</body>
</html>
