package iniciante;

import java.util.Scanner;

public class _1134 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, disel = 0, alcool = 0, gasolina = 0;
		while ((numero = teclado.nextInt()) != 4) {
			if (numero == 1) {
				alcool += 1;
			} else if (numero == 2) {
				gasolina += 1;
			} else if (numero == 3) {
				disel += 1;
			}
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + disel);
	}

}
