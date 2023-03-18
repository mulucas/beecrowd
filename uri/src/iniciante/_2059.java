package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class _2059 {

	public static void main(String[] args) throws IOException {

		Scanner teclado = new Scanner(System.in);
		int par, j1, j2, r, a;
		par = teclado.nextInt();
		j1 = teclado.nextInt();
		j2 = teclado.nextInt();
		r = teclado.nextInt();
		a = teclado.nextInt();
		if (r != a)
			System.out.println("Jogador 1 ganha!");
		else if (r == 1)
			System.out.println("Jogador 2 ganha!");
		else {
			if (par == 1 && ((j1 + j2) % 2) == 0)
				System.out.println("Jogador 1 ganha!");
			else if (par == 0 && ((j1 + j2) % 2) == 1)
				System.out.println("Jogador 1 ganha!");
			else
				System.out.println("Jogador 2 ganha!");
		}

	}

}