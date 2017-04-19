package Ejercicios_de_repaso;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Repaso {

	public static void main(String[] args) {

		/*
		 * Solicita al usuario un numero entero mayor de 10 y menor de 30,repita la
		 * operacion hasta que se cumpla
		 * 
		 * Mostrar si el numero es divisible entre 5 Solicitar un numero al usuario y
		 * enseñar por pantalla el numero de caracteres del nombreel carater inicial y el
		 * finalMostrar el nombre de todos los caracteres en mayusculaMostrar el nombre de
		 * todos los caracteres en minusculaIndicar al usuario si el nombre tiene la letra
		 * ñ
		 */
		String nombre = "";
		int numero;
		boolean tieneÑ = false;

		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

		/*
		 * Solicita un numero y no termina hasta que el numero sea mayor de 10 y menor de
		 * 30
		 */

		try {
			do {
				System.out.println("Teclea un numero mayor 10 y menor que 30");
				nombre = teclado.readLine();
				numero = Integer.parseInt(nombre);

			} while (numero <= 10 || numero >= 30);

			if (numero % 5 == 0) {
				System.out.println("El numero " + numero + " es divisible por 5");

			} else {
				System.out.println("El numero " + numero + " no es divisible por 5");
			}

			System.out.println("Escribe tu nombre ");
			nombre = teclado.readLine();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Tu nombre tiene " + nombre.length() + " caracteres");
		System.out.println("Empieza por la letra " + nombre.charAt(0));
		System.out.println("Termina por la letra " + nombre.charAt(nombre.length() - 1));

		for (numero = 0; numero < nombre.length(); numero++) {

			if (nombre.charAt(numero) == 'ñ' || nombre.charAt(numero) == 'Ñ') {
				tieneÑ = true;
			}
		}
		System.out.println("Tu nombre en mayusculas es: " + nombre.toUpperCase());
		System.out.println("Tu nombre en minusculas es: " + nombre.toLowerCase());

		if (tieneÑ)
			System.out.println("Tu nombre tiene ñ");
		else
			System.out.println("Tu nombre no tiene ñ");
	}

}
