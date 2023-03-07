package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class _1175 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int[] w = new int[20];
		int[] z = new int[20];
		
		for (int f = 0; f < 20; f++)
			w[f]=teclado.nextInt();
		
		int j=19, i=0;
		while (i<20 || j>0){
			z[j] = w[i];
			j--;
			i++;
		}

		for (int x = 0; x < 20; x++)
			System.out.printf("N[%d] = %d\n",x,z[x]);
	}

}
