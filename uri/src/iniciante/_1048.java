package iniciante;

import java.util.Scanner;

public class _1048 {

	public static void main(String[] args) {
		float N,new_salary = 0,earn_Money = 0;
		int parcent = 0;
		Scanner teclado =new Scanner(System.in);
		N =teclado.nextFloat();
		
		if (N >= 0 && N <= 400.00) {
			parcent = 15;
			new_salary = (float) (N + (N * (parcent /100.00)));
			earn_Money = (float) ((N * (parcent /100.00)));
			
		}else if (N >= 400.01 && N <= 800.00) {
			parcent = 12;
			new_salary = (float) (N + (N * (parcent /100.00)));
			earn_Money = (float) ((N * (parcent /100.00)));
		}else if (N >= 800.01 && N <= 1200.00) {
			parcent = 10;
			new_salary = (float) (N + (N * (parcent /100.00)));
			earn_Money = (float) ((N * (parcent /100.00)));
			
		}else if (N >= 1200.01 && N <= 2000.00) {
			parcent = 7;
			new_salary = (float) (N + (N * (parcent /100.00)));
			earn_Money = (float) ((N * (parcent /100.00)));
		}else if (N >= 2000.01) {
			parcent = 4;
			new_salary = (float) (N + (N * (parcent /100.00)));
			earn_Money = (float) ((N * (parcent /100.00)));
		}
		
		System.out.printf("Novo salario: %.2f\n",new_salary);
		System.out.printf("Reajuste ganho: %.2f\n",earn_Money);
		System.out.print("Em percentual: "+parcent+" %\n");

	}

}
