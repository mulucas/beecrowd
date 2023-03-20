package iniciante;

import java.util.Scanner;

public class _2139 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int ara[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 25 };
		int mes, dia, diasQueFaltam;
		while (teclado.hasNextInt()) {
			mes = teclado.nextInt();
			dia = teclado.nextInt();
			if (mes == 12) {
				if (dia > 25) {
					System.out.println("Ja passou!");
				} else if (dia == 25) {
					System.out.println("E natal!");
				} else if (dia == 24) {
					System.out.println("E vespera de natal!");
				} else {
					System.out.println("Faltam " + (ara[11] - dia) + " dias para o natal!");
				}
			} else {
				diasQueFaltam = ara[mes - 1] - dia;
				for (int i = mes; i < 12; i++) {
					diasQueFaltam += ara[i];
				}
				System.out.println("Faltam " + diasQueFaltam + " dias para o natal!");
			}
		}
	}

}
