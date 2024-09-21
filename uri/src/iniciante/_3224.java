package iniciante;

import java.io.IOException;
import java.util.Scanner;
public class _3224 {

    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);
        String primeiroAh = teclado.next();
        String segundoAh = teclado.next();
        if(primeiroAh.length() >= segundoAh.length()){
            System.out.println("go");
        }else{
            System.out.println("no");
        }

    }

}