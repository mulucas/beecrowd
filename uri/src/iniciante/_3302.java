package iniciante;

import java.util.Scanner;

public class _3302 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int tamanho = sc.nextInt();
        
        int[] vetor = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = sc.nextInt();
        }
        
        for (int i = 0; i < tamanho; i++) {
            System.out.println("resposta "+(i+1)+": "+ vetor[i]);
        }
	}

}
