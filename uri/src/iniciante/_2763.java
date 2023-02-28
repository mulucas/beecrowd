package iniciante;

import java.util.Scanner;

public class _2763 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		while (teclado.hasNext()) {
			String cpf = teclado.nextLine();

			String[] partes = cpf.split("\\.");
			String[] partes2 = partes[2].split("-");

			System.out.println(partes[0]);
			System.out.println(partes[1]);
			System.out.println(partes2[0]);
			System.out.println(partes2[1]);
		}
	}

}
