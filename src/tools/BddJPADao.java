package tools;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BddJPADao {
	private static EntityManagerFactory etm;
	
	public static EntityManager getEntityManager() {
		etm = Persistence.createEntityManagerFactory("GestionBibliotecaJPA");
		return etm.createEntityManager();
	}
	
	

}
