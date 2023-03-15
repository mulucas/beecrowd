package iniciante;

import java.util.Scanner;

public class _1933 {

	 static Scanner teclado = new Scanner(System.in);

		static int qualCartao(int a, int b){
			if(b>a)
				 return b;
			return a;
		}
		public static void main(String[] args){
			System.out.println(qualCartao(teclado.nextInt(), teclado.nextInt()));
		}
	 

}
