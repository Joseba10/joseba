package Ejercicios_de_repaso;

import java.util.Scanner;

public class VectoresEnteros {

	public static void main(String[] args) {
		int[] vector;
		String texto;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero de elementos");
		int elementos = sc.nextInt();
		vector = new int[elementos];
		System.out.println("Introduce " + elementos + "numeros enteros");

		for (int i = 0; i < vector.length; i++) {

			System.out.println("Elemento Nº" + (i + 1) + ":");
			vector[i] = sc.nextInt();
		}

		int mayor = vector[0];
		int menor = vector[0];
		int suma = 0;

		for (int v : vector) {
			if (mayor < v)
				mayor = v;
			if (menor > v)
				menor = v;
			suma += v;
		}

		System.out.println("\nElemento mayor: " + mayor);
		System.out.println("\nElemento menor: " + menor);
		System.out.println("\nSuma de todos: " + suma);

	}

}
