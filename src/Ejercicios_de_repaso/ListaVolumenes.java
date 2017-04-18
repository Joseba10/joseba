package Ejercicios_de_repaso;

import java.io.File;

public class ListaVolumenes {

	public static void main(String[] args) {
		File f = new File("");
		File[] lista2 = f.listRoots();

		for (int i = 0; i < lista2.length; i++)
			System.out.println(lista2[i] + "");

	}

}
