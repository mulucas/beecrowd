package iniciante;

import java.util.Scanner;

public class _2344 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

        double nota = teclado.nextDouble();

        char conceito;

        if (nota >= 86) {
            conceito = 'A';
        } else if (nota >= 61) {
            conceito = 'B';
        } else if (nota >= 36) {
            conceito = 'C';
        } else if (nota >= 1) {
            conceito = 'D';
        } else {
            conceito = 'E';
        }

        System.out.println(conceito);
	}

}
