package iniciante;

import java.util.Scanner;

public class _1132 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int x, y, soma;
		soma = 0;

		x = teclado.nextInt();
		y = teclado.nextInt();

		if (y > x) {
			int aux = y;
			y = x;
			x = aux;
		}

		for (; x >= y; y++) {
			if (y % 13 != 0)
				soma += y;
		}

		System.out.println(soma);
	}

}
