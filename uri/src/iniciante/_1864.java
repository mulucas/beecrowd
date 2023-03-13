package iniciante;

import java.util.Scanner;

public class _1864 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		String soren = "LIFE IS NOT A PROBLEM TO BE SOLVED";
		int n = teclado.nextInt();
		for (int i = 0; i < n; i++)
			System.out.print(soren.charAt(i));
		System.out.println("");
	}
}
