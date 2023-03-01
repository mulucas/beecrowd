package iniciante;

import java.util.Scanner;

public class _1042 {

	public static void main(String[] args) {
		int X, Y, Z, min1, min2 = 0, min3 = 0;
		Scanner teclado = new Scanner(System.in);
		X = teclado.nextInt();
		Y = teclado.nextInt();
		Z = teclado.nextInt();
		min1 = Math.min(X, Math.min(Y, Z));
		if (min1 == X) {
			min2 =Math.min(Y, Z);
			min3 =Math.max(Y, Z);
		}
		if (min1 == Y) {
			min2 =Math.min(X, Z);
			min3 =Math.max(X, Z);
		}
		if (min1 == Z) {
			min2 = Math.min(X, Y);
			min3 = Math.max(X, Y);
		}
		System.out.print(min1+"\n"+min2+"\n"+min3+"\n\n");
		System.out.print(X+"\n"+Y+"\n"+Z+"\n");
	}

}
