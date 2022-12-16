<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Title</title>
<!-- Required meta tags -->
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />

<!-- Bootstrap CSS v5.2.1 -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT"
	crossorigin="anonymous" />
</head>

<body>
	<header>
		<jsp:directive.include file="/WEB-INF/includes/nav.jspf" />
	</header>
	<main>
		<div class="container">
		
			<c:if test="${listaAutores == null && error == null }">
				<% response.sendRedirect("../ControladorAdministrador?operacion=listarAutores");%>	
			</c:if>
		
			<c:choose>
				<c:when test="${listaAutores != null }">
					<h1 class="mt-2">Lista de autores</h1>
					<table class="table mt-4 text-center table-striped">
						<thead class=" table-dark">
							<tr>
								<th scope="col"># id</th>
								<th scope="col">Nombre del autor</th>
								<th scope="col">Fecha de nacimiento</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${listaAutores}" var="autor">
								<tr>
									<th scope="row">${autor.idautor}</th>
									<td>${autor.nombre}</td>
									<td>${autor.fechanacimiento}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</c:when>

				<c:when test="${error != null}">
					<h1 class="mt-2 alert alert-danger">Error al obtener lista de
						autores.</h1>
				</c:when>
			</c:choose>
		</div>
	</main>
	<footer>
		<!-- place footer here -->
	</footer>
	<!-- Bootstrap JavaScript Libraries -->
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
		integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
		crossorigin="anonymous"></script>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.min.js"
		integrity="sha384-7VPbUDkoPSGFnVtYi0QogXtr74QeVeeIs99Qfg5YCF+TidwNdjvaKZX19NZ/e6oz"
		crossorigin="anonymous"></script>
</body>
</html>
