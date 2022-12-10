<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insertar autor</title>
<link rel="Stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/custom.css">
</head>
<body>


	<br>

	<div class="form-autor">
		<form action="${pageContext.request.contextPath}/AdminController?operacion=insertarAutor" method="POST">
			<fieldset>
				<legend>
					<h1>Rellena los campos</h1>
				</legend>

				<c:if test="${exito}">
					<p>La operación ha sido ejecutada correctamente.</p>
				</c:if>
				
				<h2>Insertar Autor</h2>
				<div>
					<span>Nombre del autor: </span> <input type="text"
						name="nombre-autor">
				</div>
				<div>
					<span>Fecha de nacimiento del autor: </span> <input type="date"
						name="fecha-nac-autor">
				</div>


				<button type="submit">Registrar autor</button>
			</fieldset>
		</form>
	</div>
</body>
</html>