package iniciante;

import java.util.Scanner;

public class _1176 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int nEntradas = teclado.nextInt();
		if (nEntradas != 0) {
			int vetor[] = new int[nEntradas];
			for (int i = 0; i < nEntradas; i++) {
				vetor[i] = teclado.nextInt();
			}
			int max = 0;
			for (int i = 0; i < nEntradas; i++) {
				if (vetor[i] > max) {
					max = vetor[i];
				}
			}
			if (max > 0) {
				long vetorFibonacci[] = new long[max + 1];
				vetorFibonacci[0] = 0;
				vetorFibonacci[1] = 1;
				for (int i = 2; i < max + 1; ++i) {
					vetorFibonacci[i] = vetorFibonacci[i - 1] + vetorFibonacci[i - 2];
				}
				for (int i = 0; i < nEntradas; i++) {
					System.out.println("Fib(" + vetor[i] + ") = " + vetorFibonacci[vetor[i]]);
				}
			} else {
				System.out.println("Fib(0) = 0");
			}
		}
	}

}
