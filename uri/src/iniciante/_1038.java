package iniciante;

import java.util.Scanner;

public class _1038 {

	public static void main(String[] args) {
		int codigo=0, quantidade=0;
		float preco = 0;
		
		Scanner teclado = new Scanner(System.in);
		codigo = teclado.nextInt();
		quantidade = teclado.nextInt();
		if (codigo == 1) {
			preco  = (float) (4.00 * quantidade);
		}else if (codigo == 2) {
			preco  = (float) (4.50 * quantidade);
		}else if (codigo == 3) {
			preco  = (float) (5.00 * quantidade);
		}else if (codigo == 4) {
			preco  = (float) (2.00 * quantidade);
		}else if (codigo == 5) {
			preco  = (float) (1.50 * quantidade);
		}
		System.out.printf("Total: R$ %.2f\n",preco);
	}

}
