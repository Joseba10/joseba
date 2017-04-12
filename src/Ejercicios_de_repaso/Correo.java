package Ejercicios_de_repaso;

import java.util.Scanner;

public class Correo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String correo;

		do {
			System.out.println("Introduce tu direccion de correo electronico");
			correo = sc.nextLine();
			if (correo.indexOf("@") < 0 || correo.length() < 3)
				System.out.println("Tu correo no es valido");
		} while (correo.indexOf("@") < 0 || correo.length() < 3);
		System.out.println("Tu direccion de correo electronico ha sido admitida");

	}

}
