package iniciante;

import java.util.Scanner;

public class _1075 {

	public static void main(String[] args) {
		int N;
		Scanner teclado =new Scanner(System.in);
		
		N =teclado.nextInt();
		for (int i = 0; ((N*i) + 2) < 10000; i++) {
			System.out.print((N*i) + 2+"\n");
		}
	}

}
