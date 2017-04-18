package Ejercicios_de_repaso;

public enum DiasSemana {

	L(1, "Lunes"), M(2, "Martes"), X(3, "Miercoles"), J(4, "Jueves"), V(5, "Viernes"), S(6, "Sabado"), D(7, "Domingo");

	String nombre;
	int nJornada;

	DiasSemana(int n, String nombre) {
		nJornada = n;
		this.nombre = nombre;
	}

	int jornada() {
		return nJornada;
	}

	String nombre() {
		return nombre;
	}

}
