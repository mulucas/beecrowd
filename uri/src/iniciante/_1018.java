package iniciante;

import java.util.Scanner;

public class _1018 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int notas = teclado.nextInt();
		int valorInicial = notas;
		int cem=0, cin=0,vin=0,dez=0,cinco=0,dois=0,um=0;
		boolean a = true;
		if ((notas>100) && (notas!=100)) {
			while (a) {
				cem++;
				notas = notas-100;
				if (notas>99) {
					a=true;
				}else {
					a=false;
				}
			}
		}
		a=true;
		if (notas>49) {
			while (a) {
				cin++;
				notas = notas-50;
				if (notas>49) {
					a=true;
				}else {
					a=false;
				}
			}
		}
		a=true;
		if (notas>19) {
			while (a) {
				vin++;
				notas = notas-20;
				if (notas>19) {
					a=true;
				}else {
					a=false;
				}
			}
		}a=true;
		if (notas>9) {
			while (a) {
				dez++;
				notas = notas-10;
				if (notas>9) {
					a=true;
				}else {
					a=false;
				}
			}
		}a=true;
		if (notas>4) {
			while (a) {
				cinco++;
				notas = notas-5;
				if (notas>4) {
					a=true;
				}else {
					a=false;
				}
			}
		}a=true;
		if (notas>=2) {
			while (a) {
				dois++;
				notas = notas-2;
				if (notas>=2) {
					a=true;
				}else {
					a=false;
				}
			}
		}a=true;
		if (notas==1) {
			while (a) {
				um++;
				notas = notas-1;
				if (notas==1) {
					a=true;
				}else {
					a=false;
				}
			}
		}
		System.out.println(valorInicial);
		System.out.println(cem+" nota(s) de R$ 100,00");
		System.out.println(cin+" nota(s) de R$ 50,00");
		System.out.println(vin+" nota(s) de R$ 20,00");
		System.out.println(dez+" nota(s) de R$ 10,00");
		System.out.println(cinco+" nota(s) de R$ 5,00");
		System.out.println(dois+" nota(s) de R$ 2,00");
		System.out.println(um+" nota(s) de R$ 1,00");
	}
}
