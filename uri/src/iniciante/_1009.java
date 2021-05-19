package iniciante;
import java.text.DecimalFormat;
import java.util.Scanner;
public class _1009 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		String nome = teclado.nextLine();
		double salario = teclado.nextDouble();
		double venda = teclado.nextDouble();
		venda = (venda*0.15)+salario;
		System.out.println("TOTAL = R$ "+formatador.format(venda));

	}

}
