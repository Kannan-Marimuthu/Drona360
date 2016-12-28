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
	<div class="well lead">New Menu Group</div>
 	<form:form method="POST" modelAttribute="menuGrp" class="form-horizontal">
		<form:input type="hidden" path="menuGrpId" id="menuGrpId"/>
		
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="firstName">Menu Group Name</label>
				<div class="col-md-7">
					<form:input type="text" path="menuGrpName" id="menuGrpName" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="menuGrpName" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="menuGrpDisplayTxt">Display Text</label>
				<div class="col-md-7">
					<form:input type="text" path="menuGrpDisplayTxt" id="menuGrpDisplayTxt" class="form-control input-sm" />
					<div class="has-error">
						<form:errors path="menuGrpDisplayTxt" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="menuFileName">Child</label>
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
				<a href="<c:url value='/add-menu-${menuGrp.menuGrpId}' />">Click here to upload/manage your documents</a>	
			</span>
		</c:if>
	</form:form>
	</div>
</body>
</html>