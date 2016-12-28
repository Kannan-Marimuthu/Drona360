<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>AccessDenied page</title>
	<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
	<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>
<body background="${pageContext.request.contextPath}/static/img/accessDenied.jpg">
	
	<img src="${pageContext.request.contextPath}/static/img/accessDenied.jpg" height="300px" width="250px"/>
	</br>
	Dear <strong>${activeUser}</strong>, You are not authorized to access this page.	 
	<a href="<c:url value="/home" />">Go to home</a> OR <a href="<c:url value="/logout" />">Logout</a>
</body>
</html>