package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class _3214 {
	public static void main(String[] args) throws IOException {
		 
        Scanner teclado = new Scanner(System.in);
        int E = teclado.nextInt();
        int F = teclado.nextInt();
        int C = teclado.nextInt();

        int garrafasVazias = E + F;
        int totalRefrigerantes = 0;
        while (garrafasVazias >= C) {
            int refrigerantes = garrafasVazias / C;
            totalRefrigerantes += refrigerantes;
            garrafasVazias = garrafasVazias % C + refrigerantes;
        }
        System.out.println(totalRefrigerantes);
 
    }
}
