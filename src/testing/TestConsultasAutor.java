package testing;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import entities.Autor;
import tools.ConexionJPA;

public class TestConsultasAutor {
	public static void main(String[] args) {
		EntityManager em = ConexionJPA.getEntityManager();
		String query = "select a from Autor a where a.idautor<=3";
		TypedQuery<Autor> consulta = em.createQuery(query, Autor.class);
		List<Autor> autores = (List<Autor>) consulta.getResultList();

		for (Autor autor : autores) {
			System.out.println(autor.toString());
		}

	}
}