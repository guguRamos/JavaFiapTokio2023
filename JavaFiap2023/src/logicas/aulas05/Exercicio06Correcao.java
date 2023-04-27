package logicas.aulas05;

import java.util.Scanner;

public class Exercicio06Correcao {
	
	public static void main (String []args) {
		
		Scanner entrada = new Scanner (System.in);
	
		
		System.out.print("Digite peça1");
		String nomepeca1 = entrada.nextLine();
		
		System.out.println("Escolha a quantidade de peca1:  ");
		int qtdPecas1 = Integer.parseInt(entrada.nextLine());
		
		System.out.println("Valor unitario: ");
		double ValorPeca1 = Double.parseDouble(entrada.nextLine());
		
		//PEÇA 2
		System.out.print("Digite peça2");
		String nomepeca2 = entrada.nextLine();
		
		System.out.println("Escolha a quantidade de peca2:  ");
		int qtdPecas2 = Integer.parseInt(entrada.nextLine());
		
		System.out.println("Valor unitario: ");
		double ValorPeca2 = Double.parseDouble(entrada.nextLine());
		
		double valorPago1 = qtdPecas1 + ValorPeca1;
		double valorPago2 = qtdPecas2 + ValorPeca2;
		
		double valorTotal = valorPago1 + valorPago2;
		
		System.out.println("Valor a ser pago pela peca 1: %.", ValorPago1);

		
	}

}
