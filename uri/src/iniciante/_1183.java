package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class _1183 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		int MEDIA = 0, l, c;
		char O = teclado.next().charAt(0);
		double SOMA = 0.0;
		double[][] n = new double[12][12];

		for (l = 0; l < 12; l++)
			for (c = 0; c < 12; c++)
				n[l][c] = teclado.nextDouble();

		for (l = 0; l < 12; l++)
			for (c = 0; c < 12; c++) {
				if (c > l) {
					SOMA += n[l][c];
					if (n[l][c] != 0)
						MEDIA++;
				}
			}

		if (O == 'S')
			System.out.printf("%.1f\n", SOMA);
		if (O == 'M')
			System.out.printf("%.1f\n", SOMA / MEDIA);
	}

}
