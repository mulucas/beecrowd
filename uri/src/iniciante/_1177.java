package iniciante;

import java.util.Scanner;

public class _1177 {

	public static void main(String[] args) {
		int T, i, j;
		int N[] = new int[1000];
		Scanner teclado = new Scanner(System.in);
		T = teclado.nextInt();

		for (i = 0, j = 0; i < 1000; j++, i++) {
			N[j] = j;
			if ((N[j]) == T) {
				j = 0;
			}
			System.out.print("N[" + i + "] = " + N[j] + "\n");
		}
	}

}
