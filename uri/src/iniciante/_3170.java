package iniciante;

import java.util.Scanner;

public class _3170 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int bolinhas = teclado.nextInt();
		int galhos = teclado.nextInt();
		int resultado = (galhos / 2) - bolinhas;
		if ((galhos / 2) == bolinhas || resultado < 0) {
			System.out.println("Amelia tem todas bolinhas!");
		} else {
			if (galhos / 2 == 0)
				galhos--;
			System.out.println("Faltam " + resultado + " bolinha(s)");
		}
	}

}
