package iniciante;

import java.util.Scanner;

public class _2143 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		while (true) {
			int numTeste = teclado.nextInt();
			if (numTeste == 0) {
				break;
			} else {
				for (int i = 0; i < numTeste; i++) {
					int numero = teclado.nextInt();
					if (numero % 2 == 0) {
						System.out.println((numero * 2) - 2);
					} else {
						System.out.println((numero * 2) - 1);
					}
				}
			}
		}
	}

}
