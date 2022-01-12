package algorithms;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}

		plusMinus(arr);

		in.close();
	}

	public static void plusMinus(int[] arr) {
		double qtdNegativos = 0, qtdPositivos = 0, qtdZeros = 0;
		int base = arr.length;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				qtdNegativos++;
			} else if (arr[i] == 0) {
				qtdZeros++;
			} else {
				qtdPositivos++;
			}
		}

		System.out.println(String.format("%.6f", qtdPositivos / base).replace(",", "."));
		System.out.println(String.format("%.6f", qtdNegativos / base).replace(",", "."));   
		System.out.println(String.format("%.6f", qtdZeros/base).replace(",", "."));
				
	}

}
