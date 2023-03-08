package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class _1182 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		int C = teclado.nextInt();
		char T = teclado.next().charAt(0);
		double SOMA = 0, MEDIA = 0;
		double[][] n = new double[12][12];

		for (int l = 0; l < 12; l++)
			for (int c = 0; c < 12; c++)
				n[l][c] = teclado.nextDouble();

		for (int i = 0; i < 12; i++) {
			SOMA += n[i][C];
			if (n[i][C] != 0)
				MEDIA++;
		}

		if (T == 'S')
			System.out.printf("%.1f\n", SOMA);
		if (T == 'M')
			System.out.printf("%.1f\n", SOMA / MEDIA);
	}

}
