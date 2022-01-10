package arrays;

import java.io.IOException;
import java.util.Scanner;

public class ArraysDS {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}

		int[] resp = reverseArray(arr);

		for (int i = 0; i < resp.length; i++) {
			System.out.print(resp[i] + " ");
		}

		in.close();
	}

	public static int[] reverseArray(int[] arr) {
		int[] reverse = new int[arr.length];
		int size = arr.length;

		for (int i = size - 1, j = 0; i >= 0; i--, j++) {
			reverse[j] = arr[i];
		}

		return reverse;
	}

}
