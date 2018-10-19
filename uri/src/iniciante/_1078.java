package iniciante;

import java.util.Scanner;

public class _1078 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(i+" x "+numero+" = "+(i*numero));
		}
	}

}
