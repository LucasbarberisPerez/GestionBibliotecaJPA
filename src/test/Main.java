package test;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import dao.AutorDao;
import dao.SocioDao;
import entidades.Autor;
import entidades.Socio;
import herramientas.ConexionJPA;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Autor> lista = AutorDao.listaAutoresPaginado(5, 5); // sacar el registro de la posicion 6 y saca el 6 y el 7.
		
	
		for (Autor autor : lista) {
			System.out.println(autor.getNombre());
		}
		System.out.println("Tamaño: "+lista.size());
		
	}

}
