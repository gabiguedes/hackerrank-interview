package algorithms;

import java.util.Scanner;

public class AveryBigSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}

		System.out.println(aVeryBigSum(arr));

		in.close();
	}

	public static long aVeryBigSum(int[] arr) {
		long soma = 0;
		int max = Integer.MAX_VALUE;

		while (soma < max) {
			for (int i = 0; i < arr.length; i++) {
				soma += arr[i];
			}
		}
		return soma;

	}

}
