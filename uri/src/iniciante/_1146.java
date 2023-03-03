package iniciante;

import java.util.Scanner;

public class _1146 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x;
		do {
			x = teclado.nextInt();
			for (int i = 1; i <= x; i++) {
				if (x == i) {
					System.out.print(i + "\n");
				} else {
					System.out.print(i + " ");
				}
			}
		} while (x != 0);
	}

}
