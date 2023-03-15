package iniciante;

import java.util.Scanner;

public class _1478 {

	public static void main(String[] args) {
		int numero;

		do {
			Scanner teclado = new Scanner(System.in);
			numero = teclado.nextInt();

			int matriz[][] = new int[numero][numero];
			int coluna = 0, valor = 1;
			for (int i = 0; i < numero; i++) {
				for (int j = coluna; j < numero; j++) {
					matriz[i][j] = valor;
					valor++;
				}
				valor = 1;
				coluna++;
			}

			int linha = 1;
			valor = 2;
			for (int i = 0; i < numero; i++) {
				for (int j = linha; j < numero; j++) {
					matriz[j][i] = valor;
					valor++;
				}
				valor = 2;
				linha++;
			}

			for (int i = 0; i < numero; i++) {
				System.out.print("  ");
				for (int j = 0; j < numero; j++) {
					System.out.print(matriz[i][j]);
					if (j != numero - 1)
						System.out.print("   ");
				}
				System.out.println();
			}
			System.out.println();
		} while (numero != 0);

	}

}
