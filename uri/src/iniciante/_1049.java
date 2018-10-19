package iniciante;

import java.util.Scanner;

public class _1049 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String palavra = teclado.next();
		String palavra1 = teclado.next();
		String palavra2 = teclado.next();
		if (palavra.equals("vertebrado") && palavra1.equals("ave") && palavra2.equals("carnivoro")) {
			System.out.println("aguia");
		}
		if (palavra.equals("vertebrado") && palavra1.equals("ave") && palavra2.equals("onivoro")) {
			System.out.println("pomba");
		}
		if (palavra.equals("vertebrado") && palavra1.equals("mamifero") && palavra2.equals("onivoro")) {
			System.out.println("homem");
		}
		if (palavra.equals("vertebrado") && palavra1.equals("mamifero") && palavra2.equals("herbivoro")) {
			System.out.println("vaca");
		}
		if (palavra.equals("invertebrado") && palavra1.equals("inseto") && palavra2.equals("hematofago")) {
			System.out.println("pulga");
		}
		if (palavra.equals("invertebrado") && palavra1.equals("inseto") && palavra2.equals("herbivoro")) {
			System.out.println("lagarta");
		}
		if (palavra.equals("invertebrado") && palavra1.equals("anelideo") && palavra2.equals("hematofago")) {
			System.out.println("sanguessuga");
		}
		if (palavra.equals("invertebrado") && palavra1.equals("anelideo") && palavra2.equals("onivoro")) {
			System.out.println("minhoca");
		}
	}
}