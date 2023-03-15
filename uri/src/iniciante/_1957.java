package iniciante;

import java.util.Scanner;

public class _1957 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int valor = teclado.nextInt();

		char[] hexa = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		int resto = -1;
		StringBuilder sb = new StringBuilder();

		while (valor > 0) {
			resto = valor % 16;
			valor = valor / 16;
			sb.insert(0, hexa[resto]);
		}

		System.out.println(sb.toString());

	}

}
