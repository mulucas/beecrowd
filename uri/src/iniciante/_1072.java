package iniciante;

import java.util.Scanner;

public class _1072 {

	public static void main(String[] args) {
		int N, X, in = 0, out = 0;
		int c = 10;
		int v = 20;

		Scanner teclado = new Scanner(System.in);

		N = teclado.nextInt();

		for (int i = 1; i <= N; i++) {
			X = teclado.nextInt();
			if (X >= c && X <= v) {
				in += 1;
			} else {
				out += 1;
			}
		}
		System.out.print(in + " in\n" + out + " out\n");
	}

}
