<%@taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
 
	<sec:authorize access="hasRole('USER')">
		<!-- For login user -->
		<form:form action="logout" method="post" id="logoutForm"/>
		<script>
			function formSubmit() {
				document.getElementById("logoutForm").submit();
			}
		</script>
 
		<c:if test="${pageContext.request.userPrincipal.name != null}">
			<h2>
				User : ${pageContext.request.userPrincipal.name} | 
		
				<a href="javascript:formSubmit()"> Logout</a>
			</h2>
		</c:if>
	</sec:authorize>
</body>
</html>