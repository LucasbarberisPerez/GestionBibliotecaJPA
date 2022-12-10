package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entities.Autor;
import tools.ConexionJPA;

public class AutorDao {

	public static void insertarAutor(Autor a) {

		if (a != null) {
			EntityManager em = ConexionJPA.getEntityManager();
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			em.persist(a);
			tx.commit();
			
		}

	}

}
