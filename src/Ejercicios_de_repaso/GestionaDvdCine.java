package Ejercicios_de_repaso;

import java.util.Scanner;

public class GestionaDvdCine {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Titulo de la pelicula");
		String titulo = sc.nextLine();

		System.out.println("Director:");
		String director = sc.nextLine();

		System.out.println("Actores:");
		String actores = sc.nextLine();

		System.out.println("Duracion en minutos");
		String minutos = sc.nextLine();
		minutoscine = minutos;

		System.out.println("Genero:");
		String genero = sc.nextLine();

		System.out.println("Resumen");
		String resumen = sc.nextLine();

		Dvd peli = new Dvd(titulo, director, actores, minutos, genero, resumen);

		System.out.println(peli.muestraDVDCine());
		System.out.println(peli.esThriller() ? "Es un Thriller" : "No es un Thriller");

		if (peli.tieneResumen())
			System.out.println("La ficha tiene resumen");

		else {
			System.out.println("No tiene Resumen");
		}

	}
}
