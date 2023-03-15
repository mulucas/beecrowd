package iniciante;

import java.util.Scanner;
import java.util.Objects;

public class _1914 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int n = teclado.nextInt();
		String nome1, nome2, escolha1, escolha2;
		int num1, num2;
		boolean res;
		while (n-- > 0) {
			nome1 = teclado.next();
			escolha1 = teclado.next();
			nome2 = teclado.next();
			escolha2 = teclado.next();
			num1 = teclado.nextInt();
			num2 = teclado.nextInt();
			res = (num1 + num2) % 2 == 0;
			if (Objects.equals("PAR", escolha1)) {
				if (res)
					System.out.println(nome1);
				else
					System.out.println(nome2);
			} else {
				if (res)
					System.out.println(nome2);
				else
					System.out.println(nome1);
			}
		}
	}

}
