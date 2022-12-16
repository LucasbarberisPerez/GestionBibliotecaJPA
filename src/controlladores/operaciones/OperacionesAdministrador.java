package controlladores.operaciones;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
				System.out.println("Aquí entra bro");
				// Listamos los autores con la funcion especificada en la entidad autor.
				ArrayList<Autor> listaAutores = AutorDao.obtenerListaAutores();
				request.setAttribute("listaAutores", listaAutores);
				request.getRequestDispatcher("/admin/listaautores.jsp").forward(request, response);
				break;

			case "listarSocio":
				String nomSocio = request.getParameter("nombre-autor");
				// Listar todos los socios en el front
				if (nomSocio != null) {
					SocioDao sd = new SocioDao();
					List<Socio> listaSocios = sd.getSociosPorNombre(null);
					request.setAttribute("listaSocios", listaSocios);
					request.getRequestDispatcher("/autores.jsp").forward(request, response);
				}

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
				}

				request.getRequestDispatcher("/admin/altaautor.jsp").forward(request, response);
				break;

			}
		}
	}
}
