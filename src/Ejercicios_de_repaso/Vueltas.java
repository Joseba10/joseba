package Ejercicios_de_repaso;

import java.util.Scanner;

public class Vueltas {

	public static void main(String[] args) {
		double vuelta;
		int vCent; // Valor en centimos

		Scanner precio = new Scanner(System.in);
		System.out.println("Dime el precio");
		double precio1 = Double.parseDouble(precio.nextLine());

		Scanner pago = new Scanner(System.in);
		System.out.println("Cuanto me pagas");
		double pago1 = Double.parseDouble(pago.nextLine());

		// Ejecuccion
		if (pago1 < precio1) {
			System.out.println("No se puede Regatear");

		} else {
			vuelta = pago1 - precio1;

			vCent = (int) (vuelta * 100);

			System.out.println("Vuelta en euros " + vuelta);
			System.out.println("Vuelta en centimos " + vCent);
			System.out.println(vCent / 200 + " de dos euros");
			vCent %= 200;
			System.out.println(vCent / 100 + " de un euro");
			vCent %= 100;
			System.out.println(vCent / 50 + " de 50 centimos");
			vCent %= 50;
			System.out.println(vCent / 20 + " de 20 centimos");
			vCent %= 20;
			System.out.println(vCent / 10 + " de 10 centimos");
			vCent %= 10;
			System.out.println(vCent / 5 + " de 5 centimos");
			vCent %= 5;
			System.out.println(vCent / 2 + " de 2 centimos");
			vCent %= 2;
			System.out.println(vCent + " de un centimo");
		}
	}

}
