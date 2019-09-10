<%@ page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<title>${questioncategorytbVO.quecateCate}&nbsp내용</title>
</head>
<body>
        <table border="1">
                <tr>
                        <th>제목</th>
                        <td>${questioncategorytbVO.quecateCate}</td>
                </tr>
                
        </table>
        <div>
                <a href="<c:url value="/questioncategoryboard/edit/${questioncategorytbVO.quecateNum}"/>">수정</a>
                <!-- 삭제 추가 -->
                <a href="<c:url value="/questioncategoryboard/delete/${questioncategorytbVO.quecateNum}"/>">삭제</a> 
                <a href="<c:url value="/questioncategoryboard/list" />">목록</a>
        </div>
</body>
</html>
