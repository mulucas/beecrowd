package iniciante;

import java.util.Scanner;

public class _3303 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String palavra = sc.nextLine();

		if (palavra.length() >= 10) {
			System.out.println("palavrao");
		} else {
			System.out.println("palavrinha");
		}
	}

}
