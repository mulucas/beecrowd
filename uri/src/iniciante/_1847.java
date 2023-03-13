package iniciante;

import java.util.Scanner;

public class _1847 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int temp1 = teclado.nextInt();
		int temp2 = teclado.nextInt();
		int temp3 = teclado.nextInt();

		int d = temp3 - temp2;
		int d1 = temp2 - temp1;
		int d2 = temp1 - temp2;
		int d3 = temp2 - temp3;

		if ((temp1 > temp2 && temp2 <= temp3) || (temp1 > temp2 && temp2 > temp3 && d2 > d3)
				|| (temp1 <= temp2 && temp2 < temp3 && d1 <= d) || (temp1 == temp2 && temp2 < temp3)) {
			System.out.println(":)");
		} else {
			System.out.println(":(");
		}
	}

}
