package iniciante;

import java.util.Scanner;
import java.util.Locale;

public class _2765 {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);

		String[] a = new String[4];
		a = sc.nextLine().split(",");
		System.out.printf("%s\n%s\n", a[0], a[1]);
		sc.close();
	}
}
