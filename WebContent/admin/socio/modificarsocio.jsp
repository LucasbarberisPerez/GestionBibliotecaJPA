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
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
          <a class="navbar-brand" href="#">Biblioteca JPA</a>
          <button
            class="navbar-toggler"
            type="button"
            data-bs-toggle="collapse"
            data-bs-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent"
            aria-expanded="false"
            aria-label="Toggle navigation"
          >
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
              <li class="nav-item">
                <a class="nav-link active"  href="${pageContext.request.contextPath}/index.jsp"> Inicio</a>
              </li>

              <li class="nav-item dropdown">
                <a
                  class="nav-link dropdown-toggle"
                  href="#"
                  id="navbarDropdown"
                  role="button"
                  data-bs-toggle="dropdown"
                  aria-expanded="false"
                >
                  Socios
                </a>
                <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                  <li>
                    <a
                      class="dropdown-item"
                      href="#"
                      >Nuevo socio</a
                    >
                  </li>
                  <li><a class="dropdown-item" href="#">Listado socio</a></li>
                  <li><a class="dropdown-item" href="#">Modificar socio</a></li>
                  <li><a class="dropdown-item" href="#">Eliminar socio</a></li>
                  <li><hr class="dropdown-divider" /></li>
                  <li><a class="dropdown-item" href="#">Socios morosos</a></li>
                </ul>
              </li>

              <li class="nav-item dropdown">
                <a
                  class="nav-link dropdown-toggle"
                  href="#"
                  id="navbarDropdown"
                  role="button"
                  data-bs-toggle="dropdown"
                  aria-expanded="false"
                >
                  Autores
                </a>
                <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                  <li>
                    <a
                      class="dropdown-item"
                      href="${pageContext.request.contextPath}/admin/altaautor.jsp"
                      >Nuevo autor</a
                    >
                  </li>
                  <li>
                    <a class="dropdown-item" href="${pageContext.request.contextPath}/admin/listaautores.jsp">Listado de autores</a>
                  </li>
                </ul>
              </li>

              <li class="nav-item dropdown">
                <a
                  class="nav-link dropdown-toggle"
                  href="#"
                  id="navbarDropdown"
                  role="button"
                  data-bs-toggle="dropdown"
                  aria-expanded="false"
                >
                  Ejemplares
                </a>
                <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                  <li>
                    <a class="dropdown-item" href="#">Eliminar ejemplar</a>
                  </li>
                </ul>
              </li>

              <li class="nav-item dropdown">
                <a
                  class="nav-link dropdown-toggle"
                  href="#"
                  id="navbarDropdown"
                  role="button"
                  data-bs-toggle="dropdown"
                  aria-expanded="false"
                >
                  Libros
                </a>
                <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                  <li><a class="dropdown-item" href="#">Consulta</a></li>
                  <li><a class="dropdown-item" href="#">Nuevo libro</a></li>
                </ul>
              </li>

              <li class="nav-item dropdown">
                <a
                  class="nav-link dropdown-toggle"
                  href="#"
                  id="navbarDropdown"
                  role="button"
                  data-bs-toggle="dropdown"
                  aria-expanded="false"
                >
                  Prestamos
                </a>
                <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                  <li><a class="dropdown-item" href="${pageContext.request.contextPath}/admin/prestamo.jsp">Nuevo prestamo</a></li>
                  <li><a class="dropdown-item" href="#">Devolucion</a></li>
                  <li><hr class="dropdown-divider" /></li>
                  <li><a class="dropdown-item" href="#">Logout</a></li>
                </ul>
              </li>
            </ul>
          </div>
        </div>
      </nav>
  </header>
  <main>
    <div class="container-sm w-50 border border-dark border-5 rounded-3 p-4 mt-5">
        <form action="AdministradorControllador?operacion=buscarsocio" class="text-center">
          <div class="row">
            <div class="col-sm-12 text-center">
              <h1>Modificar socio</h1>
            </div>
          </div>
          <div class="row">
            <div class="col-sm-12">
              
              <div class="form-group">
                <label for="nombre-socio" class="fw-bold">Busqueda por nombre:</label>
                <input
                  type="text"
                  class="form-control text-center"
                  placeholder="sofia"
                  name="nombre-socio"
                />
              <div class="d-flex justify-content-center">
                <button type="submit" class="btn btn-dark mt-2">
                  Buscar socio
                </button>
              </div>
            </div>
          </div>
        </form>
    </div>


      <div class="container  border border-dark border-5 rounded-3 p-4 mt-5">
        <div class="container">
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
                <tr>
                  <th scope="row">1</th>
                  <td>Socio0</td>
                  <td>Calle lago 1</td>
                  <td><a href="" class="btn btn-dark stretched-link">Editar</a></td>
                </tr>
              </tbody>
            </table>

            <a href="modificarsocio.html" class="btn btn-dark stretched-link">Volver</a>
          </div>
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