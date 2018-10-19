package iniciante;

import java.util.Scanner;

public class _1007 {

	public static void main(String[] args) {

		int A,B,C,D,DIFERENCA;
		Scanner teclado = new Scanner(System.in);
		A =teclado.nextInt();
		B=teclado.nextInt();
		C=teclado.nextInt();
		D=teclado.nextInt();
		DIFERENCA = ((A * B) - (C * D));
		System.out.println("DIFERENCA = "+DIFERENCA);
	}

}
