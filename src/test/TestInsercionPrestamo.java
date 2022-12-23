package test;
import dao.PrestamoDao;


public class TestInsercionPrestamo {

	public static void main(String[] args) {
	
		try {
			//suelta excepcion por violar clave primaria
			PrestamoDao.insertarPrestamo(1l, 2l);
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("Fin operacion");

	}

}
