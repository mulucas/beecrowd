package iniciante;

import java.util.Scanner;

public class _1963 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double valor = teclado.nextDouble();
		double valor2 = teclado.nextDouble();
		
		double resultado = ((valor2-valor)/valor)*100;
			
		System.out.printf("%.2f%%\n",resultado);
	}

}
