<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<spring:url var="css" value="/resources/css" />
<spring:url var="fonts" value="/resources/fonts" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Market Place ${title}</title>

<script>
	window.menu = '${title}';
	window.contextRoot = '${pageContext.servletContext.contextPath}';
</script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">
<!-- Bootstrap theme CSS -->
<link href="${css}/boostrap-theme.css" rel="stylesheet">
<!-- Bootstrap dataTable -->
<link href="${css}/dataTables.bootstrap.css" rel="stylesheet">


<!-- Custom styles for this template -->
<link href="${css}/style.css" rel="stylesheet">

</head>

<body>
	<div class="wapper">

		<!-- Navigation -->
		<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
			<div class="container">
				<div class="navbar-header">
					<a class="navbar-brand"
						href="${pageContext.servletContext.contextPath}/home">Market
						Place</a>
				</div>
			</div>
		</nav>
		<!-- Page Content -->
		<div class=content>
			<div class="container">
			<c:if test="${not empty message}">
				<div class="row">
					<div class="col-md-offset-2 col-md-8">
					<div class="alert alert-danger">
						${message} 
						</div>
					</div>
					</div>
			</c:if>
			<c:if test="${not empty logout}">
				<div class="row">
					<div class="col-md-offset-2 col-md-8">
					<div class="alert alert-success">
						${logout} 
						</div>
					</div>
					</div>
			</c:if>
				<div class="row">
					<div class="col-md-offset-2 col-md-8">

						<div class="panel panel-primary">

							<div class="panel-heading">

								<h4>Login</h4>
							</div>
							<div class="panel-body">
								<form id="loginForm"class="form-horizontal" method="POST"
									action="${pageContext.servletContext.contextPath}/login">
									<div class="form-group">

										<label class="control-lable col-md-4" for="username">
											Email :</label>
										<div class="col-md-8">
											<input type="text" id="username" name="username"
												placeholder="Enter Email" class="form-control" />
										
										</div>
									</div>
									<div class="form-group">

										<label class="control-lable col-md-4" for="password">
											Password</label>
										<div class="col-md-8">
											<input type="password" name="password" id="password"
												placeholder="Enter Password" class="form-control" />
											
										</div>
									</div>
									<div class="form-group">
							<div class="col-md-offset-4 col-md-8">
								<input type="submit" value="Submit" name="submit" id="submit"
									class="btn btn-primary" />
									<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
							</div>
						</div>

								</form>
							</div>
							<div class="panel-footer">
								<div class="text-right">
									New User : <a href="${pageContext.servletContext.contextPath}/register">Register Here</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- /.container -->

		<!-- Footer -->
		<%@include file="./share/Footer.jsp"%>
		<!-- Bootstrap core JavaScript -->
		<script src="${js}/jquery-3.2.1.min.js"></script>
		<script src="${js}/jquery.validation.js"></script>
		<script src="${js}/popper.js"></script>
		<script src="${js}/bootstrap.js"></script>
		<script src="${js}/myApp.js"></script>



	</div>
</body>

</html>
