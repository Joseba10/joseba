package Ejercicios_de_repaso;

import java.io.File;

public class ListaFicheros {

	public static void main(String[] args) {

		File canal = new File("C:\\JAVA\\workspace");
		File[] lista = canal.listFiles();

		for (int i = 0; i < lista.length; i++)
			System.out.println(lista[i]);

	}

}
