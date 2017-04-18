package Ejercicios_de_repaso;

import java.util.Scanner;

public class VerAlumno {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("\nIntroduce tu nombre:");
		String nombre = sc.nextLine();
		System.out.println("Introduce el numero del alumno:");
		int numeroalumno = sc.nextInt();
		System.out.println("Introduce la primera nota:");
		double nota1 = sc.nextDouble();
		System.out.println("Introduce la segunda nota:");
		double nota2 = sc.nextDouble();

		InfoAlumno alum = new InfoAlumno(numeroalumno, nombre);
		alum.Ponnotas(nota1, nota2);
		System.out.println(alum.muestraAlumno());

	}

}
