package iniciante;

import java.util.Scanner;

public class _1067 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		for (int i = 1; i <= n; i=i+2) {
			System.out.println(i);
		}
	}
}
