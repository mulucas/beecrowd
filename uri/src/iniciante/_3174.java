package iniciante;

import java.io.IOException;
import java.util.Scanner;
public class _3174 {

    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int horasBonecos = 0, horasArquitetos = 0, horasMusicos = 0, horasDesenhistas = 0;
        for (int i = 0; i < n; i++) {
            String nome = teclado.next();
            String grupo = teclado.next();
            int horasInformadas = teclado.nextInt();

            if (grupo.contains("bonecos")){
                horasBonecos += horasInformadas;
            } else if (grupo.contains("arquitetos")) {
                horasArquitetos += horasInformadas;
            } else if (grupo.contains("musicos")) {
                horasMusicos += horasInformadas;
            } else if (grupo.contains("desenhistas")) {
                horasDesenhistas += horasInformadas;
            }
        }
        System.out.println((horasBonecos/8)+(horasArquitetos/4)+(horasMusicos/6)+(horasDesenhistas/12));

    }

}