package Ejercicios_de_repaso;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		int numero;
		int factorial = 1;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introduce un numero menor que 15 y mayor que 0");
			numero = sc.nextInt();

			if (numero < 0 || numero > 15)
				System.out.println("No es un numero valido");
		} while (numero < 0 || numero > 15);

		int aux = numero;

		while (aux > 0) {

			factorial *= aux;
			aux--;

		}

		System.out.println("El factorial de " + numero + " es " + factorial);

	}
}
