package iniciante;

import java.util.Scanner;

public class _1035 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int c = teclado.nextInt();
		int d = teclado.nextInt();
		if (((b > c) && (d > a)) && ((c + d) > (a + b)) && (c >= 0 && d >= 0)) {
			System.out.println("Valores aceitos");
		}else {
			System.out.println("Valores nao aceitos");
		}
	}
}
