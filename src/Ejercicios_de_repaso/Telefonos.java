package Ejercicios_de_repaso;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Telefonos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre;

		try {
			FileWriter fls = new FileWriter("C:\\JAVA\\Agenda.txt");
			BufferedWriter fs = new BufferedWriter(fls);

			do {
				System.out.println("Introduce un nombre(Intro para terminar):");
				nombre = sc.nextLine();

				if (nombre.length() > 0) {
					System.out.println("Telefono: ");
					String telefono = sc.nextLine();
					fs.write("Nombre " + nombre + "," + " Telefono " + telefono);
					fs.newLine();

				}
			} while (nombre.length() > 0);
			fs.close();
		} catch (IOException e) {
			System.out.println("Error en el fichero");
		}

	}

}
