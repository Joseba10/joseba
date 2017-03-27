package misejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ejemplo002 {

	public static void main(String[] args) throws IOException {

		// entradaClasica();
		// ejemplodiagrama();

		int a = leerNumero("A:");
		int b = leerNumero("B");
		System.out.println("La suma de a y b es:" + (a + b));

	}

	private static int leerNumero(String mensaje) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String linea = "0";

		do {
			if (!linea.matches("\\d+")) // el * = 0 o mas y el + 1 o mas
										// (Si linea no coincide con el numero) Match es
										// coincidir

				System.out.println("Debes poner un numero");
			System.out.println(mensaje);
			linea = br.readLine(); // Recoge el dato

		} while (!linea.matches("\\d*"));

		int numero = Integer.parseInt(linea); // Convertir a numero
		return numero;

	}

	private static void ejemplodiagrama() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String linea = "0";

		do {
			if (!linea.matches("\\d*")) // Si no es un numero

				System.out.println("Debes poner un numero");

			System.out.println("Tienes que meter un numero");

			linea = br.readLine(); // Recoge el dato

		} while (!linea.matches("\\d*"));

		int num = Integer.parseInt(linea); // Convertir a numero

	}

	private static void entradaClasica() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String linea = br.readLine();

		if (linea.matches("\\d*"))
			System.out.println("Numero x2:" + (Integer.parseInt(linea) * 2));
		else
			System.out.println("No es un numero");

	}

	private static void entradaConsola()

	{
		Scanner s = new Scanner(System.in);

	}

}
