package iniciante;

import java.util.Scanner;

public class _1789 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		while (teclado.hasNext()) {
			int valor = teclado.nextInt();
			int nivel = 0;
			int vetor[] = new int[valor];

			for (int i = 0; i < vetor.length; i++) {
				vetor[i] = teclado.nextInt();
				if (vetor[i] < 10 && nivel != 2 && nivel != 3) {
					nivel = 1;
				} else if (vetor[i] >= 10 && vetor[i] < 20 && nivel != 3) {
					nivel = 2;
				} else if (vetor[i] >= 20) {
					nivel = 3;
				}
			}
			System.out.println(nivel);
		}
	}

}
