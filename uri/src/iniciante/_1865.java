package iniciante;

import java.util.Objects;
import java.util.Scanner;

public class _1865 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int n = teclado.nextInt(), forca;
		while (n-- > 0) {
			String nome = teclado.next();
			forca = teclado.nextInt();
			if (Objects.equals(nome, "Thor"))
				System.out.println("Y");
			else
				System.out.println("N");
		}
	}

}
