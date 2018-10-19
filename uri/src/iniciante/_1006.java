package iniciante;

import java.util.Scanner;

public class _1006 {

	public static void main(String[] args) {
		
		double A,B,C;
		Scanner teclado = new Scanner(System.in);
		A = teclado.nextDouble();
		B = teclado.nextDouble();
		C = teclado.nextDouble();
		
		double MEDIA = ((A*2)+(B*3)+(C*5))/10;
		
		String med = String.format("MEDIA = %,.1f", MEDIA);
		
		System.out.println(med);
	}

}
