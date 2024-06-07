package iniciante;

import java.util.Scanner;

public class _1557 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextByte();
        while(numero != 0) {

            int valorInicio = 1;
            //valor que multiplicado por ele mesmo vai dar o ultimo numero da matriz
            int ultimoNumero = (int) Math.pow(2, numero-1);
            int larguraCampo = Integer.toString(ultimoNumero*ultimoNumero).length();

            for (int linha = 0; linha < numero; linha++) {
                int valor = valorInicio;
                for (int coluna = 0; coluna < numero; coluna++) {
                    if (coluna > 0)
                        System.out.print(" ");

                    System.out.printf("%" + (larguraCampo) + "d", valor);
                    valor = valor * 2;

                    if (coluna==0)
                        valorInicio = valor;
                }
                System.out.println();
            }
            System.out.println();
            numero = teclado.nextByte();
        }
    }
}
