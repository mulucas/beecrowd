package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class _2006 {

	public static void main(String[] args) throws IOException {
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		int a=0;
		int vetor[] = new int[5];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = teclado.nextInt();
			if (vetor[i] == n) {
				a++;
			}
		}
		System.out.println(a);
	}

}
