package iniciante;

import java.util.Scanner;

public class _2060 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		int vetor[] = new int[n];
		int dois = 0, tres = 0, quatro = 0, cinco = 0;
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = teclado.nextInt();
			if (vetor[i] % 2 == 0) {
				dois++;
			}
			if (vetor[i] % 3 == 0) {
				tres++;
			}
			if (vetor[i] % 4 == 0) {
				quatro++;
			}
			if (vetor[i] % 5 == 0) {
				cinco++;
			}
		}
		System.out.println(dois + " Multiplo(s) de 2");
		System.out.println(tres + " Multiplo(s) de 3");
		System.out.println(quatro + " Multiplo(s) de 4");
		System.out.println(cinco + " Multiplo(s) de 5");
	}

}
