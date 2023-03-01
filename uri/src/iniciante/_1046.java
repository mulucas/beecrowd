package iniciante;

import java.util.Scanner;

public class _1046 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        int inicio = teclado.nextInt();
        int fim = teclado.nextInt();
        
        if (fim <= inicio) {
            System.out.printf("O JOGO DUROU %d HORA(S)\n", 24 - (inicio - fim));
        } else {
            System.out.printf("O JOGO DUROU %d HORA(S)\n", fim - inicio);
        }
	}

}
