package logicas.aulas05;

import java.util.Scanner;

public class manipulacao {

	public static void main(String[] args) {

		double salario = 1300.50;
		String salarioStr = Double.toString(salario);

		System.out.println(salarioStr.getClass());
		System.out.println(" ");

		String idade = "25";

		int idadeInt = Integer.parseInt(idade);

		System.out.println(idadeInt);

		System.out.println(" ");

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o preço do produto: ");

		String preco = entrada.nextLine();

		float precoFloat = Float.parse();

		System.out.println(precoFloat);

	}

}
















