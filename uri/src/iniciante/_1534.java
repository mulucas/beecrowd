package iniciante;

import java.io.*;

public class _1534 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String linha;
		int matriz[][];
		while ((linha = br.readLine()) != null) {
			int numero = Integer.parseInt(linha);
			matriz = new int[numero][numero];
			int paraDois = numero - 1;
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					if (i == j) {
						matriz[i][j] = 1;
					}
					matriz[i][paraDois] = 2;
					if (matriz[i][j] == 0) {
						matriz[i][j] = 3;
					}
					System.out.print(matriz[i][j]);
				}
				paraDois--;
				System.out.println();
			}
		}
	}

}
