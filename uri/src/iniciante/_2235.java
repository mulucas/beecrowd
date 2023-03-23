package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class _2235 {
	public static void main(String[] args) throws IOException {

		Scanner teclado = new Scanner(System.in);
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int c = teclado.nextInt();
		if ((a - b == 0) || (a - c == 0) || (b - c == 0) || (a + b - c == 0) || (a + c - b == 0) || (b + c - a == 0)) {
			System.out.println("S");
		} else {
			System.out.println("N");
		}

	}
}
