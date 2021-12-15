package sorting;

import java.io.IOException;
import java.util.Scanner;

public class SortingBubbleSort {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
			;
		}

		countSwaps(a);

		in.close();
	}

	public static void countSwaps(int[] a) {
		int n = a.length, contador = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				// Swap adjacent elements if they are in decreasing order
				if (a[i] > a[j]) {
					contador++;
					int aux = a[i];
					a[i] = a[j];
					a[j] = aux;
				}
			}

		}
		
		System.out.println("Array is sorted in " + contador + " swaps.");
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[a.length-1]);
	}

}
