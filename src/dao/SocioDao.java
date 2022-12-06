package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import entities.Socio;
import tools.BddJPADao;

public class SocioDao {

	Socio s;

	public SocioDao() {

	}

	public SocioDao(Socio s) {
		this.s = s;
	}

	public void insertarSocio() {
		EntityManager em = BddJPADao.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(s);
		tx.commit();
	}

	public void setSocio(Socio s) {
		this.s = s;
	}

	public List<Socio> getSociosPorNombre(String socio) {
		EntityManager em = tools.BddJPADao.getEntityManager();
		TypedQuery<Socio> consulta = (TypedQuery<Socio>) em.createNamedQuery("Socio.sociosPorNombre", Socio.class);
		List<Socio> listaSociosPorNombre = consulta.getResultList();
		return listaSociosPorNombre;
	}
	
	@SuppressWarnings("unchecked")
	public List<Socio> getListaSocios(){
		EntityManager em = tools.BddJPADao.getEntityManager();
		TypedQuery<Socio> consulta = (TypedQuery<Socio>)em.createNamedQuery("Socio.findAll");
		List<Socio> listaSocios = consulta.getResultList();
		
		return listaSocios;
		
	}

}
