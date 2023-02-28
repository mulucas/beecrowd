package iniciante;

import java.util.Scanner;

public class _2168 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int n = teclado.nextInt();
		int[][] map = new int[n + 1][n + 1];

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				map[i][j] = teclado.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int cameras = 0;
				if (map[i][j] == 1)
					cameras++;
				if (map[i][j + 1] == 1)
					cameras++;
				if (map[i + 1][j] == 1)
					cameras++;
				if (map[i + 1][j + 1] == 1)
					cameras++;
				System.out.print(cameras >= 2 ? "S" : "U");
			}
			System.out.println();
		}
	}

}
