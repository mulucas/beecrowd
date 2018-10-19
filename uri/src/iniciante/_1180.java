package iniciante;

import java.util.Scanner;

public class _1180 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		int vetor[] = new int[n];
		int menor = 9999, posicao = 0;
		for (int i = 0; i < n; i++) {
			vetor[i] = teclado.nextInt();
			if (vetor[i] < menor) {
				menor = vetor[i];
				posicao = i;
			}
		}
		System.out.println("Menor valor: "+menor);
		System.out.println("Posicao: "+posicao);
	}
}
