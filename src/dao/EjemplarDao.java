package dao;

import javax.persistence.EntityManager;

import entidades.Ejemplar;
import herramientas.ConexionJPA;

public class EjemplarDao {
	public static Ejemplar buscarEjemplarPorId(long idejemplar) {
		EntityManager em = ConexionJPA.getEntityManager();
		Ejemplar e = em.find(Ejemplar.class, idejemplar);
		em.close();
		return e;	
	}

}
