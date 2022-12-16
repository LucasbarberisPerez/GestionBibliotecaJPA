package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import entidades.Autor;
import herramientas.ConexionJPA;
import herramientas.Ordenar;

public class AutorDao {

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

	public static ArrayList<Autor> obtenerListaAutores() {
		EntityManager em = ConexionJPA.getEntityManager();
		List<Autor> lista = em.createNamedQuery("Autor.findAll", Autor.class).getResultList();
		ArrayList<Autor> listaAutores = new ArrayList<Autor>(lista);
		listaAutores = Ordenar.ordernarListaAutoresPorId(listaAutores);
		em.close();
		return listaAutores;
		
	}

}
