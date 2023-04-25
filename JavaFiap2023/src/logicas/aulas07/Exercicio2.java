package logicas.aulas07;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double nota1, nota2;

		do {
			System.out.println("Digite a primeira nota:");
			nota1 = sc.nextDouble();
		} while (nota1 < 0 || nota1 > 10);
		
		do {
			System.out.println("Digite a Segunda nota:");
			nota2 = sc.nextDouble();
		} while (nota2 < 0 || nota2 > 10);
		
		double media = (nota1 + nota2) / 2;
		
		System.out.println("Media: " + media);
		
		
		
		
		
		
	}

}
