package iniciante;

import java.util.Scanner;

public class _2172 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numInt = scanner.nextInt();

		long numLong = scanner.nextLong();

		long resultado = (long) numInt * numLong;
		do {
			System.out.println(resultado);

			numInt = scanner.nextInt();

			numLong = scanner.nextLong();

			resultado = (long) numInt * numLong;
		} while (numInt != 0 && numLong != 0);
	}

}
