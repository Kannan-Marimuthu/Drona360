<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>New Menu Group</title>
	<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
	<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>

<body>

 	<div class="">
	<div class="well lead">New Menu</div>
 	<form:form method="POST" modelAttribute="menuItems" class="form-horizontal">
		<form:input type="hidden" path="menuId" id="menuId"/>
		<form:input type="hidden" path="who" id="who" value="${activeUser}"/>
		
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="firstName">Menu Name</label>
				<div class="col-md-7">
					<form:input type="text" path="menuName" id="menuName" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="menuName" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="menuDisplayTxt">Display Text</label>
				<div class="col-md-7">
					<form:input type="text" path="menuDisplayTxt" id="menuDisplayTxt" class="form-control input-sm" />
					<div class="has-error">
						<form:errors path="menuDisplayTxt" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="menuURL">URL</label>
				<div class="col-md-7">
					<form:input type="text" path="menuURL" id="menuURL" class="form-control input-sm" />
					<div class="has-error">
						<form:errors path="menuURL" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="useYorN">Active</label>
				<div class="col-md-7">
					<form:input type="text" path="useYorN" id="useYorN" class="form-control input-sm" />
					<div class="has-error">
						<form:errors path="useYorN" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="menuFileName">File Name</label>
				<div class="col-md-7">
					<form:input type="text" path="menuFileName" id="menuFileName" class="form-control input-sm" />
					<div class="has-error">
						<form:errors path="menuFileName" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="userMenuGroups">Menu Group</label>
				<div class="col-md-7">
					<form:select path="userMenuGroups" items="${menuGroups}" multiple="true" itemValue="menuGrpId" itemLabel="menuGrpName" class="form-control input-sm" />
					<div class="has-error">
						<form:errors path="userMenuGroups" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="form-actions floatRight">
				<c:choose>
					<c:when test="${edit}">
						<input type="submit" value="Update" class="btn btn-primary btn-sm"/> or <a href="<c:url value='/home' />">Cancel</a>
					</c:when>
					<c:otherwise>
						<input type="submit" value="Register" class="btn btn-primary btn-sm"/> or <a href="<c:url value='/home' />">Cancel</a>
					</c:otherwise>
				</c:choose>
			</div>
		</div>
		
		<c:if test="${edit}">
			<span class="well pull-left">
				<a href="<c:url value='/add-menu-${menuItems.menuId}' />">Click here to upload/manage your documents</a>	
			</span>
		</c:if>
	</form:form>
	</div>
</body>
</html>