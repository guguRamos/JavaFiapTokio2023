package logicas.aulas07;

import java.util.Scanner;

public class ForLacoExercicio {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		System.out.println("Digite a quantidade de produtos:");
		int qtdProdutos = tec.nextInt();

		for (int i = 0 ; i <= qtdProdutos; i++) {
			System.out.println("Produto " + i);
		}
	}

}
