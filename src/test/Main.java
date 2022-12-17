package test;

import dao.SocioDao;
import entidades.Socio;

public class Main {

	public static void main(String[] args) {
		long id = 5;
		Socio s;
		s = SocioDao.buscarSocioPorId(id);
		
		
		System.out.println(s.toString());
	}

}
