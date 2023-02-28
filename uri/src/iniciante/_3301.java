package iniciante;

import java.util.Scanner;

public class _3301 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int H = teclado.nextInt();
		int Z = teclado.nextInt();
		int L = teclado.nextInt();

		if((Z > H || Z > L) && (Z < L || Z < H))
			System.out.println("zezinho");
		else if((L > H || L > Z) && (L < H || L < Z))
			System.out.println("luisinho");
		else
			System.out.println("huguinho");
	}

}
