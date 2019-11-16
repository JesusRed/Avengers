<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="shortcut icon"
	href="https://img.icons8.com/nolan/64/000000/web.png"
	type="image/x-icon">
<title>PREVIO 2 | WEB</title>
<!-- Compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link rel="stylesheet" href="css/style.css">
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
</head>

<body>
	<jsp:useBean id="pDao" class="previo.model.PeliculaDao"
		scope="request"></jsp:useBean>

	<header>
		<div class="navbar-fixed">
			<nav>
				<div class="nav-wrapper deep-purple darken-1">
					<a href="index.html" class="center brand-logo"><i
						class="material-icons">supervised_user_circle</i>AVENGERS</a> <a
						href="indes.html" data-target="mobile-demo" class="sidenav-trigger"><i
						class="material-icons">keyboard_tab</i></a>

				</div>
			</nav>
		</div>

		<ul class="sidenav deep-purple darken-4" id="mobile-demo">
			<li><a class="subheader white-text">Enlaces</a></li>
			<li>
				<div class="divider"></div>
			</li>

			<li><a href="listado.jsp"
				class="waves-effect waves-light btn deep-purple darken-2"><i
					class="material-icons left"> movie</i>LIST PELIS</a></li>
			<li><a href="registro.jsp"
				class="waves-effect waves-light btn deep-purple darken-2"><i
					class="material-icons left"> movie</i>REG PELI</a></li>
		</ul>
	</header>

	<main class="teal lighten-5">
		<div class="container">
			<table class="card-panel hoverable centered striped highlight"
				style="margin-top: 121, 5px; margin-bottom: 121, 5px; margin-top: 121px; margin-bottom: 121px;">
				<thead>
					<tr>
						
						<th>Nombre</th>
						<th>Año de lanzamiento</th>
						<th>Clasificación</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="n" items="${pDao.list()}">
						<tr>
							<td><c:out value="${n.nombre}" /></td>
							<td><c:out value="${n.anolanzamiento}" /></td>
							<td><c:out value="${n.clasificacionBean.descripcion}" /></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>

	</main>

	<footer class="page-footer deep-purple darken-2">
		<div class="container">
			<div class="row">
				<div class="col l6 s12">
					<h5 class="white-text">NOMINA WEB</h5>
					<p class="grey-text text-lighten-4">Lleva un seguimiento de los
						avengers de marvel en esta fabulosa plataforma web.</p>
				</div>
				<div class="col l4 offset-l2 s12">
					<h5 class="white-text">Links</h5>
					<ul>
						<li><a class="grey-text text-lighten-3"
							href="https://github.com/JesusRed">GitHub</a></li>
						<li><a class="grey-text text-lighten-3"
							href="https://ingsistemas.cloud.ufps.edu.co/index.php">Ing.
								Sistemas UFPS</a></li>
						<li><a class="grey-text text-lighten-3"
							href="https://materializecss.com">Materialize</a></li>
						<li><a class="grey-text text-lighten-3"
							href="https://theuselessweb.com">Random</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div class="footer-copyright">
			<div class="container">
				© 2019 Programación Web <a class="grey-text text-lighten-4 right"
					href="#!">Mail</a>
			</div>
		</div>
	</footer>
	<!-- Compiled and minified JavaScript -->
	<script src="js/function.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</body>

</html>