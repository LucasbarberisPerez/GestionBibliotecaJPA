package tools;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Formateo {
	
	public static Date formatoSqlDate(String fecha) {
		return java.sql.Date.valueOf(fecha);
	}
	
	public static String toMayuscula(String str) {
		String strFormateado = str.toUpperCase();
		return strFormateado;
	}
	
}
