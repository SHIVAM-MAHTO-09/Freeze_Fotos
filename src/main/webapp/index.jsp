<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<head>
<style>
.images {
	display: flex;
	flex-wrap: wrap;
	margin: 0 50px;
	padding: 30px;
}

.photo {
	max-width: 31.333%;
	padding: 0 10px;
	height: 240px;
}

.photo img {
	width: 100%;
	height: 100%;
}
</style>
</head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="component/All_css.jsp"%>
</head>

<body>
	<%@include file="component/navbar.jsp"%>
	<div id="carouselExampleCaptions" class="carousel slide"
		data-bs-ride="carousel">
		<div class="carousel-indicators">
			<button type="button" data-bs-target="#carouselExampleCaptions"
				data-bs-slide-to="0" class="active" aria-current="true"
				aria-label="Slide 1"></button>
			<button type="button" data-bs-target="#carouselExampleCaptions"
				data-bs-slide-to="1" aria-label="Slide 2"></button>
			<button type="button" data-bs-target="#carouselExampleCaptions"
				data-bs-slide-to="2" aria-label="Slide 3"></button>
		</div>
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="image/home.jpg" class="d-block w-100" alt="..."
					height="600px">

			</div>
			<div class="carousel-item">
				<img src="image/img12.jpg" class="d-block w-100" alt="..."
					height="600px">
				<div class="carousel-caption d-none d-md-block"></div>
			</div>
			<div class="carousel-item">
				<img src="image/ADVENTURE.png" class="d-block w-100" alt="..."
					height="600px">
				<div class="carousel-caption d-none d-md-block">
					<h5>WRITE BLOG</h5>

				</div>
			</div>
		</div>
		<button class="carousel-control-prev" type="button"
			data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
			<span class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Previous</span>
		</button>
		<button class="carousel-control-next" type="button"
			data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
			<span class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Next</span>
		</button>
	</div>
	<br>
	<br>



	<div class="images">
		<div class="photo">
			<a href="blogpost1.jsp"><img src="image/time.webp" alt="photo" /></a>
		</div>

		<div class="photo">
			<a href="Blogpost2.jsp"><img src="image/chatgpt.jpg" alt="photo" /></a>
		</div>

		<div class="photo">
			<a href="Blogpost3.jsp"><img src="image/ln.jpg"
				alt="photo" /></a>
		</div>
	</div>
	<br>
	
	
	<div class="images">
		<div class="photo">
			<a href="Blogpost4.jsp"><img src="image/selfc.png" alt="photo" /></a>
		</div>

		<div class="photo">
			<a href="Blogpost5.jsp"><img src="image/plantdiet.jpeg" alt="photo" /></a>
		</div>

		<div class="photo">
			<a href="blogpost6.jsp"><img src="image/natb.jpg"
				alt="photo" /></a>
		</div>
	</div>
	<br>
	
	
	<div class="images">
		<div class="photo">
			<a href="Technews.jsp"><img src="image/S1.png" alt="photo" /></a>
		</div>

		<div class="photo">
			<a href="Gadjets.jsp"><img src="image/S2.png" alt="photo" /></a>
		</div>

		<div class="photo">
			<a href="tourism.jsp"><img src="image/S3.png"
				alt="photo" /></a>
		</div>
	</div>
	
	




</body>
</html>