package iniciante;

import java.util.Scanner;

public class _1157 {

	public static void main(String[] args) {
		int N;
		Scanner teclado = new Scanner(System.in);
		N = teclado.nextInt();
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				System.out.print(i + "\n");
			}
		}
	}

}
