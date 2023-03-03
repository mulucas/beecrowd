package iniciante;

import java.util.Scanner;

public class _1153 {

	public static void main(String[] args) {
		int N, fact = 1;
		N = new Scanner(System.in).nextInt();
		for (int i = 1; i <= N; i++) {
			fact *= i;
		}
		System.out.print(fact + "\n");
	}

}
