package logicas.aulas06;

import java.util.Scanner;

public class Exercicio03Correcao {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double NotaA = entrada.nextDouble();
		double NotaB = entrada.nextDouble();
		double NotaC = entrada.nextDouble();
		double NotaD = entrada.nextDouble();

		double media = (NotaA + NotaB + NotaC + NotaD) /4 ;
		
		System.out.println("Media" + media);

//		if(media >=7 ) {
//			System.out.println("Aprovado");
//			
//		}else if (media >=5 && media <7);
//		System.out.println("Recuoeração");
//		}else {
//			
//		}
//	}
//
//}
