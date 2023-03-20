package iniciante;

import java.util.Scanner;

public class _2160 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String nome = teclado.nextLine();

		if (nome.length() < 81)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
