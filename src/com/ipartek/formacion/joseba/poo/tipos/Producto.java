package com.ipartek.formacion.joseba.poo.tipos;

public class Producto {
	public final static boolean CON_FORMATO = true, SIN_FORMATO = false;
	private int id;
	private String Nombre;
	private double precio;
	public static final int ANCHO_ID = 5, ANCHO_NOMBRE = 10, ANCHO_PRECIO = 10;

	public Producto(int id, String nombre, double precio) {

		this.id = id;
		this.Nombre = nombre;
		this.precio = precio;
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
