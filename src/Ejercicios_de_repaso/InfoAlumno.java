package Ejercicios_de_repaso;

public class InfoAlumno {
	private int np;
	private String nombre;
	private double nota1;
	private double nota2;

	public InfoAlumno(int np, String nombre) {

		this.np = np;
		this.nombre = nombre;
	}

	public void Ponnotas(double nota1, double nota2) {
		this.nota1 = nota1;
		this.nota2 = nota2;

	}

	public double dameMedia() {

		return (nota1 + nota2) / 2;
	}

	public String muestraAlumno() {

		return np + " " + nombre + " nota media " + dameMedia();
	}

}
