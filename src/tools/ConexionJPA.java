package tools;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConexionJPA {
	private static EntityManagerFactory etm;

	public static EntityManager getEntityManager() {
		if (etm == null) {
			etm = Persistence.createEntityManagerFactory("GestionBibliotecaJPA");
		}
		return etm.createEntityManager();
	}

	public static void limpiarConexion() {
		if (etm.isOpen()) {
			etm.close();
		}
		System.out.println("Factory cerrada.");
	}

}
