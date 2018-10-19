package iniciante;

import java.util.Scanner;

public class _1101 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int p;
		int s;
		int soma = 0;
		while (true) {
			s = teclado.nextInt();
			p = teclado.nextInt();
			if (p <= 0 || s <= 0) {
				break;
			} else {
				for (int i = p; i <= s; i++) {
					soma = soma + i;
					System.out.print(i + " ");
				}
				System.out.print("Sun=" + soma + "\n");
				soma =0;
			}
		}
	}

}
