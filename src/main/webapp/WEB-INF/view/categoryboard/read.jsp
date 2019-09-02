<%@ page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<title>${categorytbVO.cateNo}&nbsp내용</title>
</head>
<body>
        <table border="1">
                <tr>
                        <th>카테고리이름</th>
                        <td>${categorytbVO.cateName}</td>
                </tr>
                <tr>
                        <th>하위카테고리</th>
                        <td>${categorytbVO.catesubCate}</td>
                </tr>
                
        </table>
        <div>
                <a href="<c:url value="/categoryboard/edit/${categorytbVO.cateNo}"/>">수정</a>
                <!-- 삭제 추가 -->
                <a href="<c:url value="/categoryboard/delete/${categorytbVO.cateNo}"/>">삭제</a> 
                <a href="<c:url value="/categoryboard/list" />">목록</a>
        </div>
</body>
</html>
