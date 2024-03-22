<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>s
forward로 보내면 데이터는 공유한다.<br>
주소는 forwardStart.jsp가 보인다.
</h3>
결과 = ${requestScope.list }

3번재 항목 = ${requestScope.list[2] }<br><br>

list = 
<c:forEach var ="data" items="${list }">
		${data }
</c:forEach>
<br><br>

list2 = ${list2 }
<br><br>
<c:forEach var="personDTO" items="${list2 }">
	이름 = ${personDTO.getName() } &emsp; 나이 = ${personDTO.getAge() }<br>
	
	<%-- JSTL에서 메소드를 변수명 처럼 사용 가능하다 --%>
	이름 = ${personDTO.name } &emsp; 나이 = ${personDTO.age }<br>
	<br>
</c:forEach>
</body>
</html>