<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">

<head>
  <title>Modificar socio</title>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <!-- Bootstrap CSS v5.2.1 -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">

    <script
      src="https://kit.fontawesome.com/58968ee114.js"
      crossorigin="anonymous"
    ></script>

</head>

<body>
  <header>
    <jsp:directive.include file="/WEB-INF/includes/nav.jspf" />
  </header>
  <main>
    <div class="container-sm w-50 border border-dark border-5 rounded-3 p-4 mt-5">
        <form action="${pageContext.request.contextPath}/ControladorAdministrador" method="get" class="text-center">
          <!-- TODO: realizar mensajes de exito al encontrar o no se ha encontrado ningun socio -->
          <div class="row">
            <div class="col-sm-12 text-center">
              <h1>Modificar socio</h1>
            </div>
          </div>
          <div class="row">
            <div class="col-sm-12">
              <div class="form-group">
              <input type="hidden" name="operacion" value="listarSociosPorNombre"/>
                <label for="nombre-socio" class="fw-bold">Busqueda por nombre:</label>
                <input
                  type="text"
                  class="form-control text-center"
                  placeholder="Jenny"
                  name="nombre-socio"
                />
                <div class="d-flex justify-content-center">
                  <button type="submit" class="btn btn-dark mt-2">
                    Buscar socio
                  </button>
                </div>
             </div>
            </div>
          </div>
        </form>
    </div>
	<c:if test="${listaSocios != null }">
	    <div class="container  border border-dark border-5 rounded-3 p-4 mt-5">
	      <h1>Modificar socio</h1>
	      <h3 class="mt-2">Lista de socios encontrados</h3>
	      <table class="table mt-4 text-center table-striped" >
	        <thead class=" table-dark">
	          <tr>
	            <th scope="col">#</th>
	            <th scope="col">Nombre del Socio</th>
	            <th scope="col">Dirección</th>
	            <th scope="col">Selección</th>
	          </tr>
	        </thead>
	        <tbody>
		        <c:forEach items="${listaSocios}" var="socio">
		          <tr>
		            <th scope="row">${socio.idsocio}</th>
		            <td>${socio.nombre}</td>
		            <td>${socio.direccion}</td>
		            <td><a href="" class="btn btn-dark">Editar</a></td>
		          </tr>
	          </c:forEach>
	        </tbody>
	      </table>
	    </div>
    </c:if>
  </main>
  <footer>
    <!-- place footer here -->
  </footer>
  <!-- Bootstrap JavaScript Libraries -->
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
    integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous">
  </script>

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.min.js"
    integrity="sha384-7VPbUDkoPSGFnVtYi0QogXtr74QeVeeIs99Qfg5YCF+TidwNdjvaKZX19NZ/e6oz" crossorigin="anonymous">
  </script>
</body>

</html>