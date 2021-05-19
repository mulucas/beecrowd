package iniciante;

import java.io.IOException;
 
import java.util.Scanner;
 
public class _1013 {
 
    public static void main(String[] args) throws IOException {
		Scanner teclado = new Scanner(System.in);
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int c = teclado.nextInt();
				
		System.out.println(Math.max(a,Math.max(b,c))+" eh o maior");
 
    }
 
}