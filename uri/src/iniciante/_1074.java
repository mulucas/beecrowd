package iniciante;

import java.util.Scanner;

public class _1074 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		int vetor[] = new int[n];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = teclado.nextInt();
		}
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i]==0) {
				System.out.println("NULL");
			}else if (vetor[i]<0) {
				if (vetor[i]%2==0) {
					System.out.println("EVEN NEGATIVE");
				}else {
					System.out.println("ODD NEGATIVE");
				}
			}else if (vetor[i]>0) {
				if (vetor[i]%2==0) {
					System.out.println("EVEN POSITIVE");
				}else {
					System.out.println("ODD POSITIVE");
				}
			}
		}
	}
}
