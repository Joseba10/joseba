package Ejercicios_de_repaso;

public class Comprobaciones {

	boolean esSimetrico(String texto) {

		boolean esSimetrico = false;

		for (int i = 0; i < texto.length(); i++)
			if (texto.charAt(i) != texto.charAt(texto.length() - i - 1))
				return false;

		return true;
	}

	boolean esCapicua(int numero) {

		return esSimetrico(numero + "");
	}

	boolean esPrimo(int numero) {

		for (int i = 1; i < numero / 2; i++)
			if (numero % i == 0)
				return false;

		return true;
	}

	boolean esPar(int numero) {
		return numero % 2 == 0;
	}

	boolean esAntiguo(int año) {
		return año < 1900;
	}

	boolean esTriangulo(double a, double b, double c) {
		return a < b + c && b < a + c && c < b + a;
	}

	boolean estaIntervalo(int menor, int mayor, int numero) {
		return (numero > menor) && (numero < mayor);

	}

	boolean esPositivo(int numero) {
		return numero > 0;
	}

	boolean esBisiesto(int año) {
		return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
	}
}
