package iniciante;

import java.util.Scanner;

public class _2936 {

	private static Scanner teclado;

	public static void main(String[] args) {
		System.out.println(2-9-17);
		teclado = new Scanner(System.in);
		int porcao, total;
		porcao = teclado.nextInt();
		total = porcao*300;

		porcao = teclado.nextInt();
		total += porcao*1500;

		porcao = teclado.nextInt();
		total += porcao*600;

		porcao = teclado.nextInt();
		total += porcao*1000;

		porcao = teclado.nextInt();
		total += porcao*150;
		
		System.out.println(total+225);
	}
}
