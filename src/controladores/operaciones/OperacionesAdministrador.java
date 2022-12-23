package controladores.operaciones;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.AutorDao;
import dao.PrestamoDao;
import dao.SocioDao;
import entidades.Autor;
import entidades.Socio;
import herramientas.Formatear;

public class OperacionesAdministrador implements Operaciones {

	public static void operacionesDoGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String operacion = request.getParameter("operacion");
		if (operacion != null) {
			switch (operacion) {
			case "listarAutores":
				// TODO Paginar la tabla en 5 filas por petición
				int inicio = 0; // pagina por defecto.
				int maximo = 5; // numero maximo de registro por defecto.
				int paginasTotales = 0;
				ArrayList<Autor> listaAutores;

				if (request.getParameter("pag") != null) {
					inicio = Integer.parseInt(request.getParameter("pag"));
				}


				try {
					long totalRegistros = SocioDao.cantidadSocios();
					paginasTotales = (int) totalRegistros / maximo;
					if (totalRegistros % maximo == 0) {
						paginasTotales--;
					}

					listaAutores = AutorDao.listaAutoresPaginado((inicio * maximo), maximo);
					request.setAttribute("pagina", inicio);
					request.setAttribute("maximoRegistros", maximo);
					request.setAttribute("totalRegistros", totalRegistros);
					request.setAttribute("paginasTotales", paginasTotales);
					request.setAttribute("listaAutores", listaAutores);

				} catch (Exception e) {
					System.out.println("error");
				} finally {
					request.getRequestDispatcher("/admin/autor/listaautores.jsp").forward(request, response);
				}

				break;

			case "listarSociosPorNombre":
				String nombreSocio = request.getParameter("nombre-socio");
				// Listar todos los socios en el front
				if (nombreSocio != null) {
					ArrayList<Socio> listaSocios = SocioDao.listaPorNombre(nombreSocio);
					request.setAttribute("listaSocios", listaSocios);
				}
				request.getRequestDispatcher("/admin/socio/modificarsocio.jsp").forward(request, response);
				break;
			case "editarSocio":
				try {
					long idSocio = Long.parseLong(request.getParameter("socioid"));
					Socio s = SocioDao.socioPorId(idSocio);
					request.setAttribute("socioEditar", s);
					request.getRequestDispatcher("/admin/socio/editorsocio.jsp").forward(request, response);
				} catch (Exception e) {
					request.setAttribute("mensajeError", "No se ha podido acceder a la edición del socio.");
					request.getRequestDispatcher("/admin/socio/modificarsocio.jsp").forward(request, response);
				}

				break;

			}
		}

	}

	public static void operacionesDoPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String operacion = request.getParameter("operacion");
		String mensaje = null;

		if (operacion != null) {
			switch (operacion) {

			case "insertarAutor":

				try {
					String nombre = (String) request.getParameter("nombre-autor");
					String fechaNac = (String) request.getParameter("fecha-nac-autor");

					Autor a = new Autor();
					a.setFechanacimiento(Formatear.sqlDate(fechaNac));
					a.setNombre(Formatear.mayuscula(nombre));
					AutorDao.insertarAutor(a);

					mensaje = "El autor o la autora ha sido insertad@ con exito.";
					request.setAttribute("mensajeExito", mensaje);

				} catch (Exception e) {
					mensaje = "Error al insertar el autor.";
					request.setAttribute("mensajeError", mensaje);
				} finally {
					request.getRequestDispatcher("/admin/autor/altaautor.jsp").forward(request, response);
				}

				break;

			case "altaSocio":

				try {
					String nombreSocio = request.getParameter("nombre-socio");
					String direccionSocio = request.getParameter("direccion-socio");
					String emailSocio = request.getParameter("email-socio");
					Socio s = new Socio();
					s.setNombre(Formatear.mayuscula(nombreSocio));
					s.setDireccion(Formatear.mayuscula(direccionSocio));
					s.setEmail(Formatear.mayuscula(emailSocio));
					SocioDao.insertar(s);
					mensaje = "Exito al insertar el socio.";
					request.setAttribute("mensajeExito", mensaje);

				} catch (Exception e) {
					mensaje = "Error al insertar el socio.";
					request.setAttribute("mensajeError", mensaje);
				} finally {
					request.getRequestDispatcher("/admin/socio/altasocio.jsp").forward(request, response);
				}

				break;

			case "aplicarCambiosSocio":

				try {
					String nombre = (String) request.getParameter("nombre-socio");
					String direccion = (String) request.getParameter("direccion-socio");
					String email = (String) request.getParameter("email-socio");
					long idsocio = Long.parseLong(request.getParameter("socio"));
					ArrayList<String> mensajes;

					Socio s_form = new Socio(idsocio, direccion, email, nombre);
					mensajes = SocioDao.actualizar(s_form);

					request.setAttribute("mensajes", mensajes);
					request.setAttribute("socioEditar", s_form);

				} catch (Exception e) {
					mensaje = "Error al guardar al guardar los cambios. inténtelo más tarde.";
					request.setAttribute("mensajeError", mensaje);
				} finally {
					request.getRequestDispatcher("/admin/socio/editorsocio.jsp").forward(request, response);
				}

				break;

			case "guardarPrestamo":
				System.out.println("Entra en guardar prestamo.");
				try {
					long codigoSocio = Long.parseLong(request.getParameter("codigoSocio"));
					long codigoEjemplar = Long.parseLong(request.getParameter("codigoEjemplar"));
					PrestamoDao.insertarPrestamo(codigoEjemplar, codigoSocio);

					mensaje = "Exito al realizar el prestamo.";
					request.setAttribute("mensajeExito", mensaje);

				} catch (Exception e) {
					mensaje = "Error al insertar el prestamo.";
					request.setAttribute("mensajeError", mensaje);
				} finally {
					request.getRequestDispatcher("/admin/prestamo/prestamo.jsp").forward(request, response);
				}
				break;
			}
		}
	}
}
