package iniciante;

import java.util.Scanner;

public class _1116 {

	public static void main(String[] args) {
		int N;
		int X, Y;
		float result;
		Scanner teclado = new Scanner(System.in);
		N = teclado.nextInt();
		for (int i = 1; i <= N; i++) {
			X = teclado.nextInt();
			Y = teclado.nextInt();
			if (Y == 0) {
				System.out.print("divisao impossivel\n");
			} else {
				result = (float) X / Y;
				System.out.printf("%.1f\n", result);
			}

		}
	}

}
