<!DOCTYPE html>
<html lang="en">
<head>
<title>Editar Socio</title>
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
	<header> </header>
	<main>
		<div
			class="container-sm w-50 border border-dark border-5 rounded-3 p-4 mt-5">
			<form
				action="/AdministradorControlador?operacion=aplicarCambiosSocio"
				class="text-center">
				<div class="row">
					<div class="col-sm-12 text-center">
						<h1>
							Editar socio <i class="fa-solid fa-pencil"></i>
						</h1>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<div class="form-group mt-3">
							<label for="nombre" class="fw-bold">Nombre</label> <input
								type="text" class="form-control text-center" name="nombre-socio" value="${socioEditar.nombre}"/>
						</div>
						<div class="form-group">
							<label for="direccion" class="fw-bold">Direccion</label> <input
								type="text" class="form-control text-center"
								name="direccion-socio" value="${socioEditar.direccion}"/>

							<div class="form-group">
								<label for="email" class="fw-bold">Email</label> <input
									type="text" class="form-control text-center" name="email-socio" value="${socioEditar.email}"/>
							</div>
							<div class="d-flex justify-content-center">
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
