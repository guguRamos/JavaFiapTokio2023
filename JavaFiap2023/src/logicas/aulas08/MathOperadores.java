package logicas.aulas08;

public class MathOperadores {

	public static void main(String[] args) {

		double PI = Math.PI;
		System.out.println(PI);

		System.out.println(Math.sqrt(225));

		System.out.println(Math.abs(-25));

		double num = 3.05;

		System.out.println(Math.ceil(num));
		System.out.println(Math.floor(num));
		System.out.println(Math.round(num));

		// -----------------------------------

		System.out.println("");
		double random = Math.random();
		System.out.println(random);

//		double multiplica = random * 5;
//		System.out.println(multiplica);
//		System.out.println(Math.ceil(multiplica));

		double min = 5;
		double maz = 10;

		double intervalo = random;

		System.out.println("Intervalo: " + intervalo);

	}

}
