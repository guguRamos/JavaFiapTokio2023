package logicas.aulas08;

import java.util.Calendar;
import java.util.Date;

public class Datas {

	public static void main(String[] args) {

		Date data = new Date();
		System.out.println("Data Agora: " + data);

		Calendar c = Calendar.getInstance();

		System.out.println("Date e hora atual: " + c.getTime());

		System.out.println("Ano: " + c.get(Calendar.YEAR));
		System.out.println("Mes: " + c.get(Calendar.MONTH));
		System.out.println("Dia do mes: " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("Dia da semana: " + c.get(Calendar.DAY_OF_WEEK));

		int hora = c.get(Calendar.HOUR_OF_DAY);
		int minuto = c.get(Calendar.MINUTE);

		System.out.println("");
		System.out.println("Hora: " + hora);
		System.out.println("Minuto " + minuto);

	}

}
