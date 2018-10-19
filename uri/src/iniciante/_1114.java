package iniciante;

import java.util.Scanner;

public class _1114 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		while (true) {
			n = teclado.nextInt();
			if (n == 2002) {
				System.out.println("Acesso Permitido");
				break;
			}else {
				System.out.println("Senha Invalida");
			}
		}
	}

}
