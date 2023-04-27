package logicas.aulas05;

import java.util.Scanner;

public class Exercicio03Correcao {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		
		
		System.out.println("Selecione seu genero: ");
		System.out.println("▪ [ M ] para masculino");
		System.out.println("▪ [ F ] para feminino");
		System.out.println("▪ [ O ] outro");
		System.out.println("▪ [ N ] não responder");
		
		char genero = sc.nextLine().charAt(0);
	}

}
