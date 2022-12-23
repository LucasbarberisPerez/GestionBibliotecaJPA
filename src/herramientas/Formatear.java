package herramientas;

import java.sql.Date;

public class Formatear {

	public static Date sqlDate(String fecha) {
		return java.sql.Date.valueOf(fecha);
	}

	public static String mayuscula(String str) {
		String strFormateado = str.toUpperCase();
		return strFormateado;
	}

}
