package iniciante;

import java.util.Scanner;

public class _1435 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int l, c;

		int numero;

		do {
			numero = teclado.nextInt();
			int matriz[][] = new int[numero][numero];
			if (numero < 3) {
				for (l = 0; l < numero; l++) {
					for (c = 0; c < numero; c++) {
						matriz[l][c] = 1;
					}
				}
			} else {
				int limite;
				if (numero % 2 == 0) {
					limite = numero / 2;
				} else {
					limite = (numero + 1) / 2;
				}

				int v1 = 0, v2 = numero - 1;
				int valor = 1;
				int i = 0;
				int temp;
				while (valor <= limite) {
					temp = i;

					while (i < numero) {
						if (matriz[v1][i] == 0) {
							matriz[v1][i] = valor;
						}
						if (matriz[i][v1] == 0) {
							matriz[i][v1] = valor;
						}
						if (matriz[v2][i] == 0) {
							matriz[v2][i] = valor;
						}
						if (matriz[i][v2] == 0) {
							matriz[i][v2] = valor;
						}
						i++;
					}
					i = temp;
					i++;
					valor++;
					v1++;
					v2--;
				}
			}

			for (l = 0; l < numero; l++) {
				for (c = 0; c < numero; c++) {
					if (c == 0) {
						System.out.print("  " + matriz[l][c]);
					} else {
						System.out.print("   " + matriz[l][c]);
					}
				}
				System.out.print("\n");
			}
			if (numero != 0)
				System.out.print("\n");
		} while (numero != 0);
	}

}
