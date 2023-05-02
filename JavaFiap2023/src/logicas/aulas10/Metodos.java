package logicas.aulas10;

import java.util.Scanner;

public class Metodos {
	
	//MEOTODS SME RETORNO E SEM PARAMETRO


	static void saudacao() {
		System.out.println("Bem Vindo ao programa");

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();

		System.out.println("Digite sua idade");
		int idade = sc.nextInt();

		System.out.printf("Olá, %s! você tem %d anos \n", nome, idade);

		if (idade >= 18) {
			System.out.println("Maior de Idade");
		} else {
			System.out.println("Menor de idade");
		}
	}

	public static void main(String[] args) {

		saudacao();

	}

}
