package iniciante;

import java.io.IOException;

import java.util.Scanner;

public class _2388 {

    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);
        int linhas = teclado.nextInt();
        int valorFinal = 0;
        for (int i = 0; i < linhas; i++) {
            double tempo = teclado.nextDouble();
            double velocidade = teclado.nextDouble();
            valorFinal += tempo*velocidade;
        }
        System.out.println(valorFinal);

    }

}