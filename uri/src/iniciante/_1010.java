package iniciante;
import java.text.DecimalFormat;
import java.util.Scanner;
public class _1010 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		double codigo = teclado.nextDouble();
		double qntd = teclado.nextDouble();
		double valor = teclado.nextDouble();
		double codigo1 = teclado.nextDouble();
		double qntd1 = teclado.nextDouble();
		double valor1 = teclado.nextDouble();
		String total = formatador.format((qntd * valor) + (qntd1 * valor1));
		System.out.println("VALOR A PAGAR: R$ " + total);

	}

}
