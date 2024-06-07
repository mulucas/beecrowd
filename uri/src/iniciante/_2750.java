package iniciante;

public class _2750 {

	public static void main(String[] args) {
		String tracos = "---------------------------------------";
		System.out.println(tracos);
		System.out.println("|  decimal  |  octal  |  Hexadecimal  |");
		System.out.println(tracos);
		for (int i = 0; i < 8; i++) {
			System.out.println("|      " + i + "    |    " + i + "    |       " + i + "       |");
		}
		char vetor[] = { '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		for (int i = 8; i < 16; i++) {
			if (i > 9) {
				System.out.println("|     " + i + "    |   " + (i+2) + "    |       " + vetor[i - 8] + "       |");
			} else {
				System.out.println("|      " + i + "    |   " + (i+2) + "    |       " + vetor[i - 8] + "       |");
			}
		}
		System.out.println(tracos);
	}
}
