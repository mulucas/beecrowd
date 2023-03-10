package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class _1188 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		int L, C;
		char T = teclado.next().charAt(0);
		double SOMA = 0.0, MEDIA = 0.0;
		double[][] MATRIX = new double[12][12];

		for (int l = 0; l < 12; l++)
			for (int c = 0; c < 12; c++)
				MATRIX[l][c] = teclado.nextDouble();

		int q = 5, p = 6;
		for (L = 7; L <= 11; L++) {
			for (C = q; C <= p; C++) {
				SOMA += MATRIX[L][C];
				if (MATRIX[L][C] != 0)
					MEDIA++;
			}
			q--;
			p++;
		}

		if (T == 'S')
			System.out.printf("%.1f\n", SOMA);

		if (T == 'M') {
			System.out.printf("%.1f\n", MEDIA);
		}
	}

}
