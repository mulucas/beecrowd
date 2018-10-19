package iniciante;

public class _1096 {

	public static void main(String[] args) {
		int i=1;
		int j=7,o=0;
		for (int k = 0; k < 5; k++) {
			while (o<3) {
				System.out.println("I="+i+" J="+j);
				j--;o++;
			}
			o=0;
			i=i+2;
			j=7;
		}
	}
}
