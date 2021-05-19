package iniciante;

import java.io.IOException;

import java.util.Scanner;
import java.text.DecimalFormat;

public class _1014 {

	public static void main(String[] args) throws IOException {

		Scanner leitor = new Scanner(System.in);
		double x = leitor.nextDouble();
		double y = leitor.nextDouble();

		double resul = x / y;

		DecimalFormat df = new DecimalFormat("0.000");
		String resulF = df.format(resul);

		System.out.println(resulF + " km/l");

	}

}
