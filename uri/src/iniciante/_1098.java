package iniciante;

public class _1098 {

	public static void main(String[] args) {
		double l=0.0;
		double j=1;
		int o=0;
		double i =0,m=0.2;
		while(i<=2) {
			l=l+m;
			while (o<3) {
				System.out.println("I="+i+" J="+j);
				o++;j++;
			}
			o=0;
			i=i+m;
			j=1;
			j=j+l;
			//System.out.println(i);
		}
	}

}
