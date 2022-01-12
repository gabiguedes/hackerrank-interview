package arrays;

import java.util.Scanner;

public class LeftRotation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tamanho = in.nextInt(), desloca = in.nextInt();
		int[] arr = new int[tamanho];

		for (int i = 0; i < tamanho; i++) {
			arr[i] = in.nextInt();
		}

		int[] result = rotateLeft(desloca, arr);

		for (int i : result) {
			System.out.print(i + " ");
		}

		in.close();
	}

	public static int[] rotateLeft(int d, int[] arr) {
		int size = arr.length;
		int[] rotacionados = new int[size];
		
		System.arraycopy(arr, d, rotacionados, 0, size-d);
		System.arraycopy(arr, 0, rotacionados, size-d, d);
		
		return rotacionados;

	}

}
