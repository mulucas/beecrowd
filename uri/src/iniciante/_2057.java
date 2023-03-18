package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class _2057 {

	public static void main(String[] args) throws IOException {

		Scanner teclado = new Scanner(System.in);
		int part = teclado.nextInt(), dur = teclado.nextInt(), fuso = teclado.nextInt();
		int chegada = (part + dur + fuso) % 24;
		if (chegada < 0)
			chegada += 24;
		System.out.println(chegada);

	}

}