<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<a href="<c:url value="/spittles" />">Spittles</a>
<a href="<c:url value="/spittles/register" />">Register</a>

</body>
</html>
