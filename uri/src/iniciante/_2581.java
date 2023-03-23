package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class _2581 {
	public static void main(String[] args) throws IOException {

		Scanner teclado = new Scanner(System.in);
		while (teclado.hasNext()) {
			int number;
			number = teclado.nextInt();
			teclado.next();
			while (number > 0) {
				String id1;
				id1 = teclado.nextLine();
				number--;
				System.out.println("I am Toorg!");
			}
		}

	}
}
