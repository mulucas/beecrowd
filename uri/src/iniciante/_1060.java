package iniciante;

import java.util.Scanner;

public class _1060 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double nums[] = new double[6];
		int numsPositivos=0;
		for (int i = 0; i < nums.length; i++) {
			nums[i] = teclado.nextDouble();
			if (nums[i]>0) {
				numsPositivos++;
			}
		}
		System.out.print(numsPositivos+" valores positivos");
	}

}
