package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entities.Autor;
import tools.BddJPADao;

public class AutorDao {
	private Autor autor;

	public AutorDao() {

	}

	public AutorDao(Autor a) {
		this.autor = a;
	}

	public void insertAutor() {
		if (this.autor != null) {
			
			EntityManager em = BddJPADao.getEntityManager();
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			em.persist(this.autor);
			tx.commit();
		}
	}

	public void setAutor(Autor a) {
		this.autor = a;
	}

}
