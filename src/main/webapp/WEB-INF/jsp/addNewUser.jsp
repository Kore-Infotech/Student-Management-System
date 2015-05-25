<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
	<title>New User Sign-Up</title>
	</head>
	
	<body>
		<h1>New User Sign-up Form</h1>
		<c:if test="${not empty msg}">
				<div class="msg">${msg}</div>
		</c:if>

		<form:form action="addNewUser" modelAttribute="user">
			<table>
				<tr>
					<td>First Name : </td>
					<td><form:input path="firstName"/> <form:errors path="firstName" cssclass="error" /></td>
				</tr>
				<tr>
					<td>Last Name : </td>
					<td><form:input path="lastName"/> <form:errors path="lastName" /></td>
				</tr>
				<tr>
					<td>Email : </td>
					<td><form:input path="email"/> <form:errors path="email" /></td>
				</tr>
				<tr>
					<td>User Name : </td>
					<td><form:input path="userName"/> <form:errors path="userName" /></td>
				</tr>
				<tr>
					<td>Password : </td>
					<td><form:password path="password"/> <form:errors path="password" /> </td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit"/>
						<input type="button" onClick="location.href='smslogin'" value="Cancel"/>
					</td>
					
				</tr>
			</table>
		</form:form>
	
	</body>
</html>