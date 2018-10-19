package iniciante;

import java.util.Scanner;

public class _1145 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x = teclado.nextInt();
		int y = teclado.nextInt();
		int h=1;
		for (int i = 1; i <=y; i++) {
			System.out.print(i+" ");
			if (h==x) {
				System.out.print("\n");
				h=1;
			}else {
				h++;
			}
		}
	}

}
