package iniciante;

import java.util.Scanner;

public class _1021 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double notas = teclado.nextDouble();
		double valorInicial = notas;
		int cem = 0, cin = 0, vin = 0, dez = 0, cinco = 0, dois = 0;
		while (notas >= 100) {
			cem++;
			notas = notas - 100;
		}
		while (notas >= 50) {
			cin++;
			notas = notas - 50;
		}
		while (notas >= 20) {
			vin++;
			notas = notas - 20;
		}
		while (notas >= 10) {
			dez++;
			notas = notas - 10;
		}
		while (notas >= 5) {
			cinco++;
			notas = notas - 5;
		}
		while (notas >= 2) {
			dois++;
			notas = notas - 2;
		}
		int moUmReal = 0;
		while (notas >= 1) {
			notas--;
			moUmReal++;

		}
		int parteInteira = (int) valorInicial;
		double parteFrassi = valorInicial - parteInteira;
		int moCinq = 0, moVin = 0, moDez = 0, moCinco = 0, moUm = 0;
		while (parteFrassi >= 0.50) {
			moCinq++;
			parteFrassi = parteFrassi - 0.50;
		}
		while (parteFrassi >= 0.25) {
			moVin++;
			parteFrassi = parteFrassi - 0.25;
		}
		while (parteFrassi >= 0.10) {
			moDez++;
			parteFrassi = parteFrassi - 0.10;
		}
		while (parteFrassi >= 0.05) {
			moCinco++;
			parteFrassi = parteFrassi - 0.05;
		}
		while (parteFrassi >= 0.01) {
			moUm++;
			parteFrassi = parteFrassi - 0.01;
		}
		System.out.println(parteFrassi);
		System.out.println("NOTAS:");
		System.out.println(cem + " nota(s) de R$ 100.00");
		System.out.println(cin + " nota(s) de R$ 50.00");
		System.out.println(vin + " nota(s) de R$ 20.00");
		System.out.println(dez + " nota(s) de R$ 10.00");
		System.out.println(cinco + " nota(s) de R$ 5.00");
		System.out.println(dois + " nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println(moUmReal + " moeda(s) de R$ 1.00");
		System.out.println(moCinq + " moeda(s) de R$ 0.50");
		System.out.println(moVin + " moeda(s) de R$ 0.25");
		System.out.println(moDez + " moeda(s) de R$ 0.10");
		System.out.println(moCinco + " moeda(s) de R$ 0.05");
		System.out.println(moUm + " moeda(s) de R$ 0.01");
	}
}
