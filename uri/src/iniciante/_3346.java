import java.io.IOException;
import java.util.Scanner;
public class _3346 {

    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);
        double anoUm = teclado.nextDouble();
        double anoDois = teclado.nextDouble();

        double resultado = ((1 + (anoUm / 100)) * (1 + (anoDois / 100)) - 1) * 100;

        System.out.printf("%.6f%n", resultado);

    }

}