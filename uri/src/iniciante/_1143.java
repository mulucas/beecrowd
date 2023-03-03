package iniciante;

import java.util.Scanner;

public class _1143 {

	public static void main(String[] args) {
		int n, i;
		i = 1;

		n = new Scanner(System.in).nextInt();

		for (; n > 0; n--, i++) {

			System.out.println(i + " " + (i * i) + " " + (i * i * i));
		}
	}

}
