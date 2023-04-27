package logicas.aulas09;

public class Vetor {

	public static void main(String[] args) {

		int[] numeros = { 10, 20, 5, 3 };
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("Pos: -- Valor> %d\n", i, numeros[i]);
		}

		// um for um pouquinho diferente....
		for (int num : numeros) {
			if (num != 20) {
				System.out.println(num);
			}
		}

	}
}