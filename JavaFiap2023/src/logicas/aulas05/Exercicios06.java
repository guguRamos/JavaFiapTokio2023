package logicas.aulas05;

import java.util.Scanner;

public class Exercicios06 {

	public static void main(String[] args) {

		double peça1 = 20.0;
		double peça2 = 50.0;
		double quantFinalpeça1;
		double quantFinalpeça2;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a quantidade de peças1 que deseja: ");
		float quantidade = entrada.nextFloat();

		System.out.println("Digite a quantidade peça2 que deseja: ");
		float quantidade2 = entrada.nextFloat();

		quantFinalpeça1 = quantidade * peça1; 
		quantFinalpeça2 = quantidade2 * peça2;
		
		
		System.out.println("Peça1");
		System.out.println("O valor unitario de cada peça1 é: " + peça1);
		System.out.println("Quantidade de peças1 que o cliente desejou: " + quantidade);
		System.out.println("Quantidade a pagar da primeira peça1: " + quantFinalpeça1);
		System.out.println("");
		System.out.println("Peça2");
		System.out.println("O valor unitario de cada peça2 é: " + peça2);
		System.out.println("Quantidade de peças1 que o cliente desejou: " + quantidade2);
		System.out.println("Quantidade a pagar da primeira peça2: " +quantFinalpeça2 );

	}

}
