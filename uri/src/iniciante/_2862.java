package iniciante;

import java.util.Scanner;

public class _2862 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		int vetor[] = new int[n];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = teclado.nextInt();
		}
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i]>8000) {
				System.out.println("Mais de 8000!");
			}else {
				System.out.println("Inseto!");
			}
		}
	}

}
