<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html><head><title>삭제</title></head>
<body>
        <form name="deleteForm" 
        action="<c:url value="/questioncategoryboard/delete" />" method="POST">
<input type="hidden" size="1" name="quecateNum" value="${quecateNum}"/>
                ${questioncategorytbVO.quecateCate}
                번글을 삭제하시겠습니까?<br>
                <input type="submit" value="삭제">
                
        </form>
        <a href="<c:url value="/questioncategoryboard/list" />">취소</a>
        <div>${msg}</div>
</body>
</html>
