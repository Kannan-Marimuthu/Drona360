<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<style>
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome page</title>
<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>
<body>
	<div>
		<a href="${pageContext.request.contextPath}/"><img class="logo" src="${pageContext.request.contextPath}/static/img/school.png"></a>
	</div> 
</body>
</html>
