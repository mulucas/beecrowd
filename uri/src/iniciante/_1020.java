package iniciante;

import java.util.Scanner;

public class _1020 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dias = teclado.nextInt();
		int ano=0,mes=0;
		while (dias>=365) {
			ano++;
			dias=dias-365;
		}
		while (dias>=30) {
			mes++;
			dias=dias-30;
		}
		System.out.println(ano+" ano(s)");
		System.out.println(mes+" mes(es)");
		System.out.println(dias+" dia(s)");
	}

}
