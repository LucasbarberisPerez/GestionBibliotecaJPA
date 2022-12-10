package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the SOCIO database table.
 * 
 */
@Entity
@NamedQuery(name="Socio.findAll", query="SELECT s FROM Socio s order by s.nombre")
@NamedQuery(name ="Socio.sociosPorNombre", query = "select s from Socio s where UPPER(s.nombre) LIKE UPPER(:nombresocio)")
public class Socio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SOCIO_IDSOCIO_GENERATOR", sequenceName="S_SOCIO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SOCIO_IDSOCIO_GENERATOR")
	private long idsocio;

	private String direccion;

	private String email;

	private String nombre;

	@Version
	private int version;

	//bi-directional many-to-one association to Devolucion
	@OneToMany(mappedBy="socio")
	private List<Devolucion> devoluciones;

	//bi-directional many-to-one association to Prestamo
	@OneToMany(mappedBy="socio")
	private List<Prestamo> prestamos;

	//bi-directional one-to-one association to Sociopenalizado
	@OneToOne(mappedBy="socio")
	private Sociopenalizado sociopenalizado;

	public Socio() {
	}

	public long getIdsocio() {
		return this.idsocio;
	}

	public void setIdsocio(long idsocio) {
		this.idsocio = idsocio;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public List<Devolucion> getDevoluciones() {
		return this.devoluciones;
	}

	public void setDevoluciones(List<Devolucion> devoluciones) {
		this.devoluciones = devoluciones;
	}

	public Devolucion addDevolucione(Devolucion devolucione) {
		getDevoluciones().add(devolucione);
		devolucione.setSocio(this);

		return devolucione;
	}

	public Devolucion removeDevolucione(Devolucion devolucione) {
		getDevoluciones().remove(devolucione);
		devolucione.setSocio(null);

		return devolucione;
	}

	public List<Prestamo> getPrestamos() {
		return this.prestamos;
	}

	public void setPrestamos(List<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

	public Prestamo addPrestamo(Prestamo prestamo) {
		getPrestamos().add(prestamo);
		prestamo.setSocio(this);

		return prestamo;
	}

	public Prestamo removePrestamo(Prestamo prestamo) {
		getPrestamos().remove(prestamo);
		prestamo.setSocio(null);

		return prestamo;
	}

	public Sociopenalizado getSociopenalizado() {
		return this.sociopenalizado;
	}

	public void setSociopenalizado(Sociopenalizado sociopenalizado) {
		this.sociopenalizado = sociopenalizado;
	}

}