package logicas.aulas11;

public class MetodoComRet {

	static int somar(int a, int b) {
		int soma = a + b;
		return soma;

	}

	public static void main(String[] args) {

		int valorSoma = somar(2, 100);

		System.out.println(valorSoma);
	}
}