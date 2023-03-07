package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class _1174 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		double[] w = new double[100];
		
		for (int aux = 0; aux < 100; aux++)
			w[aux]=teclado.nextDouble();
		
		for (int i = 0; i < 100; i++)
			if (w[i] <= 10.0)
				System.out.printf("A[%d] = %.1f\n",i,w[i]);
	}

}
