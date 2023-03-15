package iniciante;

import java.util.Scanner;

public class _1961 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int pulo = teclado.nextInt();
		int nQntd = teclado.nextInt();
		int nAnterior = 0;
		String result = "YOU WIN";
		for (int i = 0; i < nQntd; i++) {
			int numero = teclado.nextInt();
			if (Math.abs(numero - nAnterior) > pulo && i > 0) {
				result = "GAME OVER";
			}
			nAnterior = numero;
		}
		System.out.println(result);
	}

}
