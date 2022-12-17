package controlladores.operaciones;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.tagext.TryCatchFinally;

import com.sun.codemodel.JTryBlock;

import dao.AutorDao;
import dao.SocioDao;
import entidades.Autor;
import entidades.Socio;
import herramientas.Formatear;

public class OperacionesAdministrador {

	public static void operacionGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String operacion = request.getParameter("operacion");
		if (operacion != null) {
			switch (operacion) {
			case "listarAutores":
				// TODO Paginar la tabla en 5 filas por petición
				ArrayList<Autor> listaAutores = AutorDao.obtenerListaAutores();
				request.setAttribute("listaAutores", listaAutores);
				request.getRequestDispatcher("/admin/autor/listaautores.jsp").forward(request, response);
				break;

			case "listarSocio":
				String nombreSocio = request.getParameter("nombre-autor");
				// Listar todos los socios en el front
				if (nombreSocio != null) {
					ArrayList<Socio> listaSocios = SocioDao.getSociosPorNombre(nombreSocio);
					request.setAttribute("listaSocios", listaSocios);
				}
				request.getRequestDispatcher("/admin/autor/listaaautores.jsp").forward(request, response);
				break;

			}
		}

	}

	public static void operacionPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String operacion = request.getParameter("operacion");
		String mensaje = null;

		if (operacion != null) {
			switch (operacion) {

			case "insertarAutor":
				// Funcion de insertar autor - Funcionando correctamente.
				try {
					String nombre = (String) request.getParameter("nombre-autor");
					String fechaNac = (String) request.getParameter("fecha-nac-autor");

					Autor a = new Autor();
					a.setFechanacimiento(Formatear.formatoSqlDate(fechaNac));
					a.setNombre(Formatear.toMayuscula(nombre));
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
					s.setNombre(nombreSocio);
					s.setDireccion(direccionSocio);
					s.setEmail(emailSocio);	
					SocioDao.insertarSocio(s);

				} catch (Exception e) {
					mensaje = "Error al insertar el socio.";
					request.setAttribute("mensajeError", mensaje);
				} finally {
					request.getRequestDispatcher("/admin/autor/altasocio.jsp").forward(request, response);
				}
				
			break;

			}
		}
	}
}
