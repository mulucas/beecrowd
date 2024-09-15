import java.io.IOException;
import java.util.Scanner;
public class _3209 {

    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        for (int i = 0; i < n; i++) {
            int k = teclado.nextInt();
            int resultado = 1;
            for (int j = 0; j < k; j++) {
                resultado += (teclado.nextInt()-1);
            }
            System.out.println(resultado);
        }

    }

}