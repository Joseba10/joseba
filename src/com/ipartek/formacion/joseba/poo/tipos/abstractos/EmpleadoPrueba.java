package com.ipartek.formacion.joseba.poo.tipos.abstractos;

import java.util.ArrayList;

public class EmpleadoPrueba {

	public static void main(String[] args) {

		ArrayList<Empleado> empleados = new ArrayList<Empleado>();

		empleados.add(new Empleadoporhoras("Javier", 60, 20.0));
		empleados.add(new EmpleadoIndefinido("Javier", 14, 30000.0));

		for (Empleado empleado : empleados)
			System.out.println(empleado.getSueldoMensual());
	}
}
