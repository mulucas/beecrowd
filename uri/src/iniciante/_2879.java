package iniciante;

import java.util.Scanner;

public class _2879 {

	public static void main(String[] args) {
		Scanner teclado =new Scanner(System.in);
		int n = teclado.nextInt();
		int vetor[] = new int[n];
		int u=0;
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = teclado.nextInt();
			if (vetor[i]>1) {
				u++;
			}
		}
		System.out.println(u);
	}

}
