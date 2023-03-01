package iniciante;

import java.util.Scanner;

public class _2762 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String numero = teclado.nextLine();

		String[] partes = numero.split("\\.");
		String parteInteira = partes[0];
		String parteFracionaria = partes[1];
		String numeroInvertido = parteFracionaria + "." + parteInteira;

		numeroInvertido = removerZerosAEsquerda(numeroInvertido);

		System.out.println(numeroInvertido);
	}

	public static String removerZerosAEsquerda(String numero) {
		int i = 0;
		while (i < numero.length() && numero.charAt(i) == '0') {
			i++;
		}
		// "lucas".substring(2) = "cas"
		return (i == numero.length()) ? "0" : numero.substring(i);

	}

}
