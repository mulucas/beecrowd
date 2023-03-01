package iniciante;

import java.util.Scanner;

public class _1073 {

	public static void main(String[] args) {
		int N;
		Scanner teclado =new Scanner(System.in);
		N =teclado.nextInt();
		
		for (int i = 2; i <= N; i+= 2) {
			System.out.print(i+"^2 = "+(i*i)+"\n");
		}
	}

}
