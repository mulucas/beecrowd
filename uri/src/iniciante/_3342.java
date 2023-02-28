package iniciante;

import java.util.Scanner;

public class _3342 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int casasBrancas = 0;
		int casasPretas = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i + j) % 2 == 0) {
					casasBrancas++;
				} else {
					casasPretas++;
				}
			}
		}
		System.out.println(casasBrancas + " casas brancas e " + casasPretas + " casas pretas");

	}

}
