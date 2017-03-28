package misejercicios;

public class Ejemplo0011 {

	public static void main(String[] args) {

		// tipoDeDatos();
		estructurasDeControl();
	}

	private static void estructurasDeControl() {
		System.out.println("Estructuras de Control");

		boolean condicion = false;
		boolean condicion2 = true;

		if (condicion) {

			System.out.println("Condicion1");
		} else if (condicion2) {

			System.out.println("Condicion2");
		} else {

			System.out.println("Else");
		}

		int opcion = 3;

		switch (opcion) {
		case 1:
			System.out.println("Uno");
			break;
		case 2:
			System.out.println("Dos");
			break;

		default:
			System.out.println("Otros");

		}

		int mes = 6;
		int dias;

		switch (mes) {
		case 2:

			dias = 28;

			break;

		case 4:
		case 6:
		case 9:
		case 11:

			dias = 30;
			break;

		default:
			dias = 31;

		}
		System.out.println(dias);

		int c = 1;

		/*
		 * while(c <=10){
		 * 
		 * System.out.println(c++); //Incluye el uno System.out.println(++c); //No Incluye
		 * el uno }
		 */

		do {

			System.out.println(c++);
		} while (c <= 10);

		for (int n = 1; n <= 10; n++) {
			System.out.println("Entrada del for" + n);

		}

		for (int up = 1, down = 10; up < down; up += 2, down /= 2)
			System.out.format("%d,%d\n", up, down);

		System.out.println("C:\\nuevos\\trabajos"); // Tienes que poner dos
													// barras porque si nos se
													// activa
													// los comando asociados que
													// son: \n y \t

		int[] array = { 1, 2, 3, 4, 5 }; // Se usa cuando sabes cuanto va a
											// haber
											// Poner [] es para indicar que es
											// un array
		// int [] lluvias =new int[12]
		for (int i = 0; i < array.length; i++)

			System.out.println(array[i]);

		for (int dato : array)
			System.out.println(dato); // Es lo mismo que lo de arriba

		char[][] tablero;
		tablero = new char[8][8]; /*
								 * Creas dos estructuras, una parte de la estructura
								 * pertece a la otra estructura,64 huecos
								 */
		// Asigna los puntos
		for (int o = 0; o < tablero.length; o++)

			for (int p = 0; p < tablero[o].length; p++)

				tablero[o][p] = '.';
		/*
		 * Pones la letra p en la posicion 1 y la posicion 8
		 */

		int primeraFila = 0;
		int ultimaFila = tablero.length - 1; // Coge el ultimo valor del tablero
		int segundaFila = primeraFila + 1;
		int anteultimaFila = ultimaFila - 1;

		for (int o = 1; o < tablero.length; o++)
			if (o == segundaFila || o == anteultimaFila) {
				for (int p = 0; p < tablero[o].length; p++)

					tablero[o][p] = 'p';
			}

		char[] figuras = { 't', 'c', 'a', 'd', 'r', 'a', 'c', 't' };

		tablero[primeraFila] = figuras.clone(); // Coge y hace una copia por lo
												// que
		tablero[ultimaFila] = figuras.clone(); // cada variable aunque se
												// modifique
												// Sera modificada sin afectar a
												// la otra

		tablero[ultimaFila][1] = '.';

		/*
		 * Va poniendo los puntos en horizontal,gracias a print,si pones println hace un
		 * salto de linea y por tanto saldrian verticalmente
		 */
		for (int o = 0; o < tablero.length; o++) {
			for (int p = 0; p < tablero[o].length; p++)
				System.out.print(tablero[o][p]);
			System.out.println();
		}

	}

	@SuppressWarnings("unused")
	private static void tipoDeDatos() {
		// TODO Ejemplo de tipos de datos
		int i;
		int a, b;
		int z = 0;
		int g = 1, c = 2;
		i = 3;
		a = b = c;

		float f = 5.3f;
		double d = 5.3;

		boolean bool = true;
		char car = 'a'; // Solo un Caracter
		System.out.println(i + z + g + a + b + "");
		System.out.println("" + i + z + g + a + b); // Convierte a texto
		System.out.println("Prueba");

		int resto = 5 % 2;
		System.out.println("El resto de 5/2 es " + resto);

		int x = 3;

		System.out.println(1 <= x && x <= 10);

		x = -50;
		System.out.println(1 >= x || x >= 10);
		System.out.println(!(1 >= x || x >= 10));

		boolean estaDentrodelRango = (!(1 >= x || x >= 10));
		System.out.println(estaDentrodelRango ? "Si" : "No"); /*
															 * Si sale true sale Si, si no
															 * deja de leer y pone No
															 */
		int num1 = 3, num2 = 2;

		int max = num1 > num2 ? num1 : num2;
		System.out.println("El maximo de " + num1 + " y " + num2 + " es " + max);
		System.out.println(String.format("El maximo de  %d y %d es %d", num1, num2, max));

	}

}
