<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html><head><title>삭제</title></head>
<body>
        <form name="deleteForm" action="<c:url value="/board/delete" />" method="POST">
                <input size="1" name="seq" value="${seq}"/>
                번글을 삭제하시겠습니까?<br>
                비밀번호<input type="password" name="pwd" />
                <input type="submit" value="삭제">
                <a href="<c:url value="/board/read/${seq}" />">취소</a>
        </form>
        <div>${msg}</div>
</body>
</html>
