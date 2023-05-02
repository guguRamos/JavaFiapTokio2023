package logicas.aulas10;

import java.util.Scanner;

public class MetodoComArgumento {

	// METODOS SEM RETORNO COM ARGUMENTOS/PARAMETROS
	static void saudacaoComArgs(String nome, int idade) {

		if (idade >= 18) {

			System.out.printf("Ola, %s Você tem %d anos e é maior de idade", nome, idade);
		} else {
			System.out.println("Olá %d Voc~e é maior de idade");
		}

	}
	static void somar(int numA, int numB) {
		System.out.println("Soma: " + (numA + numB));
	}
	

	public static void main(String[] args) {
		
		somar(10, 2);
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Digite seu nome: ");
//		String nomeDig = sc.nextLine();
//
//		System.out.println("Digite sua idade");
//		int idadeDig = sc.nextInt();
//
//		saudacaoComArgs(nomeDig, idadeDig);
//
//		sc.close();
	}

}
