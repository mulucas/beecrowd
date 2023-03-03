package iniciante;

import java.util.Scanner;

public class _1154 {

	public static void main(String[] args) {
		int age;
		int totalNum = 0, totalAge = 0;
		float ageAverage;
		Scanner teclado = new Scanner(System.in);
		int i = 1;
		while (((age = teclado.nextInt()) >= 0)) {
			totalAge += age;
			totalNum += i;
		}
		ageAverage = (float) ((float) totalAge / (totalNum));
		System.out.printf("%.2f\n", ageAverage);
	}

}
