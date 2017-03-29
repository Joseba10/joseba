package com.ipartek.formacion.josebaclemente.poo.tipos;

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

		return ("Id " + id + ", Nombre " + Nombre + ", " + date + "");
	}

}
