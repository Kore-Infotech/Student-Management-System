<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<!DOCTYPE html>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
	<link href="resources/css/bootstrap.css" rel="stylesheet" />
	<link href="resources/css/dashboard.css" rel="stylesheet">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Student Management System</title>
</head>

<body>
	<!-- HEADER -->
	<tiles:insertAttribute name="header" />


	<div class="container-fluid">
		<div class="row">
			<!-- MENU -->
			<tiles:insertAttribute name="menu" />

			<!-- MAIN -->
			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">			
				<tiles:insertAttribute name="body" />
			</div>

		</div>

	</div>

</body>
</html>