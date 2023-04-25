package logicas.aulas05;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Me diga seu nome");
		String nome = entrada.nextLine();


		System.out.println("▪ [ M ] para masculino");
		System.out.println("▪ [ F ] para feminino");
		System.out.println("▪ [ O ] outro");
		System.out.println("▪ [ N ] não responder");
		System.out.println("");
		System.out.println("");
		System.out.println("EScolha uma Letra: ");
		

		String M = "masculino";
		String F = "feminino";
		String O = "Outro";
		String N = "não responder";
		
		String retornoFinal = "";
		
		char genero = entrada.nextLine().charAt(0);
//		
//		if (genero == 'M') {
//			retornoFinal = M;
//			
//		} else if (genero == 'F') {
//			retornoFinal = F;
//			
//		}else if (genero == 'O') {
//			retornoFinal = M;
//		
//		}else if (genero == 'N') {
//			retornoFinal = N;
//			
//		}else{
//		System.out.println("Opção Invalida.");
//		}
		
	

		System.out.println("Olá " + nome + "você escolhei a seguinte opção de Gereno: " + retornoFinal);
		
		entrada.close();
		
	}

}
