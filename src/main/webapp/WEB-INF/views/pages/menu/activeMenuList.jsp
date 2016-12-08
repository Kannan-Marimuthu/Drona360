<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users List</title>
<link href="<c:url value='/static/css/bootstrap.css' />"
	rel="stylesheet"></link>
<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>

<link rel="stylesheet"
	href="https://ajax.googleapis.com/ajax/libs/angular_material/1.0.0/angular-material.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-animate.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-aria.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-messages.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angular_material/1.0.0/angular-material.min.js"></script>
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link href="/Drona360/static/css/bootstrap.css" rel="stylesheet">
<script language="javascript">
	angular.module('firstApplication', [ 'ngMaterial' ]).controller(
			'gridController', gridController);

	function gridController($scope) {
		var COLORS = [ '#2191ce' ];
		this.colorTiles = (function() {
			var tiles = [];
			for (var i = 0; i < 1; i++) {
				tiles.push({
					color : randomColor(),
					colspan : 1,
					rowspan : 1
				});
			}
			return tiles;
		})();

		function randomColor() {
			return COLORS[Math.floor(Math.random() * COLORS.length)];
		}

		function randomSpan() {
			var r = Math.random();
			if (r < 0.8) {
				return 1;
			} else if (r < 0.9) {
				return 2;
			} else {
				return 3;
			}
		}
	}
</script>
</head>
<body ng-app="firstApplication">
	<div class="well">
		<a href="<c:url value='/home' />">Home</a> &nbsp;&nbsp;&nbsp; <a
			href="<c:url value='/newUser' />">Add New User</a> &nbsp;&nbsp;&nbsp;
		<a href="<c:url value='/menuList' />">Add New Menu</a>
		&nbsp;&nbsp;&nbsp; <a href="<c:url value='/list' />">User List</a>&nbsp;&nbsp;&nbsp;
		<a href="<c:url value='/logout' />">Logout</a>
	</div>
	<div class="generic-container">
		<div class="panel panel-default">
			<!-- Default panel contents -->
			<div class="panel-heading">
				<span class="lead">List of Menus </span>
			</div>
			<div id="gridContainer" ng-controller="gridController as ctrl"
				ng-cloak>
				<md-content layout-padding> <md-grid-list
					md-cols-gt-md="12" md-cols-sm="3" md-cols-md="8"
					md-row-height-gt-md="1:1" md-row-height="4:3"
					md-gutter-gt-md="16px" md-gutter-gt-sm="8px" md-gutter="4px">

				<c:forEach items="${activeMenuList}" var="menu">

					<md-grid-tile ng-repeat="tile in ctrl.colorTiles"
						ng-style="{
                     'background': tile.color
                  }"
						md-colspan-gt-sm="{{tile.colspan}}"
						md-rowspan-gt-sm="{{tile.rowspan}}" class="login-container">

					<a href="<c:url value='${menu.menuURL}' />" class=" ">${menu.menuName}
					</a> </md-grid-tile>

				</c:forEach> </md-grid-list> </md-content>
			</div>
		</div>
	</div>
</body>
</html>