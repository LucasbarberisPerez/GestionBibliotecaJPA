package herramientas;

import java.sql.Date;

public class Formatear {

	public static Date formatoSqlDate(String fecha) {
		return java.sql.Date.valueOf(fecha);
	}

	public static String toMayuscula(String str) {
		String strFormateado = str.toUpperCase();
		return strFormateado;
	}

}
