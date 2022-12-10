package testing;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class Fechas {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = "2022-12-14";
		
		Date fecha = sdf.parse(date);
		System.out.println(fecha);

		
		String fechaString = sdf.format(fecha);
		
		System.out.println(java.sql.Date.valueOf(fechaString));


	}

}
