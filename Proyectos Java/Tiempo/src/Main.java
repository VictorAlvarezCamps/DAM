import java.util.Calendar;
import java.util.Date;

public class Main {
	
	//Tienes la clase date que esta obsoleta o deprecada (que ya no se actualiza) y tienes la 
	//clase SimpleDateFormat. Esta última no tiene mucha pérdida tampoco ya que es muy parecida a Date.
	//El resto de clases o librerias de terceros serán parecidas o añadiran alguna tontería mas..
	
	Date d = new Date();

	public static void main(String[] args) {
		
		Main m = new Main();
		
		m.ClaseDate();
		
	}
	
	public void ClaseDate(){
		
		//Date no se suele utilizar ya!Esta desfasado, sin actualizar los métodos
		
		//Declaramos las fechas que vayamos a utilizar
		
		Date fecha1,fecha2;
		
		int compara = 0;
		int dia;
		int mes;
		int anyo;
		int horas;
		int minutos;
		int segundos;
		Boolean antes;
		Boolean despues;
		String anyadeTiempo;
		
		
		fecha1 = new Date("10/11/2017");
		fecha2 = new Date("11/11/2017");
		
		//Podemos hacer lo siguiente con las fechas
		
		System.out.println("Clase Date");
		
		System.out.println("------------------------------");
		
		//Podemos sacar el tiempo que ha pasado de estos dias		
		
		System.out.println("La fecha de hoy es:"+fecha1+"y ha pasado de tiempo: "+fecha1.getTime());
		
		System.out.println("La fecha de mañana es:"+fecha2+"y ha pasado de tiempo: "+fecha2.getTime());
		
		
		//Podemos comparar 2 fechas
		
		compara = fecha1.compareTo(fecha2);
		
		System.out.println("La primera fecha es igual a la 2?:"+compara);
		
		//Podemos obtener dia, mes y año de la fecha que le pongamos
		
		dia = fecha1.getDate();
		
		mes = fecha1.getMonth();
		
		anyo = fecha1.getYear();
		
		System.out.println("Dia: "+dia+", Mes: "+mes+", Año: "+anyo);
		
		//Podemos obtener horas,minutos y segundos
		
		horas = fecha1.getHours();
		
		minutos = fecha1.getMinutes();
		
		segundos = fecha1.getSeconds();
		
		System.out.println("Horas: "+horas+", minutos: "+minutos+", Segundos: "+segundos);
		
		//Podemos saber si una fecha es anterior o despues a otra
		
		antes = fecha1.before(fecha2);
		
		despues = fecha1.after(fecha2);		
		
		System.out.println("Es anterior a la 2 fecha?: "+antes);
		
		System.out.println("Es posterior a la 2 fecha?: "+despues);
		
		//Podemos añadir dia, mes, año, horas, minutos o segundos a una fecha si queremos cambiarla
		
		//Substituye 1 por el numero que quieras
		
		fecha1.setYear(1);
		
		fecha1.setMonth(1);
		
		fecha1.setDate(1);
		
		fecha1.setHours(1);
		
		fecha1.setMinutes(1);
		
		fecha1.setSeconds(1);
		
		//saber si 2 fechas son iguales
		
		fecha1.equals(fecha2);
		
		//Puedes cambiar el formato de fecha al que te parezca
		
		//El formato que se suele utilizar de normal es el dd-mm-yyyy, de este ya puedes ir
		//cambiandolo a como quieras, incluso puedes ponerle horas minutos y segundos de esta
		//forma HH:mm:ss y este formato tambien puedes cambiarlo (Para que te aclares más es
		//simplemente un string al que le puedes poner el orden que quieras de como quieras verlo).
		//Tambien tienes la clase SimpleDateFormat que funciona casi de la misma forma que esta y creo
		//que esta clase si está actualizada...no creo que cambie mucho la sintaxis.
		
		fecha1.parse("");
		
		//Te pongo aqui varios formatos que puedes utilizar tambien utilizalos con un % delante a la hora
		//de imprimir por ejemplo System.out.printf("%s %tB %<te, %<tY", "Due date:", date);
		
		
		//		Character					Description								Example
		//			c					Complete date and time				Mon May 04 09:51:52 CDT 2009
		//			F						ISO 8601 date							2004-02-09
		//			D			U.S. formatted date (month/day/year)			02/09/2004
		//			T						24-hour time							18:05:19
		//			r						12-hour time							06:05:19 pm
		//			R						24-hour time, no seconds				18:05
		//			Y				Four-digit year (with leading zeroes)			2004
		//			y	Last two digits of the year (with leading zeroes)			04
		//			C	First two digits of the year (with leading zeroes)			20
		//			B						Full month name							February
		//			b					Abbreviated month name						Feb
		//			m				Two-digit month (with leading zeroes)			02
		//			d				Two-digit day (with leading zeroes)				03
		//			e				Two-digit day (without leading zeroes)			9
		//			A				Full weekday name								Monday
		//			a				Abbreviated weekday name						Mon
		//			j		Three-digit day of year (with leading zeroes)			069
		//			H	Two-digit hour (with leading zeroes), between 00 and 		23	18
		//			k	Two-digit hour (without leading zeroes), between 0 and 23	18
		//			I	Two-digit hour (with leading zeroes), between 01 and 12		06
		//			l	Two-digit hour (without leading zeroes), between 1 and 12	6
		//			M	Two-digit minutes (with leading zeroes)						05
		//			S	Two-digit seconds (with leading zeroes)						19
		//			L	Three-digit milliseconds (with leading zeroes)				047
		//			N	Nine-digit nanoseconds (with leading zeroes)			047000000
		//			P	Uppercase morning or afternoon marker						PM
		//			p	Lowercase morning or afternoon marker						pm
		//			z	RFC 822 numeric offset from GMT								-0800
		//			Z	Time zone													PST
		//			s	Seconds since 1970-01-01 00:00:00 GMT					1078884319
		//			Q	Milliseconds since 1970-01-01 00:00:00 GMT				1078884319047
		
		System.out.println("-------------------------------");	
		
	}
	

}
