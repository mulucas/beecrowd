package iniciante;

import java.util.Scanner;

public class _1165 {

	public static void main(String[] args) {
		int N, X, j;
		Scanner teclado = new Scanner(System.in);
		N = teclado.nextInt();
		for (int i = 1; i <= N; i++) {
			X = teclado.nextInt();
			boolean isprime = true;
			for (j = 2; j < X; j++) {
				if (X % j == 0) {
					isprime = false;
				}
			}

			if (isprime) {
				System.out.print(X + " eh primo\n");
			} else {
				System.out.print(X + " nao eh primo\n");
			}

		}
	}

}
