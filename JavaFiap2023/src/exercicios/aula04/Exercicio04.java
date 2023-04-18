package exercicios.aula04;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);	
		
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();//nesxtLine pegua um texto digitado;
		
		System.out.println("Digite seu idade: ");
		int idade = entrada.nextInt();//nextInt pegua numero;
		
		System.out.println("Ola, " +nome+ ". Você tem " + idade+ " anos.");
	}

}