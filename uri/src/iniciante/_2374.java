package iniciante;

import java.util.Scanner;

public class _2374 {

	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		byte pressaoDesejada = teclado.nextByte();
		byte pressaoLida = teclado.nextByte();
		System.out.println(pressaoDesejada - pressaoLida);
	}
}
