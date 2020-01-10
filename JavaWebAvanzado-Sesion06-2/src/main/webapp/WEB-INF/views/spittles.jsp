<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${spittleList}" var="spittle">
<li id="spittle_<c:out value="spittle.id"/>">
	<div class="spittleMessage">
		<c:out value="${spittle.message}"/>
	</div>
	<div>
		<span class="spittleTime">
			<c:out value="${spittle.time}"/>
		</span>
		<span class="spittleLocation">>
			<c:out value="${spittle.latitude}"/>
			<c:out value="${spittle.longitude}"/>
		</span>
	</div>
</li>
</c:forEach>
</body>
</html>