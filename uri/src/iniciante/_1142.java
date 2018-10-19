package iniciante;

import java.util.Scanner;

public class _1142 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		for (int i = 1; i <= n*4; i++) {
			if (i%4==0) {
				System.out.print("PUM\n");
			}else {
				System.out.print(i+" ");
			}
		}
	}

}
