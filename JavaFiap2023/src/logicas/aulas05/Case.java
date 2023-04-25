package logicas.aulas05;

import javax.swing.JOptionPane;

public class Case {

	public static void main(String[] args) {

		String n1 = JOptionPane.showInputDialog(null, "Digite M para masculino\nF para feminino \n O para outro");
		switch (n1) {
		case "m":
			System.out.println("Seu sexo é mascunino");
			break;

		case "F":
			System.out.println("seu sexo é feminino");
			break;
			
		default:
			System.out.println("Erro");
			break;

		}
	}

}
