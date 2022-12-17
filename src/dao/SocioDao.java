package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import entidades.Socio;
import herramientas.ConexionJPA;

public class SocioDao {

	public static void insertarSocio(Socio s) {
		if (s != null) {
			EntityManager em = ConexionJPA.getEntityManager();
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			em.persist(s);
			tx.commit();
			em.close();
		}
	}

	public static ArrayList<Socio> getSociosPorNombre(String socio) {
		EntityManager em = herramientas.ConexionJPA.getEntityManager();
		TypedQuery<Socio> consulta = (TypedQuery<Socio>) em.createNamedQuery("Socio.sociosPorNombre", Socio.class);
		List<Socio> listaSociosPorNombre = consulta.getResultList();
		return (ArrayList<Socio>) listaSociosPorNombre;
	}

	public static Socio buscarSocioPorId(long idsocio) {
		EntityManager em = ConexionJPA.getEntityManager();
		Socio s = (Socio) em.find(Socio.class, idsocio);
		em.close();
		return s;

	}

	@SuppressWarnings("unchecked")
	public List<Socio> getListaSocios() {
		EntityManager em = herramientas.ConexionJPA.getEntityManager();
		TypedQuery<Socio> consulta = (TypedQuery<Socio>) em.createNamedQuery("Socio.findAll");
		List<Socio> listaSocios = consulta.getResultList();

		return listaSocios;

	}

}
