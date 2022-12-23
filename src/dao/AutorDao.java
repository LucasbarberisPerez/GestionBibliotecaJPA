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
import herramientas.Ordenar;

public class AutorDao {
	/*
	 * Los metodos de esta clase estan limpios, las excepciones se lanzarán en momento de ejecucion.
	 */
	
	public static void insertarAutor(Autor a) {
		if (a != null) {
			EntityManager em = ConexionJPA.getEntityManager();
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			em.persist(a);
			tx.commit();
			em.close();
		}
	}

	public static ArrayList<Autor> listaAutores() {
		EntityManager em = ConexionJPA.getEntityManager();
		List<Autor> lista = em.createNamedQuery("Autor.findAll", Autor.class).getResultList();
		ArrayList<Autor> listaAutores = new ArrayList<Autor>(lista);
		listaAutores = Ordenar.ordernarListaAutoresPorId(listaAutores);
		em.close();
		return listaAutores;
		
	}
	
	
	public static ArrayList<Autor> listaAutoresPaginado(int inicio, int registrosTotales) {
		EntityManager em = ConexionJPA.getEntityManager();
		TypedQuery<Autor> query = em.createNamedQuery("Autor.findAll",Autor.class);
        query.setFirstResult(inicio);
        query.setMaxResults(registrosTotales);
		List<Autor> lista = (List<Autor>)query.getResultList();
		ArrayList<Autor> listaAutores = new ArrayList<Autor>(lista);
		
		
		listaAutores = Ordenar.ordernarListaAutoresPorId(listaAutores);
		em.close();
		return listaAutores;
		
	}
	
	public static long totalAutores() {
		EntityManager em = ConexionJPA.getEntityManager();
		Query query = em.createNamedQuery("Autor.countAll",Autor.class);
		long totalAutores = (long)query.getSingleResult();
		em.close();
		return totalAutores;
	
	}

}
