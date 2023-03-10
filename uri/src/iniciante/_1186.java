package iniciante;

import java.util.Scanner;

public class _1186 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int l, c;
		double soma = 0;
		double matriz[][] = new double[12][12];

		String v = teclado.next();

		for (l = 0; l < 12; l++) {
			for (c = 0; c < 12; c++) {
				matriz[l][c] = teclado.nextDouble();
			}
		}
		int x = 1;
		for (l = 11; l >= 1; l--) {
			for (c = x; c < 12; c++) {
				soma += matriz[l][c];
			}
			x++;
		}

		if (v.equals("S")) {
			System.out.printf("%.1f\n", soma);
		} else {
			System.out.printf("%.1f\n", (soma / 66));
		}
	}

}
