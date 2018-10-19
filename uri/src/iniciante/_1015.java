package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _1015 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double x1 = teclado.nextDouble();
		double y1 = teclado.nextDouble();
		double x2 = teclado.nextDouble();
		double y2 = teclado.nextDouble();
		
		double resultado = Math.sqrt(Math.pow((x2-x1), 2)+(Math.pow((y2-y1), 2)));
		DecimalFormat formatador = new DecimalFormat("0.0000");
		String x = formatador.format(resultado);
		
		System.out.println(x);
	}

}
