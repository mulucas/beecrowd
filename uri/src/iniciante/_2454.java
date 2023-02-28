package iniciante;

import java.util.Scanner;

public class _2454 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		byte P = teclado.nextByte();
		byte R = teclado.nextByte();
		
		if(P == 0)
			System.out.println("C");
		else
			if(R == 0)
				System.out.println("B");
			else
				System.out.println("A");
		
	}

}
