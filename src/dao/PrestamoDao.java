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
		EntityManager em = ConexionJPA.getEntityManager();
		EntityTransaction tx = em.getTransaction();

		Socio s = SocioDao.socioPorId(idsocio);
		Ejemplar e = EjemplarDao.buscarEjemplarPorId(idejemplar);

		if (s != null && e != null) {

			Prestamo p = new Prestamo();

			p.setEjemplar(e);
			p.setSocio(s);
			p.setFechaprestamo(Fechas.devolverFechaActual());
			p.setFechalimitedevolucion(Fechas.devolverFechaLimite(p.getFechaprestamo()));
			p.setIdejemplar(e.getIdejemplar());
			tx.begin();

			em.persist(p);
			tx.commit();

			System.out.println("Exito al insertar el prestamo.");
		} else {
			if (s == null) {
				System.err.println("El socio no existe.");
			} else {
				System.err.println("El ejemplar no existe.");
			}
		}
		em.close();
	}

}
