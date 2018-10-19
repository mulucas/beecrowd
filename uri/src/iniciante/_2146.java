package iniciante;

import java.util.Scanner;

public class _2146 {

	public static void main(String[] args) {
		Scanner tecaldo = new Scanner(System.in);
		while(tecaldo.hasNext()){
			int dd = tecaldo.nextInt();
			System.out.println(dd-1);
		}
		tecaldo.close();
	}

}
