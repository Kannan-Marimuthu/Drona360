<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 
<link href="<c:url value='/static/css/style.css' />" rel="stylesheet"></link> 
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>
 <div class=" ">
    <ul id="nav">        
        <li><a href="">	<c:if test="${activeUser != null}">
				 ${activeUser} 
			</c:if>
			 <c:if test="${activeUser == null}">
				Login
			</c:if></a>
            <ul>
               
                <li><a href="">settings</a></li>
                <li><c:if test="${activeUser != null}">
			<a class="active" href="logout">Logout</a>
			</c:if>
			<c:if test="${activeUser == null}">
			<a class="active" href="admin">Login</a>
			</c:if> 
            </ul>
        </li>        
    </ul>
</div>