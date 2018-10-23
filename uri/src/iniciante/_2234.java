package iniciante;

import java.util.Scanner;

public class _2234 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double n = teclado.nextInt();
		double m = teclado.nextInt();
		
		double resultado = n/m;
		System.out.printf("%.2f" + "\n",resultado);
	}

}
