package herramientas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entidades.Autor;

public class Ordenar {

	public static ArrayList<Autor> ordernarListaAutoresPorId(ArrayList<Autor> listaDesordenada) {
		List<Autor> listaOrdenada = listaDesordenada;
		Collections.sort(listaOrdenada, (Autor a1, Autor a2) -> Long.compare(a1.getIdautor(), a2.getIdautor()));
		return (ArrayList<Autor>)listaOrdenada;
	}

}
