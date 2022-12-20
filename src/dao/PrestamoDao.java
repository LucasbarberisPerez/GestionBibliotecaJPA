package dao;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entidades.Ejemplar;
import entidades.Prestamo;
import entidades.Socio;
import herramientas.ConexionJPA;
import herramientas.Fechas;

public class PrestamoDao {
	
	public static void insertarPrestamo(long idejemplar, long idsocio) {
		//TODO: insertar el prestamo teniendo en cuenta que el socio y el ejemplar existan
		//tener en cuenta que tambien no puede tener 2 prestamos con el mismo ejemplar.
		EntityManager em = ConexionJPA.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		Socio s = SocioDao.buscarSocioPorId(idsocio);
		Ejemplar e = EjemplarDao.buscarEjemplarPorId(idejemplar);
		
		if(s != null && e != null){
			
			Prestamo p = new Prestamo();
			
			p.setEjemplar(e);
			p.setSocio(s);
			p.setFechaprestamo(Fechas.devolverFechaActual());
			p.setFechalimitedevolucion(Fechas.devolverFechaLimite(p.getFechaprestamo()));
			p.setIdejemplar(e.getIdejemplar());
			tx.begin();
			
			em.persist(p);
			tx.commit();
			
			
		}else {
			System.out.println("No se va a insertar ningún prestamo.");
		}
		em.close();
	}
	
	
}
