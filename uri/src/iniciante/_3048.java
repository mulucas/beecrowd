package iniciante;

import java.io.IOException;

import java.util.Scanner;

public class _3048 {

    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int numeroDaVez = teclado.nextInt();
        int numeroAnteriorSequencial = numeroDaVez;
        int quantidade = 1;
        for (int i = 0; i < n-1; i++) {
            numeroDaVez = teclado.nextInt();
            if (numeroDaVez!=numeroAnteriorSequencial){
                quantidade++;
                numeroAnteriorSequencial = numeroDaVez;
            }
        }
        System.out.println(quantidade);
    }

}