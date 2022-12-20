package test;

import dao.EjemplarDao;
import dao.SocioDao;
import entidades.Ejemplar;
import entidades.Prestamo;
import entidades.Socio;
import herramientas.Fechas;

public class TestInsercionPrestamo {

	public static void main(String[] args) {
		Socio s = SocioDao.buscarSocioPorId(2l);
		Ejemplar e = EjemplarDao.buscarEjemplarPorId(3l);
		System.out.println(s.toString());
		System.out.println(e.toString());

		Prestamo p = new Prestamo();

		p.setEjemplar(e);
		p.setFechaprestamo(Fechas.devolverFechaActual());
		p.setFechalimitedevolucion(Fechas.devolverFechaLimite(p.getFechaprestamo()));
		p.setSocio(s);
		System.out.println("Exito al insertar ejemplar");

	}

}
