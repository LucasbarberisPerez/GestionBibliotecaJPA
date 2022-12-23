<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Editar Socio</title>
<jsp:directive.include file="/WEB-INF/includes/head.jspf" />
</head>

<body>
	<header></header>
	<main>
		<div
			class="container-sm w-50 border border-dark border-5 rounded-3 p-4 mt-5">
			<form
				action="${pageContext.request.contextPath}/ControladorAdministrador?operacion=aplicarCambiosSocio"
				method="post" class="text-center">
				<div class="row">
					<div class="col-sm-12 text-center">
						<h1>
							Editar socio <i class="fa-solid fa-pencil"></i>
						</h1>
						
						<jsp:directive.include file="/WEB-INF/includes/socio/actualizaciones.jspf" />
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<div class="form-group mt-3">
							<label for="nombre" class="fw-bold">Nombre</label> <input
								type="text" class="form-control text-center" name="nombre-socio"
								value="${socioEditar.nombre}" />
						</div>
						<div class="form-group">
							<label for="direccion" class="fw-bold">Direccion</label> <input
								type="text" class="form-control text-center"
								name="direccion-socio" value="${socioEditar.direccion}" />

							<div class="form-group">
								<label for="email" class="fw-bold">Email</label> <input
									type="text" class="form-control text-center" name="email-socio"
									value="${socioEditar.email}" />
							</div>
							<div class="d-flex justify-content-center">
								<input type="hidden" value="${socioEditar.idsocio}" name="socio">
								<button type="submit" class="btn btn-primary mt-2">
									Guardar cambios</button>
								<a
									href="${pageContext.request.contextPath}/admin/socio/modificarsocio.jsp"
									class="btn btn-primary mt-2">Volver</a>

							</div>
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
