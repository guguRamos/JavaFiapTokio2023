package logicas.aulas05;

import java.util.Scanner;

public class CorrecaoDesafia {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int IdadeEmDias = entrada.nextInt();

		int anos = (int) IdadeEmDias / 365;
		System.out.println("Idade em anos " + anos);

		int restoDias = IdadeEmDias % 356;
		System.out.println(restoDias);

		int meses = (int) restoDias / 30;
		System.out.println("Idade em meses: " + meses);

		int dias = restoDias % 30;
		System.out.println("Idade em dias: " + dias);
		
		entrada.close();
	}

}
