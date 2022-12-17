<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">

<head>
  <title>Title</title>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <!-- Bootstrap CSS v5.2.1 -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">

</head>

<body>
  <header>
    <jsp:directive.include file="/WEB-INF/includes/nav.jspf" />
  </header>
  <main>
    <div class="container-sm w-50 border border-dark border-5 rounded-3 p-4 mt-5">
        <form action="AdministradorControllador?operacion=altasocio" class="text-center">
          <div class="row">
            <div class="col-sm-12 text-center">
              <h1>Alta de socio</h1>
            </div>
          </div>
          <div class="row">
            <div class="col-sm-12">
              <div class="form-group mt-3">
                <label for="emailSocio" class="fw-bold">email</label>
                <input
                  type="email"
                  class="form-control text-center"
                  placeholder="ejemplo@ejemplo.es"
                  name="email-socio"
                />
              </div>
              <div class="form-group">
                <label for="nombre-socio" class="fw-bold">Nombre</label>
                <input
                  type="text"
                  class="form-control text-center"
                  placeholder="sofia"
                  name="nombre-socio"
                />
              </div>

              <div class="form-group">
                <label for="direccion-socio" class="fw-bold">Dirección</label>
                <input
                  type="text"
                  class="form-control text-center"
                  placeholder="C/Robles 9"
                  name="direccion-socio"
                />
              </div>
              <div class="d-flex justify-content-center">
                <button type="submit" class="btn btn-dark mt-2">
                  Registrar socio
                </button>
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
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
    integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous">
  </script>

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.min.js"
    integrity="sha384-7VPbUDkoPSGFnVtYi0QogXtr74QeVeeIs99Qfg5YCF+TidwNdjvaKZX19NZ/e6oz" crossorigin="anonymous">
  </script>
</body>

</html>