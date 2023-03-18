package iniciante;

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class _2029 {

	public static void main(String[] args) throws IOException {
		Scanner teclado = new Scanner(System.in);

		teclado.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		double v, r, alt, d, a;

		while (teclado.hasNext()) {
			v = teclado.nextDouble();
			d = teclado.nextDouble();

			r = d / 2;
			a = 3.14 * r * r;
			alt = v / a;

			System.out.printf("ALTURA = %.2f\n", alt);
			System.out.printf("AREA = %.2f\n", a);
		}
	}
}
