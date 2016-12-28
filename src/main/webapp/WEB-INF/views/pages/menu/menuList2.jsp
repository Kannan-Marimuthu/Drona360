<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Users List</title>
	<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
	<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>

<body>
	<div class="">
		<div class="panel panel-default">
			  <!-- Default panel contents -->
		  	<div class="panel-heading"><span class="lead">List of Menus </span></div>
			<table class="table table-hover">
	    		<thead>
		      		<tr>
				        <th>MenuName</th>
				        <th>MenuDisplayTxt</th>
				        <th>FileName</th>
				        <th>URL</th> 
					</tr>
		    	</thead> 
	    		<tbody>
				<c:forEach items="${menuItems}" var="menu">
					<tr>
						<td>${menu.menuName}</td>
						<td>${menu.menuDisplayTxt}</td>
						<td>${menu.menuFileName}</td>
						<td>${menu.menuURL}</td>
						<td><a href="<c:url value='/edit-user-${menu.menuName}' />" class="btn btn-success custom-width">edit</a></td>
						<td><a href="<c:url value='/delete-user-${menu.menuName}' />" class="btn btn-danger custom-width">delete</a></td>
					</tr>
				</c:forEach>
	    		</tbody>
	    	</table>
		</div>
	 	<div class="well">
	 		<a href="<c:url value='/newUser' />">Add New User</a>
	 	</div>
   	</div>
</body>
</html>