package com.ipartek.formacion.joseba.poo.tipos;

import java.util.Date;

public class Persona {

	private int id;
	private String Nombre;
	private Date date;

	public Persona(int id, String Nombre) {

		setId(id);
		setNombre(Nombre);
		setFechaNacimiento(date);
	}

	public Persona() {
		this(0, "Anonimo");
	}

	public void setNombre(String Nombre) {

		this.Nombre = Nombre;

	}

	public String getNombre() {
		return (String) Nombre;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return (int) id;
	}

	public void setFechaNacimiento(Date date) {

		this.date = date;

	}

	public String aTexto() {

		return ("Id " + id + ", Nombre " + Nombre + ", " + " Fecha de Nacimiento " + date);
		// Puedes ponerlo asi: %3$te-%3$tm-%3$tY para sacar las fechas
	}

}
