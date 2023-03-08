package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class _1179 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		int[] par = new int[5];
		int[] impar = new int[5];
		int[] aux = new int[15];
		int n, m;

		for (int i = 0; i < aux.length; i++) {
			aux[i] = teclado.nextInt();
		}

		n = 0;
		m = 0;
		for (int y = 0; y < aux.length; y++) {
			if (aux[y] % 2 == 0) {
				par[n] = aux[y];
				n++;
				if (n == 5) {
					for (int z = 0; z < par.length; z++)
						System.out.printf("par[%d] = %d\n", z, par[z]);
					par = new int[5];
					n = 0;
				}
			}
			if (aux[y] % 2 != 0) {
				impar[m] = aux[y];
				m++;
				if (m == 5) {
					for (int w = 0; w < impar.length; w++)
						System.out.printf("impar[%d] = %d\n", w, impar[w]);
					impar = new int[5];
					m = 0;
				}
			}
		}
		for (int w = 0; w < impar.length; w++)
			if (impar[w] != 0)
				System.out.printf("impar[%d] = %d\n", w, impar[w]);
		for (int z = 0; z < par.length; z++)
			if (par[z] != 0)
				System.out.printf("par[%d] = %d\n", z, par[z]);
	}

}
