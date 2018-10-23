package iniciante;

public class _2747 {

	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
			if (i == 0 || i==5) {
				if (i==5) {
					System.out.print("\n|");				
					for (int r = 0; r < 37; r++) {
						System.out.print(" ");
					}
					System.out.print("|\n");
				}
				for (int j = 0; j < 39; j++) {
					System.out.print("-");
				}
			}else {
				System.out.print("\n|");				
				for (int r = 0; r < 37; r++) {
					System.out.print(" ");
				}
				System.out.print("|");
			}
		}
	}
}
