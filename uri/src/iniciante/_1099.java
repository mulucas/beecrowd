package iniciante;

import java.util.Scanner;

public class _1099 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int qtde = teclado.nextInt();
		int x, y, soma;
		x = 0;
		y = 0;

		for (int i = 0; i < qtde; i++) {
			soma = 0;
			x = teclado.nextInt();
			y = teclado.nextInt();

			if (x % 2 != 0 && x > y)
				x--;
			if (y % 2 != 0 && y > x)
				y--;
			if (x % 2 != 0 && x < y)
				x++;
			if (y % 2 != 0 && y < x)
				y++;
			for (; x < y; x++) {
				if (x % 2 != 0)
					soma += x;
			}

			for (; x > y; y++) {
				if (y % 2 != 0)
					soma += y;
			}

			System.out.println(soma);
		}
	}

}
