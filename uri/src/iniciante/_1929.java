package iniciante;

import java.util.Scanner;

public class _1929 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numero1 = teclado.nextInt();
		int numero2 = teclado.nextInt();
		int numero3 = teclado.nextInt();
		int numero4 = teclado.nextInt();

		if ((numero1 < (numero2 + numero3)) && (numero1 > Math.abs(numero2 - numero3))
				|| (numero1 < (numero2 + numero4)) && (numero1 > Math.abs(numero2 - numero4))
				|| (numero1 < (numero3 + numero4)) && (numero1 > Math.abs(numero3 - numero4))
				|| (numero2 < (numero1 + numero3)) && (numero2 > Math.abs(numero1 - numero3))
				|| (numero2 < (numero1 + numero4)) && (numero2 > Math.abs(numero1 - numero4))
				|| (numero2 < (numero3 + numero4)) && (numero2 > Math.abs(numero3 - numero4))
				|| (numero3 < (numero1 + numero2)) && (numero3 > Math.abs(numero1 - numero2))
				|| (numero3 < (numero1 + numero4)) && (numero3 > Math.abs(numero1 - numero4))
				|| (numero3 < (numero2 + numero4)) && (numero3 > Math.abs(numero2 - numero4))
				|| (numero4 < (numero1 + numero2)) && (numero4 > Math.abs(numero1 - numero2))
				|| (numero4 < (numero1 + numero3)) && (numero4 > Math.abs(numero1 - numero3))
				|| (numero4 < (numero2 + numero3)) && (numero4 > Math.abs(numero2 - numero3))) {
			System.out.println("S");
		} else {
			System.out.println("N");
		}
	}

}
