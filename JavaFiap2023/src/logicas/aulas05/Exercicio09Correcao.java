package logicas.aulas05;

import java.util.Scanner;

public class Exercicio09Correcao {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um numero (0-999)");
		int num = entrada.nextInt();

		System.out.println("");
		System.out.println("Valor digite: " + num);

		int centena = (num / 100) * 100;
		System.out.println("Centena = " + centena);

		int restoDezena = num - centena;

		System.out.println(restoDezena);

		int dezena = (restoDezena / 10) * 10;
		System.out.println("Dezena =" + dezena);

		int unidade = restoDezena = dezena;
		System.out.println("Unidade " + unidade);
	}

}
