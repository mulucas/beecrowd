package iniciante;

import java.util.Scanner;

public class _2126 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int contadorCasos = 1;
		while (teclado.hasNext()) {
			String sequencia = teclado.nextLine();
			String numero = teclado.nextLine();

			int contador = 0, ultimaOcorrencia = -1;

			// o índice da primeira ocorrência da sequência de caracteres na string
			int indice = numero.indexOf(sequencia);

			// indice diferente de -1, significa que ainda existem sequência de caracteres
			while (indice != -1) {
				contador++;
				ultimaOcorrencia = indice + 1;
				indice = numero.indexOf(sequencia, indice + 1);
			}
			System.out.println("Caso #" + contadorCasos + ":");
			if (ultimaOcorrencia == -1) {
				System.out.println("Nao existe subsequencia");
			} else {
				System.out.println("Qtd.Subsequencias: " + contador);
				System.out.println("Pos: " + ultimaOcorrencia);
			}
			System.out.println("");
			contadorCasos++;
		}
	}

}
