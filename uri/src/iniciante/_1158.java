package iniciante;

import java.util.Scanner;

public class _1158 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        int casos = teclado.nextInt();
        int x, y;
        
        for (int i = 0; i < casos; i++) {
            x = teclado.nextInt();
            y = teclado.nextInt();
            if (x % 2 == 0) {
                x++;
            }
            System.out.println((x * y) + (y*(y-1)));
        }
	}

}
