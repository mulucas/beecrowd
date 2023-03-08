package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class _1178 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		double[] n = new double[101];
		double x, aux;
		x = teclado.nextDouble();
		aux = x;
		for (int i = 0; i < 100; i++) {
			n[i] = aux;
			aux = aux / 2;
		}

		for (int z = 0; z < 100; z++)
			System.out.printf("N[%d] = %.4f\n", z, n[z]);
	}

}
