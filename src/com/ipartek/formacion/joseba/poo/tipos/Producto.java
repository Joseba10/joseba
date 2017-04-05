package com.ipartek.formacion.joseba.poo.tipos;

import java.math.BigDecimal;

public class Producto {
	public final static boolean CON_FORMATO = true, SIN_FORMATO = false;
	private int id;
	private String Nombre;
	private double precio;
	public static final int ANCHO_ID = 5, ANCHO_NOMBRE = 10, ANCHO_PRECIO = 10;
	private BigDecimal PrecioSeguro;

	public BigDecimal getPrecioSeguro() {
		return PrecioSeguro;
	}

	public void setPrecioSeguro(BigDecimal precioSeguro) {
		PrecioSeguro = precioSeguro;
	}

	public Producto(int id, String nombre, double precio) {

		this.id = id;
		this.Nombre = nombre;
		this.precio = precio;
		setPrecio(precio);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public void setPrecio(double precio) {
		this.precio = precio;

		// setPrecioSeguro(new BigDecimal(String.format("%.2f", precio).replace(',',
		// '.')));

		String textoPrecio = String.format("%.2f", precio); // dejo dos decimales
		textoPrecio = textoPrecio.replace(',', '.'); // Si hay comas se ponen puntos
		BigDecimal bdPrecio = new BigDecimal(textoPrecio); // Crea la funcion decimal
		setPrecioSeguro(bdPrecio); // Asigna el valor de la variable al metodo

	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return toString(SIN_FORMATO);
	}

	public void add(Producto producto) {
		producto.add(producto);
	}

	public String toString(boolean conFormato) {
		if (conFormato)
			return String.format("ID: %" + ANCHO_ID + "d %-" + ANCHO_NOMBRE + "s %" + ANCHO_PRECIO + ".2f€", id, Nombre, precio);
		else
			return "ID: " + id + ", " + Nombre + ", " + precio + "€";
	}

}
