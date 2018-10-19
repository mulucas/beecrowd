package iniciante;

import java.util.Scanner;

public class _1144 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		int a=1,b=1,c=1,j=0,m=2,s=6;
		for (int i = 1; i <= n*2; i++) {
			System.out.println(a+" "+b+" "+c);
			if (j==1) {
				a++;
				j--;
			}else {
				j++;
			}
			if (i%2==0) {
				b=b+m;
				m=m+2;
				c=a*b;
			}else {
				b++;c++;
			}
		}
	}
}
