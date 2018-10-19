package iniciante;

import java.util.Scanner;

public class _1151 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		int um=0,dois=1,tres;
		for (int i = 0; i < n; i++) {
			if (i==4) {
				System.out.print(um);
			}else {
				System.out.print(um+" ");
			}
			tres=um;
			um=dois;
			dois=um+tres;
		}	
		System.out.print("\n");
	}
}
