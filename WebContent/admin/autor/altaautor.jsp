<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Alta de autor</title>
	<jsp:directive.include file="/WEB-INF/includes/head.jspf" />
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
						<jsp:directive.include file="/WEB-INF/includes/resultado.jspf" />
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
	
	<jsp:directive.include file="/WEB-INF/includes/bootstrapFooter.jspf" />
</body>
</html>