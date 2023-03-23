package iniciante;

import java.util.Scanner;

public class _2791 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int c1 = teclado.nextInt();
		int c2 = teclado.nextInt();
		int c3 = teclado.nextInt();
		int c4 = teclado.nextInt();

		if (c4 == 1) {
			System.out.println("4");
		}
		if (c3 == 1) {
			System.out.println("3");
		}
		if (c2 == 1) {
			System.out.println("2");
		}
		if (c1 == 1) {
			System.out.println("1");
		}
	}
}
