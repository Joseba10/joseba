package com.ipartek.formacion.joseba.poo.tipos;

public class Ejemploasbtract {

	public static void main(String[] args) {
		Number[] numeros = new Number[2];// Se crea dos huecos de tipo number,una clase
											// abstracta no se puede instanciar

		numeros[0] = new Double(5.3); // Como se da un resultado no hace falta poner
										// abstract
		numeros[1] = new Integer(3);

		for (Number numero : numeros)
			// Por cada numero me sacas los numeros que contiene

			System.out.println(numero.doubleValue());

	}

}
