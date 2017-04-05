package coche;

public class Coche {

	// Variables
	private int ruedas;
	private double largura;
	private double anchura;
	private int motor;
	private int peso_plataforma;
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;

	// Contructor
	public Coche() {

		ruedas = 4;
		largura = 2.50;
		anchura = 1.50;
		motor = 1600;
		peso_plataforma = 500;

	}

	// Metodo Getter

	public String dime_largo() {

		return "El largo del coche es" + largura;
	}

	public String dime_datos_generales() { // Getter

		return "La plataforma del vehiculo tiene " + ruedas + " ruedas " + ". Mide " + largura + " metros con de ancho de " + anchura + " metros  y un peso de plataforma de " + peso_plataforma
				+ " kg";

	}

	// Metodo Setter

	public void establece_color(String color_coche) {

		color = color_coche;
	}

	public String dime_color() {

		return "El color del coche es " + color;
	}

	// Metodo Setter
	public void configura_asientos(String asientos_cuero) {

		if (asientos_cuero.equalsIgnoreCase("Si")) {

			this.asientos_cuero = true;
		} else {

			this.asientos_cuero = false;
		}
	}

	public String dime_asientos() {

		if (asientos_cuero) {

			return "El coche tiene asientos de cuero";
		} else {

			return "El coche tiene asientos de serie";
		}
	}

	// Setter
	public void configura_climatizador(String climatizador) {

		if (climatizador.equalsIgnoreCase("Si")) {
			this.climatizador = true;
		} else {
			this.climatizador = false;
		}
	}

	// Getter
	public String dime_climatizador() {

		if (climatizador) {

			return "El coche incorpora climatizador";
		} else {
			return "El coche no lleva aire acondicionado";
		}
	}

	// Setter-Getter

	public String dime_peso_coche() {

		int peso_carroceria = 500;

		peso_total = peso_carroceria + peso_plataforma;

		if (asientos_cuero) {
			peso_total = peso_total + 50;
		}
		if (climatizador) {
			peso_total = peso_total + 20;

		}

		return "El peso del coche es " + peso_total;

	}

	public int precio_coche() {

		int precio_final = 10000;

		if (asientos_cuero) {

			precio_final = precio_final + 2000;
		}
		if (climatizador) {

			precio_final = precio_final + 1500;
		}

		return precio_final;

	}

}