package iniciante;

import java.util.Scanner;

public class _1019 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int tempo = teclado.nextInt();
		boolean a =true;
		if (tempo<60) {
			System.out.println("0:0:"+tempo);
		}else{
			int minutos=0,horas=0;
			if (tempo>=60&&tempo<3600) {
				while (a) {
					minutos++;
					tempo=tempo-60;
					if (tempo>=60&&tempo<3600) {
						a=true;
					}else {
						a=false;
					}
				}
				System.out.println(horas+":"+minutos+":"+tempo);
			}
			else if (tempo>3600) {
				do {
					tempo=tempo-3600;
					horas++;
				} while (tempo>3600);
				while (a) {
					minutos++;
					tempo=tempo-60;
					if (tempo>=60&&tempo<3600) {
						a=true;
					}else {
						a=false;
					}
				}
				System.out.println(horas+":"+minutos+":"+tempo);
			}
		}
	}

}
