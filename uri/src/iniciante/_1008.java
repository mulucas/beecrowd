package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _1008 {

	public static void main(String[] args) {
		int nFun, horas;
		double sal;
		
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		Scanner teclado = new Scanner(System.in);
		nFun = teclado.nextInt();
		horas = teclado.nextInt();
		sal = teclado.nextDouble();
		
		sal = horas*sal;
		
		System.out.println("NUMBER = "+nFun);
		System.out.println("SALARY = U$ "+formatador.format(sal));
	}

}
