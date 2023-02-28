package iniciante;

import java.util.Scanner;

public class _3299 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long numero = sc.nextLong();
		long imprimir = numero;
		boolean tem13 = false;

		while (numero > 0) {
			long digito = numero % 10;
			numero /= 10;

			if (digito == 3 && numero % 10 == 1) {
				tem13 = true;
				break;
			}
		}

		if (tem13) {
			System.out.println(imprimir + " es de Mala Suerte");
		} else {
			System.out.println(imprimir + " NO es de Mala Suerte");
		}
	}

}
