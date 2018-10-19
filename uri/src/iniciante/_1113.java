package iniciante;

import java.util.Scanner;

public class _1113 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		while (true) {
			int x = teclado.nextInt();
			int y = teclado.nextInt();
			if (x==y) {
				break;
			}else if (x>y) {
				System.out.println("Decrescente");
			}else {
				System.out.println("Crescente");
			}
		}
	}
}
