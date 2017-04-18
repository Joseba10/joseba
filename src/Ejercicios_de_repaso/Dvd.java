package Ejercicios_de_repaso;

public class Dvd {

	String titulo;
	String director;
	String actoresPrincipales;
	int duracion;
	String resumen;
	String genero;

	Dvd(String titulo, String director, String actoresprincipales, int duracion, String resumen, String genero) {

		this.titulo = titulo;
		this.director = director;
		this.actoresPrincipales = actoresprincipales;
		this.duracion = duracion;
		this.resumen = resumen;
		this.genero = genero;

	}

	boolean esThriller() {
		return genero.equals("Thriller");
	}

	boolean tieneResumen() {
		return resumen.length() > 0;
	}

	String muestraDuracion() {
		return duracion + " min.";
	}

	String muestraDVDCine() {

		return titulo.toUpperCase() + "\nDE:" + director + " \nCon: " + actoresPrincipales + "\nDuracion " + muestraDuracion() + " \nGenero " + genero + " \nResumen: " + resumen;
	}
}
