package iniciante;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class montarReadme {
	public static void main(String[] args) {
//		int n = 1500;
//		for (int i = 1; i <= 500; i++) {
//			System.out.print("["+n+"](https://www.beecrowd.com.br/judge/pt/problems/view/"+n+") | [resposta](https://github.com/mulucas/Uri-Online-Judge/blob/master/uri/src/iniciante/_"+n+".java) |");
//			n++;
//			if(i % 4 == 0) {
//				System.out.println();
//			}
//		}
		contadorDeCaracteres("C:/Users/lukas/Documents/URI/RESPOSTADEOUTRASOLUCAO.txt");
		contadorDeCaracteres("C:/Users/lukas/Documents/URI/RESPOSTADAMINHASOLUCAO.txt");

		//contadorDeCaracteresPorlinha("C:/Users/lukas/Documents/URI/RESPOSTADEOUTRASOLUCAO.txt");
		//contadorDeCaracteresPorlinha("C:/Users/lukas/Documents/URI/RESPOSTADAMINHASOLUCAO.txt");

	}

	public static void contadorDeCaracteresPorlinha(String caminho) {
		try {
			// Lê o arquivo de texto com BufferedReader
			BufferedReader reader = new BufferedReader(new FileReader(caminho, StandardCharsets.UTF_8));
			String line;
			int lineNumber = 1;
			while ((line = reader.readLine()) != null) {
				// Conta os caracteres em cada linha
				int count = line.length();
				System.out.println("Linha " + lineNumber + ": " + count + " caracteres");
				lineNumber++;
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void contadorDeCaracteres(String caminho) {
		int count = 0;
		try {
			// Lê o arquivo de texto com BufferedReader
			BufferedReader reader = new BufferedReader(new FileReader(caminho, StandardCharsets.UTF_8));
			String line;
			while ((line = reader.readLine()) != null) {
				// Conta os caracteres em cada linha
				count += line.length();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("O arquivo tem " + count + " caracteres.");
	}
}
