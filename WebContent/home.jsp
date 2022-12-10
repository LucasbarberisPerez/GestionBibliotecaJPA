<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
  <title>Inicio</title>
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
        <!-- Aquí irá el login de la web cuando esté acabada.-->

        <div class="container">
          <div class="row">
            <div class="col-12 text-center">
              <h1>Biblioteca Municipal</h1>
              
            </div>
          </div>
          <div class="row">
            <div class="col-12">
              <img src="${pageContext.request.contextPath}/resources/img/bg.jpg"  class="img-fluid">
            </div>
          </div>
          
          <div class="row">
            <div class="col-12">
              <p>Bienvenid@ a la biblioteca municipal, aqui podrá solicitar libros a la carta, tenemos un sistema que penaliza cuando una devolución no es efectuada en la fecha recibida, disfruta de los libros pero no olvide devolverlos.</p>
            </div>
          </div>
        </div>
  </main>
  <footer>

  </footer>
 
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
    integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous">
  </script>

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.min.js"
    integrity="sha384-7VPbUDkoPSGFnVtYi0QogXtr74QeVeeIs99Qfg5YCF+TidwNdjvaKZX19NZ/e6oz" crossorigin="anonymous">
  </script>
</body>

</html>