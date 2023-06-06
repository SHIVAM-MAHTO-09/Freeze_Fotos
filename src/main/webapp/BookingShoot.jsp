<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="component/All_css.jsp"%>
</head>
<body>
	<%@include file="component/navbar.jsp"%>



	<div class="container">
		<div class="row">
			<div class="col-md-8 offset-md-2">
				<div class="card">

					<div class="card-header text-center fs-3">Enter Correct
						Information</div>


					<div class="card-body">
						<form action="BookingServlet" method="post">
							<div class="form-row">
								<div class="form-group col-md-4">
									<label for="inputCity">Name</label> <input type="text"
										class="form-control" name="name" id="inputCity"
										placeholder="Name">
								</div>
								<div class="form-group col-md-6">
									<label for="inputEmail4">Email</label> <input type="email"
										class="form-control" name="email" id="inputEmail4"
										placeholder="Email">
								</div>

								<div class="form-group col-md-4">
									<label>Booking For</label> <select name="bookingFor"
										class="custom-select" id="inlineFormCustomSelectPref">
										<option selected>Choose...</option>
										<option value="Full Wedding Shoot PACK 99000 INR">Full
											Wedding Shoot PACK 99000 INR</option>
										<option value="Pre Wedding Shoot PACK 29000 INR">Pre
											Wedding Shoot PACK 29000 INR</option>
										<option value="Birthday Shoot Pack 15000 INR">Birthday
											Shoot Pack 15000 INR</option>
										<option value="New Born Baby Shoot Pack 15000 INR">New
											Born Baby Shoot Pack 15000 INR</option>
										<option value="Personal Shoot 20000 INR">Personal
											Shoot 20000 INR</option>
										<option value="Advertisement Video Pack 25000 INR">Advertisement
											Video Pack 25000 INR</option>

									</select>
								</div>

							</div>
							<div class="form-group">
								<label for="inputAddress">Address</label> <input type="text"
									class="form-control" name="address" id="inputAddress"
									placeholder="1234 Main St">
							</div>

							<div class="form-row">
								<div class="form-group col-md-4">
									<label for="inputCity">City</label> <input type="text"
										class="form-control" name="city" id="inputCity">
								</div>
								<div class="form-group col-md-4">
									<label for="inputCity">State</label> <input type="text"
										class="form-control" name="state" id="inputCity">
								</div>

							</div>
							<div class="form-group col-md-2">
								<label for="inputZip">Zip</label> <input type="text"
									class="form-control" name="zip" id="inputZip">
							</div>
							<br>

							<button type="submit" class="btn btn-primary">Book Now</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>