package iniciante;

import java.util.Scanner;

public class _1005 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		float x = teclado.nextFloat();
		float y = teclado.nextFloat();

		float soma = (float) (((x * 3.5) + (y * 7.5)) / 11);

		System.out.printf("MEDIA = %.5f%n", soma);

	}

}
