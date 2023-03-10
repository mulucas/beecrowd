package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class _1187 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		char T = teclado.next().charAt(0);
		double SOMA=0, MEDIA=0;
		double[][] n = new double[12][12];

		for(int l=0; l<12; l++)
			for(int c=0; c<12; c++)
				n[l][c] = teclado.nextDouble();

		for(int l=0; l<12; l++)
			for(int c=0; c<12; c++){
				if (c > l && (c+l < 11)) {
				SOMA += n[l][c];
				if (n[l][c] != 0)
					MEDIA++;
				}
			}
			
		if (T == 'S')
			System.out.printf("%.1f\n",SOMA);
		if (T == 'M')
			System.out.printf("%.1f\n",SOMA/MEDIA);
	}

}
