package iniciante;

import java.util.Scanner;

public class _3140 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder conteudoHtml = new StringBuilder();
		boolean dentroDoBody = false;
		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			if (linha.contains("<body>")) {
				dentroDoBody = true;
				continue;
			}
			if (linha.contains("</body>")) {
				dentroDoBody = false;
				break;
			}
			if (dentroDoBody) {
				conteudoHtml.append(linha);
				conteudoHtml.append(System.lineSeparator());
			}
		}
		System.out.print(conteudoHtml.toString());
	}

}
