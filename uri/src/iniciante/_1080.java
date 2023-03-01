package iniciante;

import java.util.Scanner;

public class _1080 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int vetor[] = new int[100];
		int maior=0,j=0;
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = teclado.nextInt();
			if (vetor[i]>maior) {
				maior=vetor[i];
				j=i+1;
			}
		}
		System.out.println(maior);
		System.out.println(j);
	}

}
