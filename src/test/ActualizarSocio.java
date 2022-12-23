package test;

import dao.SocioDao;
import entidades.Socio;

public class ActualizarSocio {
	public static void main(String[] args) {
		//actualizacion de un socio recibido por id:
		 Socio s = SocioDao.socioPorId(1l);
		 SocioDao.actualizar(s);
		 
		 
		 
		 
		 
		 
		
		
	}
}
