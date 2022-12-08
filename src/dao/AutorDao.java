package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entities.Autor;
import tools.BddJPADao;

public class AutorDao {

	public static void insertarAutor(Autor a) {

		if (a != null) {
			EntityManager em = BddJPADao.getEntityManager();
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			em.persist(a);
			tx.commit();
			System.out.println("Autor insertado.");
		}

	}

}
