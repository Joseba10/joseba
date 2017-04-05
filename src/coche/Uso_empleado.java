package coche;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_empleado {

	public static void main(String[] args) {

		// Un ejemplo de como hacerlo
		/*
		 * Empleado empleado1 = new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		 * Empleado empleado2 = new Empleado("Ana Lopez", 95000, 1995, 6, 2);
		 * Empleado empleado3 = new Empleado("Maria Martin", 105000, 2002, 3,
		 * 15);
		 * 
		 * empleado1.subeSueldo(5); empleado2.subeSueldo(5);
		 * empleado3.subeSueldo(5); System.out.println("Nombre: " +
		 * empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo() +
		 * " Fecha de Alta " + empleado1.dameFechaContrato());
		 * System.out.println("Nombre: " + empleado2.dameNombre() + " Sueldo: "
		 * + empleado2.dameSueldo() + " Fecha de Alta " +
		 * empleado2.dameFechaContrato()); System.out.println("Nombre: " +
		 * empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo() +
		 * " Fecha de Alta " + empleado3.dameFechaContrato());
		 */
		Jefatura jefe_RRHH = new Jefatura("Juan", 55000, 2006, 9, 25);
		jefe_RRHH.estableceIncentivo(2570);

		Empleado[] misEmpleados = new Empleado[5];
		misEmpleados[0] = new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		misEmpleados[1] = new Empleado("Ana Lopez", 95000, 1995, 6, 2);
		misEmpleados[2] = new Empleado("Maria Martin", 105000, 2002, 3, 15);
		misEmpleados[3] = jefe_RRHH; // Polimorfismo,principio de sustitucion
		misEmpleados[4] = new Jefatura("Maria", 95000, 1999, 5, 26);

		Jefatura jefa_Finanzas = (Jefatura) misEmpleados[4];

		jefa_Finanzas.estableceIncentivo(55000);
		// Otro ejemplo de como hacerlo
		/*
		 * for (int i = 0; i < 3; i++) {
		 * 
		 * misEmpleados[i].subeSueldo(5);
		 * 
		 * }
		 * 
		 * for (int i = 0; i < 3; i++) {
		 * 
		 * System.out.println("Nombre: " + misEmpleados[i].dameNombre() +
		 * " Sueldo: " + misEmpleados[i].dameSueldo() + " Fecha de Alta: " +
		 * misEmpleados[i].dameFechaContrato()); }
		 */

		for (Empleado e : misEmpleados)

			e.subeSueldo(5);

		for (Empleado e : misEmpleados) {
			System.out.println("Nombre: " + e.dameNombre() + " Sueldo: " + e.dameSueldo() + " Fecha de Alta: " + e.dameFechaContrato());

		}
	}

}

class Empleado {

	public Empleado(String nom, double sue, int agno, int mes, int dia) {

		nombre = nom;
		sueldo = sue;

		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
		altaContrado = calendario.getTime();

	}

	public String dameNombre() {// Getter
		return nombre;

	}

	public double dameSueldo() {// Getter

		return sueldo;
	}

	public Date dameFechaContrato() {// Getter

		return altaContrado;

	}

	public void subeSueldo(double porcentaje) {// Setter

		double aumento = sueldo * porcentaje / 100;

		sueldo += aumento;
	}

	private String nombre;
	private double sueldo;
	private Date altaContrado;

}
