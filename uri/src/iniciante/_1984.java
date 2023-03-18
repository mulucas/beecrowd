package iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1984 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException{
		String entrada = br.readLine();
		entrada = new StringBuilder(entrada).reverse().toString();
		System.out.println(entrada);
	}

}
