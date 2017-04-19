package Ejercicios_de_repaso;

import java.util.Arrays;

public class Ordena {

	public static void main(String[] args) {
		double[] numeros = { 3.2, 90.12, 53.2, 1.9, 523.2, 1.1 };

		System.out.println("Antes de la ordenacion");

		for (double numero : numeros)
			System.out.println(numero + " ");
		Arrays.sort(numeros);
		System.out.println("\nDespues de la ordenacion");

		for (double numero : numeros)
			System.out.println(numero + " ");

	}

}
