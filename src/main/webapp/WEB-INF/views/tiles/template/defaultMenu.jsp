<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div>
	<ul class="topnav"> 
		<li class="right">
			<c:if test="${user != null}">
			<a class="active" href="logout">Logout</a>
			</c:if>
			<c:if test="${user == null}">
			<a class="active" href="admin">Login</a>
			</c:if>
		</li>
	</ul>
</div>