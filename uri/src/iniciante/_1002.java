package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _1002 {

	public static void main(String[] args) {

		DecimalFormat formatador = new DecimalFormat("0.0000");

		Scanner teclado = new Scanner(System.in);
		double raio = teclado.nextDouble();
		double area = 3.14159 * (raio * raio);
		formatador.format(area);
		System.out.println("A=" + formatador.format(area));
	}
}
