package com.ipartek.formacion.joseba.poo.tipos;

public class Cochenuevo {

	private String marca;
	private int potencia, antiguedad, precio;
	private boolean nuevo;

	private Rueda[] ruedas = new Rueda[4];

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public boolean isNuevo() {
		return nuevo;
	}

	public void setNuevo(boolean nuevo) {
		this.nuevo = nuevo;
	}

	public Cochenuevo(String marca, int potencia, int antiguedad, int precio, boolean nuevo) {
		super();
		this.marca = marca;
		this.potencia = potencia;
		this.antiguedad = antiguedad;
		this.precio = precio;
		this.nuevo = nuevo;
	}

	public Cochenuevo() {
		super();
		// TODO Auto-generated constructor stub
	}

}
