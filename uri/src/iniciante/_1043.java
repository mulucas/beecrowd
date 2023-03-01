package iniciante;

import java.util.Scanner;

public class _1043 {

	public static void main(String[] args) {
		float A, B, C, areaTraphisium, perimeterTriangle;

		Scanner teclado = new Scanner(System.in);
		A = teclado.nextFloat();
		B = teclado.nextFloat();
		C = teclado.nextFloat();

		if ((A < (float) (B + C)) && (B < (float) (A + C)) && (C < (float) (B + A))) {
			perimeterTriangle = A + B + C;
			System.out.printf("Perimetro = %.1f\n", perimeterTriangle);

		} else {
			areaTraphisium = ((A + B) * C) / 2;
			System.out.printf("Area = %.1f\n", areaTraphisium);
		}
	}

}
