package iniciante;

import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;

public class _1172 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		int[] w = new int[10];
		Vector<String> v = new Vector<String>(10);

		for (int aux = 0; aux < 10; aux++) {
			w[aux] = teclado.nextInt();
			if (w[aux] <= 0)
				w[aux] = 1;
		}
		for (int i = 0; i < 10; i++)
			System.out.printf("X[%d] = %d\n", i, w[i]);
	}

}
