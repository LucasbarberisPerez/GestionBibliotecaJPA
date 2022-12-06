package controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AutorDao;
import dao.SocioDao;
import entities.Autor;
import entities.Socio;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String action = request.getParameter("param");

		if (action != null) {

			switch (action) {
			
			
			case "insertarAutor": 
				//insertar autor, el nombre del input tiene que ser nombre-autor
				String nombre = (String) request.getAttribute("nombre-autor");
				LocalDate ld = LocalDate.now();
				Autor a = new Autor();
				a.setFechanacimiento(java.sql.Date.valueOf(ld));
				a.setNombre(nombre);
				AutorDao adao = new AutorDao();
				adao.insertAutor();
				
				break;
			
			
			case "insertarSocio":
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

			case "modificarSocio":

				break;

			case "borrarSocio":

				break;

			default:
				break;
			}
		}
	}

}
