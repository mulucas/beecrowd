package iniciante;

import java.util.Scanner;

public class _2140 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = 1, m = 1;

		while (n != 0 && m != 0) {
			n = teclado.nextInt();
			m = teclado.nextInt();
			m = m - n;
			if (m == 4 || m == 7 || m == 10 || m == 12 || m == 15 || m == 20 || m == 22 || m == 25 || m == 7 || m == 30
					|| m == 40 || m == 52 || m == 55 || m == 60 || m == 70 || m == 100 || m == 102 || m == 105
					|| m == 110 || m == 120 || m == 150 || m == 200) {
				System.out.println("possible");
			} else if (n != 0 && m != 0) {
				System.out.println("impossible");
			}
		}
	}

}
