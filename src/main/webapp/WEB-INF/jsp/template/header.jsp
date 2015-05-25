<%@taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<body>

	<!-- HEADER -->
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<p class="navbar-text">Student Management System</p>
			</div>
			
			<sec:authorize access="hasRole('USER')">
				
				<form:form action="logout" method="post" id="logoutForm" />
				<script>
					function formSubmit() {
						document.getElementById("logoutForm").submit();
					}
				</script>

				<c:if test="${pageContext.request.userPrincipal.name != null}">
						<p class="navbar-text navbar-right">
							User : ${pageContext.request.userPrincipal.name} | 
							<a href="javascript:formSubmit()"> Logout</a>	
						</p>	
				</c:if>
			</sec:authorize>
		
		</div>
	</nav>
</body>
</html>