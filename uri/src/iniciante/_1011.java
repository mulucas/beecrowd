package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _1011 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.000");
		double raio = teclado.nextDouble();
		String total = formatador.format((4.0 / 3) * 3.14159 * (raio * raio * raio));
		System.out.println("VOLUME = " + total);

	}

}
