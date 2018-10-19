package iniciante;

import java.util.Scanner;

public class _2863 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		double vetor[] = new double[n];
		double m =12;
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = teclado.nextDouble();
			if (vetor[i]<m) {
				m = vetor[i];
			}
		}
		System.out.println(m);
	}

}
