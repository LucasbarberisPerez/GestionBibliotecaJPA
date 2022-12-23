package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import entidades.Autor;
import entidades.Socio;
import herramientas.ConexionJPA;

public class SocioDao {

	public static void insertar(Socio s) {
		if (s != null) {
			EntityManager em = ConexionJPA.getEntityManager();
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			em.persist(s);
			tx.commit();
		}
	}

	public static ArrayList<Socio> listaPorNombre(String nombreSocio) {
		EntityManager em = herramientas.ConexionJPA.getEntityManager();
		TypedQuery<Socio> consulta = (TypedQuery<Socio>) em.createNamedQuery("Socio.sociosPorNombre", Socio.class);
		consulta.setParameter("nombresocio", nombreSocio);
		List<Socio> lista = (List<Socio>) consulta.getResultList();
		ArrayList<Socio> listaSocios = new ArrayList<Socio>(lista);
		return listaSocios;
	}

	public static Socio socioPorId(long idsocio) {
		EntityManager em = ConexionJPA.getEntityManager();
		Socio s = (Socio) em.find(Socio.class, idsocio);
		em.close();
		return s;

	}

	public static List<Socio> listaSocios() {
		EntityManager em = ConexionJPA.getEntityManager();
		TypedQuery<Socio> consulta = (TypedQuery<Socio>) em.createNamedQuery("Socio.findAll", Socio.class);
		List<Socio> listaSocios = consulta.getResultList();
		return listaSocios;
	}

	public static long cantidadSocios() {
		EntityManager em = ConexionJPA.getEntityManager();
		Query consulta = em.createQuery("select count(s) from Socio s");
		Long totalSocios = (Long) consulta.getSingleResult();
		em.close();
		return totalSocios;
	}
	
	public static ArrayList<String> actualizar(Socio s_form) {
		ArrayList<String> mensajes = new ArrayList<String>();
		EntityManager em = ConexionJPA.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		Socio original = socioPorId(s_form.getIdsocio());
		
		
		if(!s_form.getNombre().equals(original.getNombre())) {
			original.setNombre(s_form.getNombre());
			mensajes.add("El nombre ha sido actualizado.");
		}
		
		if(!s_form.getDireccion().equals(original.getDireccion())) {
			original.setDireccion(s_form.getDireccion());
			mensajes.add("la dirección ha sido actualizada.");
		}
		
		if(!s_form.getEmail().equals(original.getEmail())) {
			original.setEmail(s_form.getEmail());
			mensajes.add("El email ha sido actualizado.");
		}
		
		tx.begin();
		em.merge(original);
		tx.commit();

		return mensajes;
	}

}
