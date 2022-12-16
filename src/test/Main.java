package test;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entidades.Ejemplar;
import herramientas.ConexionJPA;

public class Main {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		
		LocalDate ld2 = ld.plusDays(15);
		
		System.out.println(ld);
		System.out.println(ld2);
		
		
	}

}
