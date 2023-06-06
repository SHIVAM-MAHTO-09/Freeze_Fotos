<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">

					<div class="card-header text-center fs-3">LOGIN PAGE</div>
					<c:if test="${not empty msg }">
						<p class="text-center fs-4">${msg}</p>
						<c:remove var="msg" />
					</c:if>

					<div class="card-body">
						<form action="Loginservlet" method="post">
							<div class="mb-3">
								<label for="exampleInputPassword1" class="form-label">
									Email</label> <input type="email" class="form-control" name="email">
							</div>

							<div class="mb-3">
								<label for="exampleInputPassword1" class="form-label">Password</label>
								<input type="password" class="form-control" name="password">
							</div>

							<button type="submit" class="btn btn-primary col-md-12">LOGIN</button>
						</form>



					</div>
				</div>
			</div>

		</div>
	</div>


</body>
</html>