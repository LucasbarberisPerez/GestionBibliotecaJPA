package entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the EJEMPLAR database table.
 * 
 */
@Entity
@NamedQuery(name="Ejemplar.findAll", query="SELECT e FROM Ejemplar e")
public class Ejemplar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long idejemplar;

	private String baja;

	//bi-directional many-to-one association to Devolucion
	@OneToMany(mappedBy="ejemplar")
	private List<Devolucion> devoluciones;

	//bi-directional many-to-one association to Libro
	@ManyToOne
	@JoinColumn(name="ISBN")
	private Libro libro;

	//bi-directional one-to-one association to Prestamo
	@OneToOne(mappedBy="ejemplar")
	private Prestamo prestamo;

	public Ejemplar() {
	}

	public long getIdejemplar() {
		return this.idejemplar;
	}

	public void setIdejemplar(long idejemplar) {
		this.idejemplar = idejemplar;
	}

	public String getBaja() {
		return this.baja;
	}

	public void setBaja(String baja) {
		this.baja = baja;
	}

	public List<Devolucion> getDevoluciones() {
		return this.devoluciones;
	}

	public void setDevoluciones(List<Devolucion> devoluciones) {
		this.devoluciones = devoluciones;
	}

	public Devolucion addDevolucione(Devolucion devolucione) {
		getDevoluciones().add(devolucione);
		devolucione.setEjemplar(this);

		return devolucione;
	}

	public Devolucion removeDevolucione(Devolucion devolucione) {
		getDevoluciones().remove(devolucione);
		devolucione.setEjemplar(null);

		return devolucione;
	}

	public Libro getLibro() {
		return this.libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Prestamo getPrestamo() {
		return this.prestamo;
	}

	public void setPrestamo(Prestamo prestamo) {
		this.prestamo = prestamo;
	}

	@Override
	public String toString() {
		return "Ejemplar [idejemplar=" + idejemplar + ", baja=" + baja + ", devoluciones=" + devoluciones + ", libro="
				+ libro + ", prestamo=" + prestamo + "]";
	}
	
	

}