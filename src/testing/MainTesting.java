package testing;

import java.time.LocalDate;

import dao.AutorDao;
import entities.Autor;
import tools.Formateo;

public class MainTesting {
	public static void main(String[] args) {
		Autor a = new Autor();
		a.setFechanacimiento(Formateo.formatoSqlDate("2015-12-23"));
		a.setNombre(Formateo.toMayuscula("lucas"));
		AutorDao.insertarAutor(a);
		
		

	}
}
