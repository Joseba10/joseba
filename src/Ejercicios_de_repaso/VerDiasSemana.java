package Ejercicios_de_repaso;

public class VerDiasSemana {

	public static void main(String[] args) {
		for (DiasSemana dia : DiasSemana.values())
			System.out.printf("Nº %d nombre %s identificador %s\n", dia.nJornada, dia.nombre(), dia);
		// Printf se refiere a String.format
	}

}
