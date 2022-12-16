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
        <div class="container border border-2 border-dark w-50 p-3 d-flex flex-column justify-content-center align-items-center">
            <h1 class="text-center">Guardar prestamos</h1>
            <form action="">
                <div class="d-flex flex-column gap-2 text-center ">
                    <span>Código de socio:</span>
                    <input type="text" name="codigoSocio" class="text-center">
                </div>
                
                <div class="d-flex flex-column text-center">
                    <span>Código de ejemplar:</span>
                    <input type="text" name="codigoLibro" class="text-center">
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
  <!-- Bootstrap JavaScript Libraries -->
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
    integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous">
  </script>

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.min.js"
    integrity="sha384-7VPbUDkoPSGFnVtYi0QogXtr74QeVeeIs99Qfg5YCF+TidwNdjvaKZX19NZ/e6oz" crossorigin="anonymous">
  </script>
</body>

</html>