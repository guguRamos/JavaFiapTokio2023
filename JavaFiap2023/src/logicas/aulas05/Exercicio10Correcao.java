package logicas.aulas05;

import java.util.Scanner;

public class Exercicio10Correcao {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int anos = entrada.nextInt();
		int meses = entrada.nextInt();
		int dias = entrada.nextInt();

		int qtdDias = (anos * 365) + (meses * 30) + dias;

		System.out.println("Qtd de dias vividas: " + qtdDias);
		
		entrada.close();

	}

}
