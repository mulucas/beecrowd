package iniciante;

import java.util.Scanner;

public class _1133 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int x, y;

		x = teclado.nextInt();
		y = teclado.nextInt();

		if (y > x) {
			int aux = y;
			y = x;
			x = aux;
		}

		y++;
		for (; x > y; y++) {

			if ((y % 5 == 2 || y % 5 == 3) && !(y % 5 == 2 && y % 5 == 3))
				System.out.println(y);
		}
	}

}
