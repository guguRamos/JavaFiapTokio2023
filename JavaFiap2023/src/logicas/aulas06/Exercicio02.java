package logicas.aulas06;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero n:");

		int n = sc.nextInt();

		int i = 1;

		while (i <= n) {
			System.out.println(i);
			i++;
		}

	}

}
