package iniciante;

import java.util.Scanner;

public class _1930 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int tomada1 = teclado.nextInt();
		int tomada2 = teclado.nextInt();
		int tomada3 = teclado.nextInt();
		int tomada4 = teclado.nextInt();

		int resultado = (tomada1 + tomada2 + tomada3 + tomada4) - 3;

		System.out.println(resultado);
	}

}
