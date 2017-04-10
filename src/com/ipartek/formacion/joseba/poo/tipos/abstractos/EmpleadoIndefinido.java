package com.ipartek.formacion.joseba.poo.tipos.abstractos;

public class EmpleadoIndefinido extends Empleado {

	private int numeropagas;
	private double sueldoAnual;

	public int getNumeropagas() {
		return numeropagas;
	}

	public void setNumeropagas(int numeropagas) {
		this.numeropagas = numeropagas;
	}

	public double getSueldoAnual() {
		return sueldoAnual;
	}

	public void setSueldoAnual(double sueldoAnual) {
		this.sueldoAnual = sueldoAnual;
	}

	@Override
	public String toString() {
		return "EmpleadoIndefinido [numeropagas=" + numeropagas + ", sueldoAnual=" + sueldoAnual + "]";
	}

	public EmpleadoIndefinido(String nombre, int numeropagas, double sueldoAnual) {
		super(nombre);
		this.numeropagas = numeropagas;
		this.sueldoAnual = sueldoAnual;
	}

	public double getSueldoMensual() {
		return sueldoAnual / numeropagas;
	}

}
