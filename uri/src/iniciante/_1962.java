package iniciante;

import java.util.Scanner;

public class _1962 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int nQntd = teclado.nextInt();

		for (int i = 0; i < nQntd; i++) {
			int ano = teclado.nextInt();

			int result = ano - 2015;
			if (result >= 0) {
				System.out.println((result + 1) + " A.C.");
			} else {
				System.out.println(Math.abs(result) + " D.C.");
			}
		}
	}

}
