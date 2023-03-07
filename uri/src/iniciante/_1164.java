package iniciante;

import java.util.Scanner;

public class _1164 {

	public static void main(String[] args) {
		int N = 0, X = 0;
		Scanner teclado = new Scanner(System.in);
		N = teclado.nextInt();
		for (int i = 0; i < N; i++) {
			int sum = 0;
			X = teclado.nextInt();
			for (int j = 1; j <= X / 2; j++) {
				if ((X % j) == 0) {
					sum += j;
				}

			}
			if (sum == X) {
				System.out.print(X + " eh perfeito\n");
			} else {
				System.out.print(X + " nao eh perfeito\n");
			}
		}
	}

}
