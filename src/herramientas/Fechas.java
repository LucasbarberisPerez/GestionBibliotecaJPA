package herramientas;

import java.sql.Date;
import java.time.LocalDate;

public class Fechas {
	
	public static Date devolverFechaActual() {
		return Date.valueOf(LocalDate.now());
		
	}
	
	public static Date devolverFechaLimite(Date primeraFecha) {
		LocalDate fechaAux = primeraFecha.toLocalDate();
		LocalDate resultado = fechaAux.plusDays(15);
		return Date.valueOf(resultado);
	}

}
