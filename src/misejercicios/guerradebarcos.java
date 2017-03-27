package misejercicios;

import javax.swing.JOptionPane;

public class guerradebarcos {

	public static void main(String[] args) {
		// TODO Guerra de Barcos

		// Variables
		char[] misbarcos = { 1, 2, 3, 4 };
		char[] susbarcos = { 1, 2, 3, 4 };

		int intentos = 0;

		char[][] tablero;

		// Preguntas
		String alto = JOptionPane.showInputDialog("Introduce la altura");
		int altura = Integer.parseInt(alto);

		String ancho = JOptionPane.showInputDialog("Introduce la anchura");
		int anchura = Integer.parseInt(ancho);

		// Asignamos los datos recibidos a una variable
		int vertical = altura;
		int horizontal = anchura;

		// Vamos a sacar un numero aleatorio entre la variable introducida
		int ordenador = (int) (Math.random() * altura);
		int ordenador1 = (int) (Math.random() * anchura);

		// Cuanto va a medir el tablero
		tablero = new char[altura][anchura];

		// Asigna los puntos
		for (int o = 0; o < tablero.length; o++)

			for (int p = 0; p < tablero[o].length; p++)

				tablero[o][p] = '.';

		String vertical1 = JOptionPane.showInputDialog("Que posicion vertical quieres");

		int numero = Integer.parseInt(vertical1);
		/*
		 * Si no se cumple sigue repitiendose la pregunta en caso de que cumpla salta a la
		 * siguiente pregunta
		 */
		while (numero > altura) {

			JOptionPane.showMessageDialog(null, "No esta disponible");

			vertical1 = JOptionPane.showInputDialog("Que vertical quieres");
			numero = Integer.parseInt(vertical1);
		}

		String horizontal1 = JOptionPane.showInputDialog("Que posicion horizontal quieres");
		int numero2 = Integer.parseInt(horizontal1);
		// Se comprueba si la el valor introducido coincide con los valores de la variable

		while (numero2 > anchura) {

			{
				JOptionPane.showMessageDialog(null, "No esta disponible");
				horizontal1 = JOptionPane.showInputDialog("Que posicion horizontal quieres");
				numero2 = Integer.parseInt(horizontal1);
			}

		}

		tablero[numero][numero2] = 'U';

		tablero[ordenador][ordenador1] = 'O';

		if (misbarcos.length == 0 && susbarcos.length == 0) {

			System.out.println("Se acabo la partida");

		}

		if (ordenador == numero && ordenador1 == numero2) {
			System.out.println("Hundido");
		}

		// Se ejecuta el for y escribe todo lo obtenido
		for (int o = 0; o < tablero.length; o++) {
			for (int p = 0; p < tablero[o].length; p++)
				System.out.print(tablero[o][p]);
			System.out.println();
		}

	}
}
