package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _1017 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int tempo = teclado.nextInt();
		int velocidade = teclado.nextInt();
		double resultado = tempo*velocidade;
		resultado = resultado/12;
		DecimalFormat formatador = new DecimalFormat("0.000");
		String x = formatador.format(resultado);
		
		System.out.println(x);

	}

}
