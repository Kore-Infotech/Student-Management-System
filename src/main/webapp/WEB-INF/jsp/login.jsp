<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Login Page</title>
<style>
.error {
	padding: 15px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #a94442;
	background-color: #f2dede;
	border-color: #ebccd1;
}

.msg {
	padding: 15px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #31708f;
	background-color: #d9edf7;
	border-color: #bce8f1;
}

#login-box {
	width: 300px;
	padding: 20px;
	margin: 100px auto;
	background: #fff;
	-webkit-border-radius: 2px;
	-moz-border-radius: 2px;
	border: 1px solid #000;
}
</style>
</head>
<body onload='document.loginForm.username.focus();'>

	<h1>Login - Student Management System</h1>

	<div id="login-box">

		<h2>Login with Username and Password</h2>

		<c:if test="${not empty error}">
			<div class="error">${error}</div>
		</c:if>
		<c:if test="${not empty msg}">
			<div class="msg">${msg}</div>
		</c:if>


		
		<table>
			<form:form name='loginForm' action="login" method='POST' commandName="user">
				<tr>
					<td>User:</td>
					<td><form:input path='userName'/></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><form:password path="password"/></td>
				</tr>
				<tr>
					<td colspan='2'>
						<input name="submit" type="submit" value="Login" />
					</td>
				</tr>		
			</form:form>
		
				<tr>
					<td colspan='2'>
					<form:form action="addNewUserForm" method='GET'>
						<input type="submit" value="New User Sign Up"/>
					</form:form>
					</td>
				</tr>
		
			</table>
	</div>

</body>
</html>