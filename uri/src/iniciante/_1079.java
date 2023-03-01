package iniciante;

import java.util.Scanner;

public class _1079 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
 		int x = teclado.nextInt();
		float a,b,c,r;
 		for(int i=0;i<x;i++){
 			a = teclado.nextFloat();
			b = teclado.nextFloat();
			c = teclado.nextFloat();
 			r = ((a*2f)+(b*3f)+(c*5f))/10f;
			System.out.printf("%.1f\n",r);
 		}
	}

}
