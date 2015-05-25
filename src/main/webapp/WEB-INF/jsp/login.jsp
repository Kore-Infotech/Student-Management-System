<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
	<spring:url value="/resources/css/bootstrap.css" var="stylecss" />
	<link href="${stylecss}" rel="stylesheet" />
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Login Page</title>
</head>
<body>

	<div class="container">
		
		<h1>Login - Student Management System</h1>
		
		<div class="well">
  			
   
			<form:form name='loginForm' action="login" method='POST' commandName="user" class="form-horizontal">
			
				<div class="form-group">
					<c:if test="${not empty error}">
						<div class="alert alert-danger col-md-5" role="alert">${error}</div>
					</c:if>
					<c:if test="${not empty msg}">
						<div class="alert alert-success col-md-5" role="alert">${msg}</div>
					</c:if>
				</div>
			
				<div class="form-group">
					<label for="userName" class="col-md-1 control-label">Username</label>
					<div class="col-md-4">		
						<form:input path="userName" class="form-control"/>
					</div>	
				</div>
				
				<div class="form-group">
					<label for="password" class="col-md-1 control-label">Password</label>
					<div class="col-md-4">		
						<form:password path="password" class="form-control"/>
					</div>	
				</div>
				<div class="form-group">
		    		<div class="col-md-offset-1 col-md-4">
		      			<button type="submit" class="btn btn-primary btn-block">Login</button>
		   			</div>
		  		</div>
			</form:form>
			
			<form:form action="addNewUserForm" method='GET' class="form-horizontal">
				<div class="form-group">
					<div class="col-md-offset-1 col-md-4">
		      			<button type="submit" class="btn btn-default btn-block">New User Sign Up</button>
		   			</div>
		   		</div>			
			</form:form>	
		
	</div>

</body>
</html>