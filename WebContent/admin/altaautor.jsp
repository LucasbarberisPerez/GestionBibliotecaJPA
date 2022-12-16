<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
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
<script src="https://kit.fontawesome.com/58968ee114.js"
	crossorigin="anonymous"></script>
</head>

<body>
	<header>
		<jsp:directive.include file="/WEB-INF/includes/nav.jspf" />
	</header>
	<main>
		<div
			class="container-sm w-50 border border-dark border-5 rounded-3 p-4 mt-5">
			<form action="${pageContext.request.contextPath}/ControladorAdministrador?operacion=insertarAutor" method="POST" class="text-center">
				<div class="row">
					<div class="col-sm-12 text-center">
						<h1>
							Insertar autor <i class="fa-solid fa-pencil"></i>
						</h1>
						<c:if test="${mensajeExito != null}">
							<span class="badge bg-secondary">
								${mensajeExito}
							</span>
						</c:if>
						
						<c:if test="${mensajeError != null}">
							<span class="badge bg-danger">
								${mensajeError}
							</span>
						</c:if>
						
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<div class="form-group mt-3">
							<label for="nombreAutor" class="fw-bold">Nombre del autor</label>
							<input type="text" class="form-control text-center"
								placeholder="Ejemplo: Jorge Manrique" name="nombre-autor" maxlength="40" />
						</div>
						<div class="form-group">
							<label for="fechaNacimiento" class="fw-bold">Fecha de
								nacimiento</label> <input type="date" class="form-control text-center"
								name="fecha-nac-autor"/>
						</div>
						<div class="d-flex justify-content-center">
							<button type="submit" class="btn btn-dark mt-2">
								Registrar Autor</button>
						</div>
					</div>
				</div>
			</form>
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