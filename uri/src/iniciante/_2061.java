package iniciante;

import java.util.Scanner;

public class _2061 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int nInicial = teclado.nextInt();
		int nLinhas = teclado.nextInt();
		String linha = "";
		for (int i = 0; i < nLinhas; i++) {
			linha = teclado.next();
			if (linha.equals("fechou")) {
				nInicial++;
			} else {
				nInicial--;
			}
		}
		System.out.println(nInicial);
	}

}
