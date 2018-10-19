package iniciante;

import java.util.Scanner;

public class _1070 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		if (n%2==0) {
			n++;
		}
		int o=1;
		int i=n;
		while (o<=6) {
			System.out.println(i);
			i=i+2;
			o++;
		}
	}
}
