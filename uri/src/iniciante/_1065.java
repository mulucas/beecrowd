package iniciante;

import java.util.Scanner;

public class _1065 {

	public static void main(String[] args) {
		int vetor[] = new int[5];
		int j=0;
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = teclado.nextInt();
			if (vetor[i]%2==0) {
				j++;
			}
		}
		System.out.println(j+" valores pares");
	}

}
