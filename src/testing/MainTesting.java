package testing;

import java.time.LocalDate;

import dao.AutorDao;
import entities.Autor;

public class MainTesting {
	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		Autor a = new Autor();
		a.setNombre("Paco");
		a.setFechanacimiento(java.sql.Date.valueOf(ld));
		
		System.out.println(a.getFechanacimiento());
		System.out.println(a.getNombre());
		System.out.println(a.getIdautor());
		
		AutorDao adao = new AutorDao(a);
		
		adao.insertarAutor();
		System.out.println();
		
		

	}
}
