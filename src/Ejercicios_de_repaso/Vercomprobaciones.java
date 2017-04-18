package Ejercicios_de_repaso;

import java.util.Scanner;

public class Vercomprobaciones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nIntroduce un numero entero");
		int numero = sc.nextInt();
		Comprobaciones co = new Comprobaciones();
		System.out.println((co.esPrimo(numero) ? " Es " : " No es ") + "primo, ");
		System.out.println((co.esCapicua(numero) ? " Es " : " No es ") + "Capicua, ");
		System.out.println((co.esPar(numero) ? " Es " : " No es ") + "Par, ");
		System.out.println((co.esAntiguo(numero) ? " Es " : " No es ") + " Menor de 1900, ");
		System.out.println((co.esBisiesto(numero) ? " Es " : " No es ") + "Bisiesto, ");
		System.out.println((co.estaIntervalo(500, 1000, numero) ? " Es " : " No esta ") + "en el intervalo 500-1000, ");
		System.out.println((co.esTriangulo(50, 100, numero) ? " Forma " : " No forma ") + "triangulo con 50 y 100 ");
		System.out.println("\n El numero introducido es: " + numero);
	}

}
