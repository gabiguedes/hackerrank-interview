package algorithms;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		in.close();

		staircase(n);
	}

	public static void staircase(int n) {
		StringBuilder escada = new StringBuilder();
		
		for(int i=1; i<=n; i++) {
			escada.append(espacos(n-i));
			escada.append(quantidadeDeDegrau(i));
			escada.append("\n");
		}
		
		System.out.println(escada);
	}
	
	static String quantidadeDeDegrau(int tamanho) {
		String degrau = "";
		
		for(int i=0; i<tamanho; i++) {
			degrau = degrau + "#";
		}
		
		return degrau;
	}
	
	static String espacos(int tamanho) {
		String espaco = "";
		for (int i = 0; i < tamanho; i++) {
			espaco = espaco + " ";
		}

		return espaco;
	}

}
