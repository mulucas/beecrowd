package iniciante;

import java.util.Scanner;
import java.util.Locale;

public class _1160 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		int t = 1, ANOS;
		int PA, PB;
		double G1, G2;

		t = teclado.nextInt();
		while (t > 0) {

			PA = teclado.nextInt();
			PB = teclado.nextInt();
			G1 = teclado.nextDouble();
			G2 = teclado.nextDouble();

			ANOS = 0;

			while (PA <= PB) {

				PA += PA * (G1 / 100.0);
				PB += PB * (G2 / 100.0);

				ANOS++;

				if (ANOS > 100) {
					System.out.println("Mais de 1 seculo.");
					PA = PB + 1;
				}
			}
			if (ANOS <= 100)
				System.out.printf("%d anos.\n", ANOS);

			t = t - 1;

		}

	}

}
