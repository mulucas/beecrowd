package iniciante;

import java.util.Scanner;

public class _2764 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

        String data = teclado.nextLine();

        String[] partesData = data.split("/");

        String dia = partesData[0];
        String mes = partesData[1];
        String ano = partesData[2];

        System.out.println(mes + "/" + dia + "/" + ano);
        System.out.println(ano + "/" + mes + "/" + dia);
        System.out.println(dia + "-" + mes + "-" + ano);
	}

}
