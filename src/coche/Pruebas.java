package coche;

public class Pruebas {

	public static void main(String[] args) {

		Empleados trabajador1 = new Empleados("Paco");
		Empleados trabajador2 = new Empleados("Ana");
		Empleados trabajador3 = new Empleados("Fernando");
		trabajador1.cambiaSeccion("Recursos Humanos");

		System.out.println(trabajador1.devuelveDatos() + "\n" + trabajador2.devuelveDatos() + "\n" + trabajador3.devuelveDatos());
		System.out.println(Empleados.DameSiguiente());
	}
}

class Empleados {

	private final String nombre;
	private String seccion;
	private int id;
	private static int IdSiguiente = 1;

	public Empleados(String nom) {

		nombre = nom;

		seccion = "Administracion";
		id = IdSiguiente;

		IdSiguiente++;

	}

	public void cambiaSeccion(String seccion) {// Setter

		this.seccion = seccion;
	}

	public String devuelveDatos() { // getter

		return "El nombre es: " + nombre + " y la seccion es " + seccion + " El id es " + id;
	}

	public static String DameSiguiente() {

		return "El IdSiguiente es:" + IdSiguiente;
	}
}
