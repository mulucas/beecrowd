package iniciante;

import java.util.Scanner;

public class _2152 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int casosTeste = teclado.nextInt();
		for (int i = 1; i <= casosTeste; i++) {
			int hora = teclado.nextInt();
			int minuto = teclado.nextInt();
			int ocorrencia = teclado.nextInt();

			String situacao = ocorrencia == 0 ? "fechou" : "abriu";
			System.out.printf("%02d:%02d - A porta %s!\n", hora, minuto, situacao);
		}
	}

}
