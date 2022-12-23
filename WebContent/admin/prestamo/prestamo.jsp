<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">

<head>
<title>Nuevo préstamo</title>
<jsp:directive.include file="/WEB-INF/includes/head.jspf" />
</head>

<body>
	<header>
		<jsp:directive.include file="/WEB-INF/includes/nav.jspf" />
	</header>
	<main>
		<div
			class="container border border-2 border-dark w-50 p-3 d-flex flex-column justify-content-center align-items-center">
			<h1 class="text-center">Guardar prestamos</h1>

			<jsp:directive.include file="/WEB-INF/includes/resultado.jspf" />

			<form
				action="${pageContext.request.contextPath}/ControladorAdministrador?operacion=guardarPrestamo"
				method="post">
				<div class="d-flex flex-column gap-2 text-center ">
					<span>Código de socio:</span> <input type="text" name="codigoSocio"
						class="form-control text-center">
				</div>

				<div class="d-flex flex-column text-center">
					<span>Código de ejemplar:</span> <input type="text"
						name="codigoEjemplar" class="form-control text-center">
				</div>

				<div class="d-flex justify-content-center gap-1">
					<button type="submit" class="btn btn-dark mt-2 text-center">Guardar</button>
					<button type="reset" class="btn btn-dark mt-2 text-center">Borrar</button>
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