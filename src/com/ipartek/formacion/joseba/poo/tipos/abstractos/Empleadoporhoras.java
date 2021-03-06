package com.ipartek.formacion.joseba.poo.tipos.abstractos;

public class Empleadoporhoras extends Empleado {

	private int numeroHoras;
	private double precioHora;

	@Override
	public double getSueldoMensual() {
		return numeroHoras * precioHora;

	}

	public int getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}

	public double getPrecioHora() {
		return precioHora;
	}

	public void setPrecioHora(double precioHora) {
		this.precioHora = precioHora;
	}

	public Empleadoporhoras(String nombre, int numeroHoras, double precioHora) {
		super(nombre);
		this.numeroHoras = numeroHoras;
		this.precioHora = precioHora;
	}

	@Override
	public String toString() {
		return "Empleadoporhoras [numeroHoras=" + numeroHoras + ", precioHora=" + precioHora + "]";
	}

}
