package logicas.aulas05;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		double peso;
		double peso2;
		double mediaPonderada;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a primeira nota1: ");
		double A = entrada.nextDouble();

		System.out.println("Digite a primeira nota2: ");
		double B = entrada.nextDouble();

		peso = A * 0.4;
		peso2 = B * 0.6;

		mediaPonderada = (peso + peso2);

		System.out.println("Sua media é: " + mediaPonderada);

	}

}
