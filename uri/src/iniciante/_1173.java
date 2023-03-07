package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class _1173 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		int[] w = new int[10];
		int primeiro = teclado.nextInt();

		for (int aux = 0; aux < 10; aux++) {
			w[aux] = primeiro;
			primeiro = primeiro * 2;
		}
		for (int i = 0; i < 10; i++)
			System.out.printf("N[%d] = %d\n", i, w[i]);
	}

}
